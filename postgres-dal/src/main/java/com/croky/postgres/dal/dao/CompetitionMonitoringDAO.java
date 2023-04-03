package com.croky.postgres.dal.dao;

import com.croky.common.lang.Pagination;
import com.croky.postgres.dal.mapper.CompetitionMonitoringMapper;
import com.croky.postgres.dal.model.CompetitionMonitoring;
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
 * @date 2023-03-07 15:30:24
*/
@Mapper
public interface CompetitionMonitoringDAO extends CompetitionMonitoringMapper {
    /**

     */
    @Select({
        "select",
        "id, brand, lazada, shopee, shopee_shop_id, qoo10, tmall, jd, gmt_modify, gmt_create",
        "from competition_monitoring",
        "where id = #{id,jdbcType=INTEGER}",
        "for update"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="brand", property="brand", jdbcType=JdbcType.VARCHAR),
        @Result(column="lazada", property="lazada", jdbcType=JdbcType.VARCHAR),
        @Result(column="shopee", property="shopee", jdbcType=JdbcType.VARCHAR),
        @Result(column="shopee_shop_id", property="shopeeShopId", jdbcType=JdbcType.VARCHAR),
        @Result(column="qoo10", property="qoo10", jdbcType=JdbcType.VARCHAR),
        @Result(column="tmall", property="tmall", jdbcType=JdbcType.VARCHAR),
        @Result(column="jd", property="jd", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    CompetitionMonitoring getAndLock(Integer id);

    /**

     */
    @Select({
        "select",
        "id, brand, lazada, shopee, shopee_shop_id, qoo10, tmall, jd, gmt_modify, gmt_create",
        "from competition_monitoring",
        "where id = #{id,jdbcType=INTEGER}",
        "lock in share mode"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="brand", property="brand", jdbcType=JdbcType.VARCHAR),
        @Result(column="lazada", property="lazada", jdbcType=JdbcType.VARCHAR),
        @Result(column="shopee", property="shopee", jdbcType=JdbcType.VARCHAR),
        @Result(column="shopee_shop_id", property="shopeeShopId", jdbcType=JdbcType.VARCHAR),
        @Result(column="qoo10", property="qoo10", jdbcType=JdbcType.VARCHAR),
        @Result(column="tmall", property="tmall", jdbcType=JdbcType.VARCHAR),
        @Result(column="jd", property="jd", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    CompetitionMonitoring getAndShareLock(Integer id);

    /**

     */
    @Update({
    "update competition_monitoring ",
    "set status = -1",
    "where ",
    "id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**

     */
    @Select({"<script> ",
        "select",
        "id, brand, lazada, shopee, shopee_shop_id, qoo10, tmall, jd, gmt_modify, gmt_create",
        "from competition_monitoring",
    "<when test=\"where!=null and where!=''\">  where 1=1 and #{where,jdbcType=VARCHAR} </when>",
    "<when test=\"orderby!=null and orderby!=''\">  order by  #{orderby,jdbcType=VARCHAR}</when>",
    "<when test=\"pagination!=null\">  limit  #{pagination.offset,jdbcType=INTEGER},#{pagination.limit,jdbcType=INTEGER}</when>",
    "</script>"})
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="brand", property="brand", jdbcType=JdbcType.VARCHAR),
        @Result(column="lazada", property="lazada", jdbcType=JdbcType.VARCHAR),
        @Result(column="shopee", property="shopee", jdbcType=JdbcType.VARCHAR),
        @Result(column="shopee_shop_id", property="shopeeShopId", jdbcType=JdbcType.VARCHAR),
        @Result(column="qoo10", property="qoo10", jdbcType=JdbcType.VARCHAR),
        @Result(column="tmall", property="tmall", jdbcType=JdbcType.VARCHAR),
        @Result(column="jd", property="jd", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<CompetitionMonitoring> listByWhere(@Param("where") String where, @Param("orderby") String orderby, @Param("pagination") Pagination pagination);
}