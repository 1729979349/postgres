package com.croky.postgres.dal.dao;

import com.croky.common.lang.Pagination;
import com.croky.postgres.dal.mapper.AlertThresholdMapper;
import com.croky.postgres.dal.model.AlertThreshold;
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
 * @date 2023-02-13 17:21:18
*/
@Mapper
public interface AlertThresholdDAO extends AlertThresholdMapper {
    /**

     */
    @Select({
        "select",
        "id, roi_a, roi_c, gmt_modify, gmt_create",
        "from alert_threshold",
        "where id = #{id,jdbcType=INTEGER}",
        "for update"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="roi_a", property="roiA", jdbcType=JdbcType.VARCHAR),
        @Result(column="roi_c", property="roiC", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    AlertThreshold getAndLock(Integer id);

    /**

     */
    @Select({
        "select",
        "id, roi_a, roi_c, gmt_modify, gmt_create",
        "from alert_threshold",
        "where id = #{id,jdbcType=INTEGER}",
        "lock in share mode"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="roi_a", property="roiA", jdbcType=JdbcType.VARCHAR),
        @Result(column="roi_c", property="roiC", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    AlertThreshold getAndShareLock(Integer id);

    /**

     */
    @Update({
    "update alert_threshold ",
    "set status = -1",
    "where ",
    "id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**

     */
    @Select({"<script> ",
        "select",
        "id, roi_a, roi_c, gmt_modify, gmt_create",
        "from alert_threshold",
    "<when test=\"where!=null and where!=''\">  where 1=1 and #{where,jdbcType=VARCHAR} </when>",
    "<when test=\"orderby!=null and orderby!=''\">  order by  #{orderby,jdbcType=VARCHAR}</when>",
    "<when test=\"pagination!=null\">  limit  #{pagination.offset,jdbcType=INTEGER},#{pagination.limit,jdbcType=INTEGER}</when>",
    "</script>"})
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="roi_a", property="roiA", jdbcType=JdbcType.VARCHAR),
        @Result(column="roi_c", property="roiC", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<AlertThreshold> listByWhere(@Param("where") String where, @Param("orderby") String orderby, @Param("pagination") Pagination pagination);
}