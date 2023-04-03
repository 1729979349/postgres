package com.croky.postgres.dal.mapper;

import com.croky.postgres.dal.model.LzAdsDiscoveryDwd;
import com.croky.postgres.dal.model.LzAdsDiscoveryDwdExample;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

/**
 * @author Croky.Zheng
 * @date 2023-02-20 11:23:50
*/
@Mapper
public interface LzAdsDiscoveryDwdMapper {
    /**

     */
    @SelectProvider(type=LzAdsDiscoveryDwdSqlProvider.class, method="countByExample")
    long countByExample(LzAdsDiscoveryDwdExample example);

    /**

     */
    @Insert({
        "insert into lz_ads_discovery_dwd (date_of_data, store_id, ",
        "date, campaign_name, ",
        "campaign_id, campaign_objective, ",
        "campaign_type, placement, ",
        "budget, spend, impression, ",
        "clicks, ctr, cpc, ",
        "store_add_to_cart_units, store_orders, ",
        "store_cvr, store_units_sold, ",
        "store_revenue, store_roi, ",
        "direct_add_to_cart_units, direct_orders, ",
        "direct_cvr, direct_units_sold, ",
        "direct_revenue, currency, ",
        "flow_id)",
        "values (#{dateOfData,jdbcType=DATE}, #{storeId,jdbcType=VARCHAR}, ",
        "#{date,jdbcType=VARCHAR}, #{campaignName,jdbcType=VARCHAR}, ",
        "#{campaignId,jdbcType=VARCHAR}, #{campaignObjective,jdbcType=VARCHAR}, ",
        "#{campaignType,jdbcType=VARCHAR}, #{placement,jdbcType=VARCHAR}, ",
        "#{budget,jdbcType=INTEGER}, #{spend,jdbcType=NUMERIC}, #{impression,jdbcType=INTEGER}, ",
        "#{clicks,jdbcType=INTEGER}, #{ctr,jdbcType=NUMERIC}, #{cpc,jdbcType=NUMERIC}, ",
        "#{storeAddToCartUnits,jdbcType=INTEGER}, #{storeOrders,jdbcType=INTEGER}, ",
        "#{storeCvr,jdbcType=NUMERIC}, #{storeUnitsSold,jdbcType=INTEGER}, ",
        "#{storeRevenue,jdbcType=NUMERIC}, #{storeRoi,jdbcType=NUMERIC}, ",
        "#{directAddToCartUnits,jdbcType=INTEGER}, #{directOrders,jdbcType=INTEGER}, ",
        "#{directCvr,jdbcType=NUMERIC}, #{directUnitsSold,jdbcType=INTEGER}, ",
        "#{directRevenue,jdbcType=NUMERIC}, #{currency,jdbcType=VARCHAR}, ",
        "#{flowId,jdbcType=VARCHAR})"
    })
    int insert(LzAdsDiscoveryDwd row);

    /**

     */
    @InsertProvider(type=LzAdsDiscoveryDwdSqlProvider.class, method="insertSelective")
    int insertSelective(LzAdsDiscoveryDwd row);

    /**

     */
    @SelectProvider(type=LzAdsDiscoveryDwdSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="date_of_data", property="dateOfData", jdbcType=JdbcType.DATE),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="date", property="date", jdbcType=JdbcType.VARCHAR),
        @Result(column="campaign_name", property="campaignName", jdbcType=JdbcType.VARCHAR),
        @Result(column="campaign_id", property="campaignId", jdbcType=JdbcType.VARCHAR),
        @Result(column="campaign_objective", property="campaignObjective", jdbcType=JdbcType.VARCHAR),
        @Result(column="campaign_type", property="campaignType", jdbcType=JdbcType.VARCHAR),
        @Result(column="placement", property="placement", jdbcType=JdbcType.VARCHAR),
        @Result(column="budget", property="budget", jdbcType=JdbcType.INTEGER),
        @Result(column="spend", property="spend", jdbcType=JdbcType.NUMERIC),
        @Result(column="impression", property="impression", jdbcType=JdbcType.INTEGER),
        @Result(column="clicks", property="clicks", jdbcType=JdbcType.INTEGER),
        @Result(column="ctr", property="ctr", jdbcType=JdbcType.NUMERIC),
        @Result(column="cpc", property="cpc", jdbcType=JdbcType.NUMERIC),
        @Result(column="store_add_to_cart_units", property="storeAddToCartUnits", jdbcType=JdbcType.INTEGER),
        @Result(column="store_orders", property="storeOrders", jdbcType=JdbcType.INTEGER),
        @Result(column="store_cvr", property="storeCvr", jdbcType=JdbcType.NUMERIC),
        @Result(column="store_units_sold", property="storeUnitsSold", jdbcType=JdbcType.INTEGER),
        @Result(column="store_revenue", property="storeRevenue", jdbcType=JdbcType.NUMERIC),
        @Result(column="store_roi", property="storeRoi", jdbcType=JdbcType.NUMERIC),
        @Result(column="direct_add_to_cart_units", property="directAddToCartUnits", jdbcType=JdbcType.INTEGER),
        @Result(column="direct_orders", property="directOrders", jdbcType=JdbcType.INTEGER),
        @Result(column="direct_cvr", property="directCvr", jdbcType=JdbcType.NUMERIC),
        @Result(column="direct_units_sold", property="directUnitsSold", jdbcType=JdbcType.INTEGER),
        @Result(column="direct_revenue", property="directRevenue", jdbcType=JdbcType.NUMERIC),
        @Result(column="currency", property="currency", jdbcType=JdbcType.VARCHAR),
        @Result(column="flow_id", property="flowId", jdbcType=JdbcType.VARCHAR)
    })
    List<LzAdsDiscoveryDwd> selectByExample(LzAdsDiscoveryDwdExample example);

    /**

     */
    @UpdateProvider(type=LzAdsDiscoveryDwdSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("row") LzAdsDiscoveryDwd row, @Param("example") LzAdsDiscoveryDwdExample example);

    /**

     */
    @UpdateProvider(type=LzAdsDiscoveryDwdSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("row") LzAdsDiscoveryDwd row, @Param("example") LzAdsDiscoveryDwdExample example);
}