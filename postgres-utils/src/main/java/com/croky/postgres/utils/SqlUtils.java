package com.croky.postgres.utils;

/**
 * 
 * @author Croky.Zheng
 * 2019年6月7日 下午5:44:14
 */
public final class SqlUtils {

	private SqlUtils() {}
	
	/**
	 * 检查异常是否因为违反唯一性约束
	 * 在数据库的设计中,唯一性约束使用only_作为前缀
	 * @param e
	 * @return
	 */
	public static boolean isUniqueness(Exception e) {
		if ((null != e) && (null != e.getMessage())) {
			return "for key 'only_".equals(e.getMessage());
		}
		return false;
	}
}
