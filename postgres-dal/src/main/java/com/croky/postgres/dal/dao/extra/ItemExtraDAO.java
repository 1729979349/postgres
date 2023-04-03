package com.croky.postgres.dal.dao.extra;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

import com.croky.postgres.dal.dao.ItemDAO;
import com.croky.postgres.dal.model.extra.UnitCount;


/**
 * 
 * @author Croky.Zheng
 * 2019年9月6日 下午10:10:58
 */
@Mapper
public interface ItemExtraDAO extends ItemDAO {

	/**
	 * 所有商品的最高价格最高
	 * @return
	 */
	@Select({
		"select max(price) from item"
		})
	long getMaxPrice();
	
	/**
	 * 根据单位分组
	 * @return
	 */
	@Select({
		"select unit,count(1) as cnt from item where spec is not null and unit is not null group by unit having cnt > 0 order by cnt desc"
		})
    @Results({
        @Result(column="unit", property="unit", jdbcType=JdbcType.VARCHAR),
        @Result(column="cnt", property="count", jdbcType=JdbcType.INTEGER)
    })
	List<UnitCount> getCategoryCounts();
}
