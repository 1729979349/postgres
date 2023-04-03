package com.croky.postgres.dal.mapper;

import com.croky.postgres.dal.model.AlertDate;
import com.croky.postgres.dal.model.AlertDateExample;
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
 * @date 2023-02-28 11:16:30
*/
@Mapper
public interface AlertDateMapper {
    /**

     */
    @SelectProvider(type=AlertDateSqlProvider.class, method="countByExample")
    long countByExample(AlertDateExample example);

    /**

     */
    @Insert({
        "insert into alert_date (country, tier, ",
        "name, start_date, ",
        "end_date, date_of_data, ",
        "platform, year, ",
        "gmt_modify, gmt_create)",
        "values (#{country,jdbcType=VARCHAR}, #{tier,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{startDate,jdbcType=VARCHAR}, ",
        "#{endDate,jdbcType=VARCHAR}, #{dateOfData,jdbcType=DATE}, ",
        "#{platform,jdbcType=VARCHAR}, #{year,jdbcType=VARCHAR}, ",
        "#{lastModifyDateTime,jdbcType=TIMESTAMP}, #{createDateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(AlertDate row);

    /**

     */
    @InsertProvider(type=AlertDateSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(AlertDate row);

    /**

     */
    @SelectProvider(type=AlertDateSqlProvider.class, method="selectByExample")
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
    List<AlertDate> selectByExample(AlertDateExample example);

    /**

     */
    @Select({
        "select",
        "id, country, tier, name, start_date, end_date, date_of_data, platform, year, ",
        "gmt_modify, gmt_create",
        "from alert_date",
        "where id = #{id,jdbcType=INTEGER}"
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
    AlertDate selectByPrimaryKey(Integer id);

    /**

     */
    @UpdateProvider(type=AlertDateSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("row") AlertDate row, @Param("example") AlertDateExample example);

    /**

     */
    @UpdateProvider(type=AlertDateSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("row") AlertDate row, @Param("example") AlertDateExample example);

    /**

     */
    @UpdateProvider(type=AlertDateSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(AlertDate row);

    /**

     */
    @Update({
        "update alert_date",
        "set country = #{country,jdbcType=VARCHAR},",
          "tier = #{tier,jdbcType=VARCHAR},",
          "name = #{name,jdbcType=VARCHAR},",
          "start_date = #{startDate,jdbcType=VARCHAR},",
          "end_date = #{endDate,jdbcType=VARCHAR},",
          "date_of_data = #{dateOfData,jdbcType=DATE},",
          "platform = #{platform,jdbcType=VARCHAR},",
          "year = #{year,jdbcType=VARCHAR},",
          "gmt_modify = #{lastModifyDateTime,jdbcType=TIMESTAMP},",
          "gmt_create = #{createDateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(AlertDate row);
}