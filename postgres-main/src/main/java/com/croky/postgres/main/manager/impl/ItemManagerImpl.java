package com.croky.postgres.main.manager.impl;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.croky.postgres.dal.dao.ItemDAO;
import com.croky.postgres.dal.model.Item;
import com.croky.postgres.dal.model.ItemExample;
import com.croky.postgres.main.manager.ItemManager;
import com.croky.postgres.main.service.CacheService;
import com.croky.postgres.main.model.Status;

import javax.annotation.Resource;

//在dal层的操作中，与数据库有关的操作异常
//import org.springframework.dao.DataAccessException;

/**
 * 商品管理
 * 
 * @author Croky.Zheng 2019年6月8日 下午1:36:58
 */
//设置默认的缓存,前缀有remote-表示是redis的远程缓存
//远程缓存使用redis,CacheConfiguration类redisCacheManager方法中，根据需要通过map.put添加新的缓存
//本地缓存,则到资源文件ehcache.xml或者ehcache_cluster.xml(集群),添加新的缓存配置
@CacheConfig(cacheNames = "item")
//设置默认的事务处理,如果方法中包含insert,update,delete操作,或者不同的事务机制,请新增加一个注解
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
//注册一个服务组件
//规范:在Manager中，使用Component注解
@Component(value = "itemManager")
public class ItemManagerImpl implements ItemManager {
	private static final Logger log = LoggerFactory.getLogger(ItemManagerImpl.class);

	@Resource
	private ItemDAO itemDAO;

	@Autowired
	private CacheService cacheService;

	/**
	 * 类似这种操作，非常消耗数据库性能，不推荐使用 如果真要使用，建议和数据库的增删操作绑定
	 */
	@Override
	public long getItemCount() {
		log.debug("getItemCount");
		return itemDAO.countByExample(null);
	}

	/**
	 * 根据ID获取一个商品实例，会保存到缓存中
	 * 使用@Cacheable会优先获取缓存，因此无法在注解中使用#result做key,也可以说他是在方法执行之前实施
	 * 使用#result表示返回值对象,结果为null则不会缓存 以输入的参数id为key，分别存到两个缓存容器中,如果没有这个id的结果，则不会存储.
	 * 返回结果的安全库存大于0才保存到缓存 可以多个缓存一起用@Cacheable(value= {"item","remote-item"},key =
	 * "#id")
	 */
	@Override
	@Cacheable(value = { "remote-item" }, key = "#id", unless = "#result == null")
	public Item getItem(long id) {
		if (log.isDebugEnabled()) {
			log.debug(String.format("getItemCount %d",id));
		}
		return itemDAO.selectByPrimaryKey(id);
	}

	/**
	 * 根据ID删除一个商品，会在缓存中清理，这里需要更新或者删除数据库记录，所以@Transactional的readOnly要设置为false 规范 ：
	 * 一般情况，同一个方法中，会有多个注解，那么从短到长对注解排序
	 */
	@Override
	@Caching(evict={@CacheEvict(value= "remote-item",key="#id"),
	           @CacheEvict(value= "items",allEntries=true)
	 })
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Item deleteItem(long id) {
		if (log.isDebugEnabled()) {
			log.debug(String.format("deleteItem %d",id));
		}
		Item item = getItem(id);
		if (null == item) {
			throw new RuntimeException("item is not exist by id=" + id);
		}
		if (itemDAO.deleteByPrimaryKey(id) > 1) {
			return item;
		} else {
			throw new RuntimeException("delte item failed!");
		}
	}

	// 这种方式清理缓存会失效,注解的方式使用aop实现
	// 同一个类里面的方法调用,哪怕是使用public接口,都不会被调用
	/**
	 * 清理商品列表分页的缓存 beforeInvocation=true 表示在方法执行之前,就执行缓存清理工作
	 */
//	@CacheEvict(value= {"items"},allEntries=true,beforeInvocation=true)
//	public void cleanItemsCache() {
//		
//	}

	/**
	 * 基于PageHelper插件的分页查询，该插件会自动生成求count的sql 并且使用ThreadLocal传递参数 #p0表示第1个参数值
	 * 只有页面小于10的才缓存 规范:在页面类型参数中，需要的页编码放在前面，而页大小放在后面
	 */
	@Override
	@Cacheable(value = { "items" }, key = "#p0", condition = "#pageNum < 10")
	public PageInfo<Item> getItems(int pageNum, int pageSize) {
		// PageHelper.orderBy("id desc");
		// 注意: PageHelper这种方式，只对下一条查询sql有效，如果有多条查询语句，则不适用
		PageHelper.startPage(pageNum, pageSize, "id desc");
		// 不需要做PO转换时，可以这样返回
		return new PageInfo<Item>(itemDAO.selectByExample(null));
	}

	@Override
	//只要返回类型一致，key规则不一样，可以放到同一个缓存
	@Cacheable(value = { "items" }, key = "#location+'-'+#pageNum", condition = "#pageNum < 10")
	public Page<Item> getItemsByLocation(String location, int pageNum, int pageSize) {
		ItemExample example = new ItemExample();
		// 获取某个地方单位为个或者单价>100000的商品
		// select * from item where location=${location} and (unit='个' or price>100000)
		// A and (B or C) 使用 (A and B) or (A and C)代替
		example.createCriteria().andLocationEqualTo(location).andUnitEqualTo("瓶");
		example.or(example.createCriteria().andLocationEqualTo(location).andPriceGreaterThan(100000));
		// Page之间的类型转换
		// Page<Item> p = new Page<Item>(page.getPageNum(),page.getPageSize());
		// p.setTotal(page.getTotal());
		// p.setReasonable(page.getReasonable());
		Page<Item> page = PageHelper.startPage(pageNum, pageSize, "price asc,id desc");
		itemDAO.selectByExample(example);
		return page;
	}

	/**
	 * 使用Example生成的分页,因为没有主动生成count,所以只适合遍历数据库数据 而不适合于交互式翻页,同理,没有count,速度要快的多
	 */
	@Override
	public List<Item> queryItems(int pageNum, int pageSize) {
		ItemExample example = new ItemExample();
		example.setLimit(pageSize);
		example.setOffset(pageNum * pageSize);
		example.setOrderByClause("id desc");
		return itemDAO.selectByExample(example);
	}

	/**
	 * 插入一个商品,并将执行结果加入缓存，也会更新
	 * 使用@CachePut标注的方法在执行前不会去检查缓存中是否存在,或者说他是在方法执行之后写缓存，所以可以使用#result 作为key
	 * 使用@CacheEvict 清理所有的分页信息
	 * 
	 * @param barcode 商品编码
	 * @param name    商品名称
	 * @param pinyin  商品拼音
	 */
	@Override
	@CachePut(key = "#result.id")
	@CacheEvict(value = { "items" },allEntries=true)
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Item insertItem(String barcode, String name, String pinyin) {
		Item item = new Item();
		item.setBarcode(barcode);
		item.setName(name);
		item.setPinyin(pinyin);
		this.insert(item);
		return item;
	}

	/**
	 * 插入一个商品,并将执行结果加入缓存，也会更新
	 */
	@Override
	@CachePut(key = "#item.id")
	@CacheEvict(value= {"items"},allEntries=true,beforeInvocation=true)
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public Item addOrUpdate(Item item) {
		// 这里无法使用缓存，和调用getItemById方法效果是一样的
		Item old = this.getItem(item.getId());
		if (null == old) {
			this.insert(item);
		} else {
			Date now = new Date();
			item.setLastModifyDateTime(now);
			// 这里只更新不为null的字段,这样在一些需要将数据库某列设置为null时则不会成功
			itemDAO.updateByPrimaryKeySelective(item);
		}
		return item;
	}

	/**
	 * 通过cacheService来清理缓存
	 */
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public int updateItemStatus(long id, Status status) {
		Item item = this.getItemById(id);
		if (null != item) {
			item.setStatus(status.getValue());
			// 清理分页缓存
			cacheService.cleanItemsCache();
			return update(item);
		}
		return 0;
	}

	private Item getItemById(long id) {
		return itemDAO.selectByPrimaryKey(id);
	}

	private int update(Item item) {
		Date now = new Date();
		item.setLastModifyDateTime(now);
		return itemDAO.updateByPrimaryKey(item);
	}

	private int insert(Item item) {
		Date now = new Date();
		item.setCreateDateTime(now);
		item.setLastModifyDateTime(now);
		item.setStatus(Status.VALID.getValue());
		return itemDAO.insert(item);
	}

}
