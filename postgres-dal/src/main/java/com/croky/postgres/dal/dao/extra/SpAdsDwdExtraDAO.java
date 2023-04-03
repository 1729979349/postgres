package com.croky.postgres.dal.dao.extra;

import com.croky.postgres.dal.dao.SpAdsDwdDAO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2023/2/20 16:01 星期一
 * Description shopee
 */
@Mapper
public interface SpAdsDwdExtraDAO extends SpAdsDwdDAO {

    @Select("select case when sum(expense)=0.0 then 0 else round(cast(sum(direct_gmv) as numeric) / cast(sum(expense) as numeric ),2) end as roi from sp_ads_dwd  where store_id =#{storeId,jdbcType=INTEGER} and ads_type=#{adsType,jdbcType=VARCHAR}  and current_date::timestamp+ '-1 year' <=date_of_data and current_date::timestamp+ '-2 day' >=date_of_data group by date_of_data having sum(expense)>0 and date_of_data ${contain} (select date_of_data from alert_date where country=#{country,jdbcType=VARCHAR} and (platform like '%Shopee%' or platform='' )) order by roi desc")
    List<Float> getRoiDescType(@Param("storeId") String storeId, @Param("adsType") String adsType,@Param("country") String country,@Param("contain") String contain);

    @Select("select case when sum(expense)=0.0 then 0 else round(cast(sum(direct_gmv) as numeric) / cast(sum(expense) as numeric ),2) end as roi from sp_ads_dwd  where store_id =#{storeId,jdbcType=INTEGER} and (ads_type=#{adsType,jdbcType=VARCHAR} or ads_type=#{adsTypeTwo,jdbcType=VARCHAR})  and current_date::timestamp+ '-1 year' <=date_of_data and current_date::timestamp+ '-2 day' >=date_of_data group by date_of_data having sum(expense)>0 and date_of_data ${contain} (select date_of_data from alert_date where country=#{country,jdbcType=VARCHAR} and (platform like '%Shopee%' or platform='' )) order by roi desc")
    List<Float> getRoiDescTypeTwo(@Param("storeId") String storeId, @Param("adsType") String adsType, @Param("adsTypeTwo") String adsTypeTow,@Param("country") String country,@Param("contain") String contain);

    @Select("select case when sum(expense)=0.0 then 0 else round(cast(sum(direct_gmv) as numeric) / cast(sum(expense) as numeric ),2) end as roi from sp_ads_dwd  where store_id =#{storeId,jdbcType=INTEGER}  and current_date::timestamp+ '-1 year' <=date_of_data and current_date::timestamp+ '-2 day' >=date_of_data group by date_of_data having sum(expense)>0 and date_of_data ${contain} (select date_of_data from alert_date where country=#{country,jdbcType=VARCHAR} and (platform like '%Shopee%' or platform='' )) order by roi desc")
    List<Float> getRoiDescTypeAll(@Param("storeId") String storeId,@Param("country") String country,@Param("contain") String contain);

    @Select("select sum(expense) as investment,case when sum(expense)=0.0 then 0 else round(cast(sum(direct_gmv) as numeric) / cast(sum(expense) as numeric ),2) end as roi from sp_ads_dwd  where store_id =#{storeId,jdbcType=INTEGER} and ads_type=#{adsType,jdbcType=VARCHAR} group by date_of_data having current_date::timestamp+ '-1 day' = date_of_data")
    Map<String, Object> getYesterdayRoi(@Param("storeId") String storeId, @Param("adsType") String adsType);

    @Select("select sum(expense) as investment,case when sum(expense)=0.0 then 0 else round(cast(sum(direct_gmv) as numeric) / cast(sum(expense) as numeric ),2) end as roi from sp_ads_dwd  where store_id =#{storeId,jdbcType=INTEGER} and (ads_type=#{adsType,jdbcType=VARCHAR} or ads_type=#{adsTypeTwo,jdbcType=VARCHAR}) group by date_of_data having current_date::timestamp+ '-1 day' = date_of_data")
    Map<String, Object> getYesterdayRoiTwo(@Param("storeId") String storeId, @Param("adsType") String adsType, @Param("adsTypeTwo") String adsTypeTow);

    @Select("select sum(expense) as investment,case when sum(expense)=0.0 then 0 else round(cast(sum(direct_gmv) as numeric) / cast(sum(expense) as numeric ),2) end as roi from sp_ads_dwd  where store_id =#{storeId,jdbcType=INTEGER}  group by date_of_data having current_date::timestamp+ '-1 day' = date_of_data")
    Map<String, Object> getYesterdayRoiAll(@Param("storeId") String storeId);

}
