package com.croky.postgres.dal.mapper;

import com.croky.postgres.dal.model.PlatformDimensionReport;
import com.croky.postgres.dal.model.PlatformDimensionReportExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

/**
 * @author Croky.Zheng
 * @date 2023-03-06 17:48:11
*/
@Mapper
public interface PlatformDimensionReportMapper {
    /**

     */
    @SelectProvider(type=PlatformDimensionReportSqlProvider.class, method="countByExample")
    long countByExample(PlatformDimensionReportExample example);

    /**

     */
    @Insert({
        "insert into platform_dimension_report (channel, platform_type, ",
        "platform, data_category, ",
        "source_category, source, ",
        "table_name_dwd, gmt_modify, ",
        "gmt_create)",
        "values (#{channel,jdbcType=VARCHAR}, #{platformType,jdbcType=VARCHAR}, ",
        "#{platform,jdbcType=VARCHAR}, #{dataCategory,jdbcType=VARCHAR}, ",
        "#{sourceCategory,jdbcType=VARCHAR}, #{source,jdbcType=VARCHAR}, ",
        "#{tableNameDwd,jdbcType=VARCHAR}, #{lastModifyDateTime,jdbcType=TIMESTAMP}, ",
        "#{createDateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(PlatformDimensionReport row);

    /**

     */
    @InsertProvider(type=PlatformDimensionReportSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(PlatformDimensionReport row);

    /**

     */
    @SelectProvider(type=PlatformDimensionReportSqlProvider.class, method="selectByExample")
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
    List<PlatformDimensionReport> selectByExample(PlatformDimensionReportExample example);

    /**

     */
    @Select({
        "select",
        "id, channel, platform_type, platform, data_category, source_category, source, ",
        "table_name_dwd, gmt_modify, gmt_create",
        "from platform_dimension_report",
        "where id = #{id,jdbcType=INTEGER}"
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
    PlatformDimensionReport selectByPrimaryKey(Integer id);

    /**

     */
    @UpdateProvider(type=PlatformDimensionReportSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("row") PlatformDimensionReport row, @Param("example") PlatformDimensionReportExample example);

    /**

     */
    @UpdateProvider(type=PlatformDimensionReportSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("row") PlatformDimensionReport row, @Param("example") PlatformDimensionReportExample example);

    /**

     */
    @UpdateProvider(type=PlatformDimensionReportSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PlatformDimensionReport row);

    /**

     */
    @Update({
        "update platform_dimension_report",
        "set channel = #{channel,jdbcType=VARCHAR},",
          "platform_type = #{platformType,jdbcType=VARCHAR},",
          "platform = #{platform,jdbcType=VARCHAR},",
          "data_category = #{dataCategory,jdbcType=VARCHAR},",
          "source_category = #{sourceCategory,jdbcType=VARCHAR},",
          "source = #{source,jdbcType=VARCHAR},",
          "table_name_dwd = #{tableNameDwd,jdbcType=VARCHAR},",
          "gmt_modify = #{lastModifyDateTime,jdbcType=TIMESTAMP},",
          "gmt_create = #{createDateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PlatformDimensionReport row);
}