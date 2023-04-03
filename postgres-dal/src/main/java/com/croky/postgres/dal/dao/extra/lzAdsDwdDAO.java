package com.croky.postgres.dal.dao.extra;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2023/2/22 15:05 星期三
 * Description lazada
 */
@Mapper
public interface lzAdsDwdDAO {

    @Select("select case when sum(spend)=0.0 then 0 else round(cast(sum(direct_revenue) as numeric) / cast(sum(spend) as numeric ),2) end as roi from lz_ads_discovery_dwd where store_id=#{storeId,jdbcType=INTEGER} and (placement ='All - Sponsored Products' or placement= 'All - Sponsored Search') and campaign_type=#{campaignType,jdbcType=VARCHAR} and (currency ='MYR' or currency ='SGD' or currency ='THB')  and current_date::timestamp+ '-1 year' <=date_of_data and current_date::timestamp+ '-2 day' >=date_of_data group by date_of_data having sum(spend) >0 and date_of_data ${contain} (select date_of_data from alert_date where country=#{country,jdbcType=VARCHAR} and (platform like '%Lazada%' or platform='' ))  order by roi desc")
    List<Float> getLazadaIsNotIDRCampaignTypeRoi(@Param("storeId") String storeId, @Param("campaignType") String campaignType,@Param("country") String country,@Param("contain") String contain);

    @Select("select case when sum(spend)=0.0 then 0 else round(cast(sum(direct_revenue) as numeric) / cast(sum(spend) as numeric ),2) end as roi from lz_ads_discovery_dwd where store_id=#{storeId,jdbcType=INTEGER} and placement =#{placement,jdbcType=VARCHAR} and campaign_type=#{campaignType,jdbcType=VARCHAR} and (currency ='MYR' or currency ='SGD' or currency ='THB')  and current_date::timestamp+ '-1 year' <=date_of_data and current_date::timestamp+ '-2 day' >=date_of_data group by date_of_data having sum(spend) >0 and date_of_data ${contain} (select date_of_data from alert_date where country=#{country,jdbcType=VARCHAR} and (platform like '%Lazada%' or platform='' )) order by roi desc")
    List<Float> getLazadaIsNotIDRCampaignTypeAndPlacementRoi(@Param("storeId") String storeId, @Param("placement") String placement, @Param("campaignType") String campaignType,@Param("country") String country,@Param("contain") String contain);

    @Select("select case when sum(spend)=0.0 then 0 else round(cast(sum(direct_revenue) as numeric) / cast(sum(spend) as numeric ),2) end as roi from lz_ads_discovery_dwd where store_id=#{storeId,jdbcType=INTEGER} and placement =#{placement,jdbcType=VARCHAR} and campaign_type=#{campaignType,jdbcType=VARCHAR} and currency ='IDR'   and current_date::timestamp+ '-1 year' <=date_of_data and current_date::timestamp+ '-2 day' >=date_of_data group by date_of_data having sum(spend) >0 and date_of_data ${contain} (select date_of_data from alert_date where country=#{country,jdbcType=VARCHAR} and (platform like '%Lazada%' or platform='' )) order by roi desc")
    List<Float> getLazadaIsIDRCampaignTypeAndPlacementRoi(@Param("storeId") String storeId, @Param("placement") String placement, @Param("campaignType") String campaignType,@Param("country") String country,@Param("contain") String contain);

    @Select("select sum(spend) as investment, case when sum(spend)=0.0 then 0 else round(cast(sum(direct_revenue) as numeric) / cast(sum(spend) as numeric ),2) end as roi from lz_ads_discovery_dwd where store_id=#{storeId,jdbcType=INTEGER} and (placement ='All - Sponsored Products' or placement= 'All - Sponsored Search') and campaign_type=#{campaignType,jdbcType=VARCHAR} and (currency ='MYR' or currency ='SGD' or currency ='THB') group by date_of_data having current_date::timestamp+ '-1 day' =date_of_data")
    Map<String, Object> getLazadaIsNotIDRCampaignTypeYesterdayRoi(@Param("storeId") String storeId, @Param("campaignType") String campaignType);

    @Select("select sum(spend) as investment, case when sum(spend)=0.0 then 0 else round(cast(sum(direct_revenue) as numeric) / cast(sum(spend) as numeric ),2) end as roi from lz_ads_discovery_dwd where store_id=#{storeId,jdbcType=INTEGER} and placement =#{placement,jdbcType=VARCHAR} and campaign_type=#{campaignType,jdbcType=VARCHAR} and (currency ='MYR' or currency ='SGD' or currency ='THB') group by date_of_data having current_date::timestamp+ '-1 day' =date_of_data")
    Map<String, Object> getLazadaIsNotIDRCampaignTypeAndPlacementYesterdayRoi(@Param("storeId") String storeId, @Param("placement") String placement, @Param("campaignType") String campaignType);

    @Select("select sum(spend) as investment, case when sum(spend)=0.0 then 0 else round(cast(sum(direct_revenue) as numeric) / cast(sum(spend) as numeric ),2) end as roi from lz_ads_discovery_dwd where store_id=#{storeId,jdbcType=INTEGER} and placement =#{placement,jdbcType=VARCHAR} and campaign_type=#{campaignType,jdbcType=VARCHAR} and currency ='IDR'  group by date_of_data having current_date::timestamp+ '-1 day' =date_of_data")
    Map<String, Object> getLazadaIsIDRCampaignTypeAndPlacementYesterdayRoi(@Param("storeId") String storeId, @Param("placement") String placement, @Param("campaignType") String campaignType);


}
