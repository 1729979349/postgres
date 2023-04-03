package com.croky.postgres.dal.dao;

import com.croky.common.lang.Pagination;
import com.croky.postgres.dal.mapper.AlertDateMapper;
import com.croky.postgres.dal.model.AlertDate;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

/**
 * @author Croky.Zheng
 * @date 2023-02-28 11:16:30
*/
@Mapper
public interface AlertDateDAO extends AlertDateMapper {
    /**

     */
    @Select({
        "select",
        "id, country, tier, name, start_date, end_date, date_of_data, platform, year, ",
        "gmt_modify, gmt_create",
        "from alert_date",
        "where id = #{id,jdbcType=INTEGER}",
        "for update"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="country", property="country", jdbcType=JdbcType.VARCHAR),
        @Result(column="tier", property="tier", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_date", property="startDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="end_date", property="endDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="date_of_data", property="dateOfData", jdbcType=JdbcType.DATE),
        @Result(column="platform", property="platform", jdbcType=JdbcType.VARCHAR),
        @Result(column="year", property="year", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    AlertDate getAndLock(Integer id);

    /**

     */
    @Select({
        "select",
        "id, country, tier, name, start_date, end_date, date_of_data, platform, year, ",
        "gmt_modify, gmt_create",
        "from alert_date",
        "where id = #{id,jdbcType=INTEGER}",
        "lock in share mode"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="country", property="country", jdbcType=JdbcType.VARCHAR),
        @Result(column="tier", property="tier", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_date", property="startDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="end_date", property="endDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="date_of_data", property="dateOfData", jdbcType=JdbcType.DATE),
        @Result(column="platform", property="platform", jdbcType=JdbcType.VARCHAR),
        @Result(column="year", property="year", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    AlertDate getAndShareLock(Integer id);

    /**

     */
    @Update({
    "update alert_date ",
    "set status = -1",
    "where ",
    "id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**

     */
    @Select({"<script> ",
        "select",
        "id, country, tier, name, start_date, end_date, date_of_data, platform, year, ",
        "gmt_modify, gmt_create",
        "from alert_date",
    "<when test=\"where!=null and where!=''\">  where 1=1 and #{where,jdbcType=VARCHAR} </when>",
    "<when test=\"orderby!=null and orderby!=''\">  order by  #{orderby,jdbcType=VARCHAR}</when>",
    "<when test=\"pagination!=null\">  limit  #{pagination.offset,jdbcType=INTEGER},#{pagination.limit,jdbcType=INTEGER}</when>",
    "</script>"})
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="country", property="country", jdbcType=JdbcType.VARCHAR),
        @Result(column="tier", property="tier", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_date", property="startDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="end_date", property="endDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="date_of_data", property="dateOfData", jdbcType=JdbcType.DATE),
        @Result(column="platform", property="platform", jdbcType=JdbcType.VARCHAR),
        @Result(column="year", property="year", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<AlertDate> listByWhere(@Param("where") String where, @Param("orderby") String orderby, @Param("pagination") Pagination pagination);
}