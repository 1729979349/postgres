package com.croky.postgres.dal.mapper;

import com.croky.postgres.dal.model.CompetitionMonitoring;
import com.croky.postgres.dal.model.CompetitionMonitoringExample;
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
 * @date 2023-03-07 15:30:24
*/
@Mapper
public interface CompetitionMonitoringMapper {
    /**

     */
    @SelectProvider(type=CompetitionMonitoringSqlProvider.class, method="countByExample")
    long countByExample(CompetitionMonitoringExample example);

    /**

     */
    @Insert({
        "insert into competition_monitoring (brand, lazada, ",
        "shopee, shopee_shop_id, ",
        "qoo10, tmall, jd, ",
        "gmt_modify, gmt_create)",
        "values (#{brand,jdbcType=VARCHAR}, #{lazada,jdbcType=VARCHAR}, ",
        "#{shopee,jdbcType=VARCHAR}, #{shopeeShopId,jdbcType=VARCHAR}, ",
        "#{qoo10,jdbcType=VARCHAR}, #{tmall,jdbcType=VARCHAR}, #{jd,jdbcType=VARCHAR}, ",
        "#{lastModifyDateTime,jdbcType=TIMESTAMP}, #{createDateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insert(CompetitionMonitoring row);

    /**

     */
    @InsertProvider(type=CompetitionMonitoringSqlProvider.class, method="insertSelective")
    @SelectKey(statement="SELECT LAST_INSERT_ID()", keyProperty="id", before=false, resultType=Integer.class)
    int insertSelective(CompetitionMonitoring row);

    /**

     */
    @SelectProvider(type=CompetitionMonitoringSqlProvider.class, method="selectByExample")
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
    List<CompetitionMonitoring> selectByExample(CompetitionMonitoringExample example);

    /**

     */
    @Select({
        "select",
        "id, brand, lazada, shopee, shopee_shop_id, qoo10, tmall, jd, gmt_modify, gmt_create",
        "from competition_monitoring",
        "where id = #{id,jdbcType=INTEGER}"
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
    CompetitionMonitoring selectByPrimaryKey(Integer id);

    /**

     */
    @UpdateProvider(type=CompetitionMonitoringSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("row") CompetitionMonitoring row, @Param("example") CompetitionMonitoringExample example);

    /**

     */
    @UpdateProvider(type=CompetitionMonitoringSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("row") CompetitionMonitoring row, @Param("example") CompetitionMonitoringExample example);

    /**

     */
    @UpdateProvider(type=CompetitionMonitoringSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CompetitionMonitoring row);

    /**

     */
    @Update({
        "update competition_monitoring",
        "set brand = #{brand,jdbcType=VARCHAR},",
          "lazada = #{lazada,jdbcType=VARCHAR},",
          "shopee = #{shopee,jdbcType=VARCHAR},",
          "shopee_shop_id = #{shopeeShopId,jdbcType=VARCHAR},",
          "qoo10 = #{qoo10,jdbcType=VARCHAR},",
          "tmall = #{tmall,jdbcType=VARCHAR},",
          "jd = #{jd,jdbcType=VARCHAR},",
          "gmt_modify = #{lastModifyDateTime,jdbcType=TIMESTAMP},",
          "gmt_create = #{createDateTime,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CompetitionMonitoring row);
}