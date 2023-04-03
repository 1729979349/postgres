package com.croky.postgres.dal.dao;

import com.croky.common.lang.Pagination;
import com.croky.postgres.dal.mapper.SpAdsDwdMapper;
import com.croky.postgres.dal.model.SpAdsDwd;
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
 * @date 2023-02-20 16:00:45
*/
@Mapper
public interface SpAdsDwdDAO extends SpAdsDwdMapper {
    /**

     */
    @Select({
        "select",
        "date_of_data, store_id, product_name_ad_name, status, product_id, ads_type, ",
        "placement_keyword, start_date, end_date, impression, clicks, ctr, conversions, ",
        "direct_conversions, conversion_rate, direct_conversion_rate, cost_per_conversion, ",
        "cost_per_direct_conversion, items_sold, direct_items_sold, gmv, direct_gmv, ",
        "expense, roi, direct_roi, cir, direct_cir, product_impressions, product_clicks, ",
        "product_ctr, flow_id",
        "from sp_ads_dwd",
        "for update"
    })
    @Results({
        @Result(column="date_of_data", property="dateOfData", jdbcType=JdbcType.DATE),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_name_ad_name", property="productNameAdName", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.VARCHAR),
        @Result(column="ads_type", property="adsType", jdbcType=JdbcType.VARCHAR),
        @Result(column="placement_keyword", property="placementKeyword", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_date", property="startDate", jdbcType=JdbcType.DATE),
        @Result(column="end_date", property="endDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="impression", property="impression", jdbcType=JdbcType.INTEGER),
        @Result(column="clicks", property="clicks", jdbcType=JdbcType.INTEGER),
        @Result(column="ctr", property="ctr", jdbcType=JdbcType.NUMERIC),
        @Result(column="conversions", property="conversions", jdbcType=JdbcType.INTEGER),
        @Result(column="direct_conversions", property="directConversions", jdbcType=JdbcType.INTEGER),
        @Result(column="conversion_rate", property="conversionRate", jdbcType=JdbcType.NUMERIC),
        @Result(column="direct_conversion_rate", property="directConversionRate", jdbcType=JdbcType.NUMERIC),
        @Result(column="cost_per_conversion", property="costPerConversion", jdbcType=JdbcType.NUMERIC),
        @Result(column="cost_per_direct_conversion", property="costPerDirectConversion", jdbcType=JdbcType.NUMERIC),
        @Result(column="items_sold", property="itemsSold", jdbcType=JdbcType.INTEGER),
        @Result(column="direct_items_sold", property="directItemsSold", jdbcType=JdbcType.INTEGER),
        @Result(column="gmv", property="gmv", jdbcType=JdbcType.NUMERIC),
        @Result(column="direct_gmv", property="directGmv", jdbcType=JdbcType.NUMERIC),
        @Result(column="expense", property="expense", jdbcType=JdbcType.NUMERIC),
        @Result(column="roi", property="roi", jdbcType=JdbcType.NUMERIC),
        @Result(column="direct_roi", property="directRoi", jdbcType=JdbcType.NUMERIC),
        @Result(column="cir", property="cir", jdbcType=JdbcType.NUMERIC),
        @Result(column="direct_cir", property="directCir", jdbcType=JdbcType.NUMERIC),
        @Result(column="product_impressions", property="productImpressions", jdbcType=JdbcType.INTEGER),
        @Result(column="product_clicks", property="productClicks", jdbcType=JdbcType.INTEGER),
        @Result(column="product_ctr", property="productCtr", jdbcType=JdbcType.NUMERIC),
        @Result(column="flow_id", property="flowId", jdbcType=JdbcType.VARCHAR)
    })
    SpAdsDwd getAndLock();

    /**

     */
    @Select({
        "select",
        "date_of_data, store_id, product_name_ad_name, status, product_id, ads_type, ",
        "placement_keyword, start_date, end_date, impression, clicks, ctr, conversions, ",
        "direct_conversions, conversion_rate, direct_conversion_rate, cost_per_conversion, ",
        "cost_per_direct_conversion, items_sold, direct_items_sold, gmv, direct_gmv, ",
        "expense, roi, direct_roi, cir, direct_cir, product_impressions, product_clicks, ",
        "product_ctr, flow_id",
        "from sp_ads_dwd",
        "lock in share mode"
    })
    @Results({
        @Result(column="date_of_data", property="dateOfData", jdbcType=JdbcType.DATE),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_name_ad_name", property="productNameAdName", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.VARCHAR),
        @Result(column="ads_type", property="adsType", jdbcType=JdbcType.VARCHAR),
        @Result(column="placement_keyword", property="placementKeyword", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_date", property="startDate", jdbcType=JdbcType.DATE),
        @Result(column="end_date", property="endDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="impression", property="impression", jdbcType=JdbcType.INTEGER),
        @Result(column="clicks", property="clicks", jdbcType=JdbcType.INTEGER),
        @Result(column="ctr", property="ctr", jdbcType=JdbcType.NUMERIC),
        @Result(column="conversions", property="conversions", jdbcType=JdbcType.INTEGER),
        @Result(column="direct_conversions", property="directConversions", jdbcType=JdbcType.INTEGER),
        @Result(column="conversion_rate", property="conversionRate", jdbcType=JdbcType.NUMERIC),
        @Result(column="direct_conversion_rate", property="directConversionRate", jdbcType=JdbcType.NUMERIC),
        @Result(column="cost_per_conversion", property="costPerConversion", jdbcType=JdbcType.NUMERIC),
        @Result(column="cost_per_direct_conversion", property="costPerDirectConversion", jdbcType=JdbcType.NUMERIC),
        @Result(column="items_sold", property="itemsSold", jdbcType=JdbcType.INTEGER),
        @Result(column="direct_items_sold", property="directItemsSold", jdbcType=JdbcType.INTEGER),
        @Result(column="gmv", property="gmv", jdbcType=JdbcType.NUMERIC),
        @Result(column="direct_gmv", property="directGmv", jdbcType=JdbcType.NUMERIC),
        @Result(column="expense", property="expense", jdbcType=JdbcType.NUMERIC),
        @Result(column="roi", property="roi", jdbcType=JdbcType.NUMERIC),
        @Result(column="direct_roi", property="directRoi", jdbcType=JdbcType.NUMERIC),
        @Result(column="cir", property="cir", jdbcType=JdbcType.NUMERIC),
        @Result(column="direct_cir", property="directCir", jdbcType=JdbcType.NUMERIC),
        @Result(column="product_impressions", property="productImpressions", jdbcType=JdbcType.INTEGER),
        @Result(column="product_clicks", property="productClicks", jdbcType=JdbcType.INTEGER),
        @Result(column="product_ctr", property="productCtr", jdbcType=JdbcType.NUMERIC),
        @Result(column="flow_id", property="flowId", jdbcType=JdbcType.VARCHAR)
    })
    SpAdsDwd getAndShareLock();

    /**

     */
    @Update({
    "update sp_ads_dwd ",
    "set status = -1",
    "where ",
    })
    int deleteByPrimaryKey(int key);

    /**

     */
    @Select({"<script> ",
        "select",
        "date_of_data, store_id, product_name_ad_name, status, product_id, ads_type, ",
        "placement_keyword, start_date, end_date, impression, clicks, ctr, conversions, ",
        "direct_conversions, conversion_rate, direct_conversion_rate, cost_per_conversion, ",
        "cost_per_direct_conversion, items_sold, direct_items_sold, gmv, direct_gmv, ",
        "expense, roi, direct_roi, cir, direct_cir, product_impressions, product_clicks, ",
        "product_ctr, flow_id",
        "from sp_ads_dwd",
    "<when test=\"where!=null and where!=''\">  where 1=1 and #{where,jdbcType=VARCHAR} </when>",
    "<when test=\"orderby!=null and orderby!=''\">  order by  #{orderby,jdbcType=VARCHAR}</when>",
    "<when test=\"pagination!=null\">  limit  #{pagination.offset,jdbcType=INTEGER},#{pagination.limit,jdbcType=INTEGER}</when>",
    "</script>"})
    @Results({
        @Result(column="date_of_data", property="dateOfData", jdbcType=JdbcType.DATE),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_name_ad_name", property="productNameAdName", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_id", property="productId", jdbcType=JdbcType.VARCHAR),
        @Result(column="ads_type", property="adsType", jdbcType=JdbcType.VARCHAR),
        @Result(column="placement_keyword", property="placementKeyword", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_date", property="startDate", jdbcType=JdbcType.DATE),
        @Result(column="end_date", property="endDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="impression", property="impression", jdbcType=JdbcType.INTEGER),
        @Result(column="clicks", property="clicks", jdbcType=JdbcType.INTEGER),
        @Result(column="ctr", property="ctr", jdbcType=JdbcType.NUMERIC),
        @Result(column="conversions", property="conversions", jdbcType=JdbcType.INTEGER),
        @Result(column="direct_conversions", property="directConversions", jdbcType=JdbcType.INTEGER),
        @Result(column="conversion_rate", property="conversionRate", jdbcType=JdbcType.NUMERIC),
        @Result(column="direct_conversion_rate", property="directConversionRate", jdbcType=JdbcType.NUMERIC),
        @Result(column="cost_per_conversion", property="costPerConversion", jdbcType=JdbcType.NUMERIC),
        @Result(column="cost_per_direct_conversion", property="costPerDirectConversion", jdbcType=JdbcType.NUMERIC),
        @Result(column="items_sold", property="itemsSold", jdbcType=JdbcType.INTEGER),
        @Result(column="direct_items_sold", property="directItemsSold", jdbcType=JdbcType.INTEGER),
        @Result(column="gmv", property="gmv", jdbcType=JdbcType.NUMERIC),
        @Result(column="direct_gmv", property="directGmv", jdbcType=JdbcType.NUMERIC),
        @Result(column="expense", property="expense", jdbcType=JdbcType.NUMERIC),
        @Result(column="roi", property="roi", jdbcType=JdbcType.NUMERIC),
        @Result(column="direct_roi", property="directRoi", jdbcType=JdbcType.NUMERIC),
        @Result(column="cir", property="cir", jdbcType=JdbcType.NUMERIC),
        @Result(column="direct_cir", property="directCir", jdbcType=JdbcType.NUMERIC),
        @Result(column="product_impressions", property="productImpressions", jdbcType=JdbcType.INTEGER),
        @Result(column="product_clicks", property="productClicks", jdbcType=JdbcType.INTEGER),
        @Result(column="product_ctr", property="productCtr", jdbcType=JdbcType.NUMERIC),
        @Result(column="flow_id", property="flowId", jdbcType=JdbcType.VARCHAR)
    })
    List<SpAdsDwd> listByWhere(@Param("where") String where, @Param("orderby") String orderby, @Param("pagination") Pagination pagination);
}