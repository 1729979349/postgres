package com.croky.postgres.web.utils;

import java.util.ArrayList;
import java.util.List;


import com.croky.common.lang.Page;
import com.croky.common.lang.Pagination;
import com.croky.common.util.CollectionUtils;
import com.croky.common.util.ObjectUtils;
import com.github.pagehelper.PageInfo;

/**
 * 
 * @author Croky 2019年7月11日
 */
public final class Helper {

	private Helper() {
	}

	/**
	 * 将PageInfo中数据的类型，转换为新的类型
	 * @param <T>		目标类型
	 * @param <E>		需要转换的类型
	 * @param pageInfo	需要转换的对象
	 * @param clazz		目标类型Class
	 * @return
	 * @throws Exception
	 */
	public static <T, E> Page<T> convertPageInfo(PageInfo<E> pageInfo, Class<T> clazz) throws Exception {
		Page<T> page = null;
		if ((null != pageInfo) && (pageInfo.getSize() > 0)) {
			List<T> targets = new ArrayList<T>(pageInfo.getSize());
			for (E source : pageInfo.getList()) {
				T target = null;
				target = clazz.getConstructor().newInstance();
				target = ObjectUtils.copyFieldValue(source, target, true);
				targets.add(target);
			}
			page = Page.newPage(targets, Pagination.getPagination(pageInfo.getPageNum(), pageInfo.getPageSize(),
					pageInfo.getTotal()));
		}
		return page;
	}
	
	/**
	 * 
	 * 将分页插件的Page转换为croky.utils中的Page类型
	 * @param <T>		目标类型
	 * @param <E>		需要转换的类型
	 * @param clazz		目标类型Class
	 * @throws Exception
	 */
	public static <T, E> Page<T> convertPage(com.github.pagehelper.Page<E> pageHub, Class<T> clazz) throws Exception {
		Page<T> page = null;
		if (CollectionUtils.isNotEmpty(pageHub)) {
			List<T> targets = new ArrayList<T>(pageHub.size());
			for (E source : pageHub) {
				T target = null;
				target = clazz.getConstructor().newInstance();
				target = ObjectUtils.copyFieldValue(source, target, true);
				targets.add(target);
			}
			page = Page.newPage(targets, Pagination.getPagination(pageHub.getPageNum(), pageHub.getPageSize(),
					pageHub.getTotal()));
		}
		return page;
	}
}
