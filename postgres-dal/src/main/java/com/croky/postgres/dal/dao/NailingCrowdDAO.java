package com.croky.postgres.dal.dao;

import com.croky.common.lang.Pagination;
import com.croky.postgres.dal.mapper.NailingCrowdMapper;
import com.croky.postgres.dal.model.NailingCrowd;
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
 * @date 2023-03-28 18:25:04
*/
@Mapper
public interface NailingCrowdDAO extends NailingCrowdMapper {
    /**

     */
    @Select({
        "select",
        "id, crowd_name, crowd_token, gmt_modify, gmt_create",
        "from nailing_crowd",
        "where id = #{id,jdbcType=INTEGER}",
        "for update"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="crowd_name", property="crowdName", jdbcType=JdbcType.VARCHAR),
        @Result(column="crowd_token", property="crowdToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    NailingCrowd getAndLock(Integer id);

    /**

     */
    @Select({
        "select",
        "id, crowd_name, crowd_token, gmt_modify, gmt_create",
        "from nailing_crowd",
        "where id = #{id,jdbcType=INTEGER}",
        "lock in share mode"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="crowd_name", property="crowdName", jdbcType=JdbcType.VARCHAR),
        @Result(column="crowd_token", property="crowdToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    NailingCrowd getAndShareLock(Integer id);

    /**

     */
    @Update({
    "update nailing_crowd ",
    "set status = -1",
    "where ",
    "id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**

     */
    @Select({"<script> ",
        "select",
        "id, crowd_name, crowd_token, gmt_modify, gmt_create",
        "from nailing_crowd",
    "<when test=\"where!=null and where!=''\">  where 1=1 and #{where,jdbcType=VARCHAR} </when>",
    "<when test=\"orderby!=null and orderby!=''\">  order by  #{orderby,jdbcType=VARCHAR}</when>",
    "<when test=\"pagination!=null\">  limit  #{pagination.offset,jdbcType=INTEGER},#{pagination.limit,jdbcType=INTEGER}</when>",
    "</script>"})
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="crowd_name", property="crowdName", jdbcType=JdbcType.VARCHAR),
        @Result(column="crowd_token", property="crowdToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<NailingCrowd> listByWhere(@Param("where") String where, @Param("orderby") String orderby, @Param("pagination") Pagination pagination);
}