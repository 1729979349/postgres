package com.croky.postgres.dal.dao;

import com.croky.common.lang.Pagination;
import com.croky.postgres.dal.mapper.PlatformDimensionReportMapper;
import com.croky.postgres.dal.model.PlatformDimensionReport;
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
 * @date 2023-03-06 17:48:11
*/
@Mapper
public interface PlatformDimensionReportDAO extends PlatformDimensionReportMapper {
    /**

     */
    @Select({
        "select",
        "id, channel, platform_type, platform, data_category, source_category, source, ",
        "table_name_dwd, gmt_modify, gmt_create",
        "from platform_dimension_report",
        "where id = #{id,jdbcType=INTEGER}",
        "for update"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="channel", property="channel", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform_type", property="platformType", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform", property="platform", jdbcType=JdbcType.VARCHAR),
        @Result(column="data_category", property="dataCategory", jdbcType=JdbcType.VARCHAR),
        @Result(column="source_category", property="sourceCategory", jdbcType=JdbcType.VARCHAR),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="table_name_dwd", property="tableNameDwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    PlatformDimensionReport getAndLock(Integer id);

    /**

     */
    @Select({
        "select",
        "id, channel, platform_type, platform, data_category, source_category, source, ",
        "table_name_dwd, gmt_modify, gmt_create",
        "from platform_dimension_report",
        "where id = #{id,jdbcType=INTEGER}",
        "lock in share mode"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="channel", property="channel", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform_type", property="platformType", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform", property="platform", jdbcType=JdbcType.VARCHAR),
        @Result(column="data_category", property="dataCategory", jdbcType=JdbcType.VARCHAR),
        @Result(column="source_category", property="sourceCategory", jdbcType=JdbcType.VARCHAR),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="table_name_dwd", property="tableNameDwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    PlatformDimensionReport getAndShareLock(Integer id);

    /**

     */
    @Update({
    "update platform_dimension_report ",
    "set status = -1",
    "where ",
    "id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**

     */
    @Select({"<script> ",
        "select",
        "id, channel, platform_type, platform, data_category, source_category, source, ",
        "table_name_dwd, gmt_modify, gmt_create",
        "from platform_dimension_report",
    "<when test=\"where!=null and where!=''\">  where 1=1 and #{where,jdbcType=VARCHAR} </when>",
    "<when test=\"orderby!=null and orderby!=''\">  order by  #{orderby,jdbcType=VARCHAR}</when>",
    "<when test=\"pagination!=null\">  limit  #{pagination.offset,jdbcType=INTEGER},#{pagination.limit,jdbcType=INTEGER}</when>",
    "</script>"})
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="channel", property="channel", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform_type", property="platformType", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform", property="platform", jdbcType=JdbcType.VARCHAR),
        @Result(column="data_category", property="dataCategory", jdbcType=JdbcType.VARCHAR),
        @Result(column="source_category", property="sourceCategory", jdbcType=JdbcType.VARCHAR),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="table_name_dwd", property="tableNameDwd", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<PlatformDimensionReport> listByWhere(@Param("where") String where, @Param("orderby") String orderby, @Param("pagination") Pagination pagination);
}