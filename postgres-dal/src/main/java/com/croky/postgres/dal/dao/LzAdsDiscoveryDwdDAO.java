package com.croky.postgres.dal.dao;

import com.croky.common.lang.Pagination;
import com.croky.postgres.dal.mapper.LzAdsDiscoveryDwdMapper;
import com.croky.postgres.dal.model.LzAdsDiscoveryDwd;
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
 * @date 2023-02-20 11:23:50
*/
@Mapper
public interface LzAdsDiscoveryDwdDAO extends LzAdsDiscoveryDwdMapper {
    /**

     */
    @Select({
        "select",
        "date_of_data, store_id, date, campaign_name, campaign_id, campaign_objective, ",
        "campaign_type, placement, budget, spend, impression, clicks, ctr, cpc, store_add_to_cart_units, ",
        "store_orders, store_cvr, store_units_sold, store_revenue, store_roi, direct_add_to_cart_units, ",
        "direct_orders, direct_cvr, direct_units_sold, direct_revenue, currency, flow_id",
        "from lz_ads_discovery_dwd",
        "for update"
    })
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
    LzAdsDiscoveryDwd getAndLock();

    /**

     */
    @Select({
        "select",
        "date_of_data, store_id, date, campaign_name, campaign_id, campaign_objective, ",
        "campaign_type, placement, budget, spend, impression, clicks, ctr, cpc, store_add_to_cart_units, ",
        "store_orders, store_cvr, store_units_sold, store_revenue, store_roi, direct_add_to_cart_units, ",
        "direct_orders, direct_cvr, direct_units_sold, direct_revenue, currency, flow_id",
        "from lz_ads_discovery_dwd",
        "lock in share mode"
    })
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
    LzAdsDiscoveryDwd getAndShareLock();

    /**

     */
    @Update({
    "update lz_ads_discovery_dwd ",
    "set status = -1",
    "where ",
    })
    int deleteByPrimaryKey(int key);

    /**

     */
    @Select({"<script> ",
        "select",
        "date_of_data, store_id, date, campaign_name, campaign_id, campaign_objective, ",
        "campaign_type, placement, budget, spend, impression, clicks, ctr, cpc, store_add_to_cart_units, ",
        "store_orders, store_cvr, store_units_sold, store_revenue, store_roi, direct_add_to_cart_units, ",
        "direct_orders, direct_cvr, direct_units_sold, direct_revenue, currency, flow_id",
        "from lz_ads_discovery_dwd",
    "<when test=\"where!=null and where!=''\">  where 1=1 and #{where,jdbcType=VARCHAR} </when>",
    "<when test=\"orderby!=null and orderby!=''\">  order by  #{orderby,jdbcType=VARCHAR}</when>",
    "<when test=\"pagination!=null\">  limit  #{pagination.offset,jdbcType=INTEGER},#{pagination.limit,jdbcType=INTEGER}</when>",
    "</script>"})
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
    List<LzAdsDiscoveryDwd> listByWhere(@Param("where") String where, @Param("orderby") String orderby, @Param("pagination") Pagination pagination);
}