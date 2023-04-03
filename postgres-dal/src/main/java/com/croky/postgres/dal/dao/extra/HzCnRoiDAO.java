package com.croky.postgres.dal.dao.extra;

import com.croky.postgres.dal.mapper.AlertDateSqlProvider;
import com.croky.postgres.dal.model.AlertDate;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * @author: zzh
 * @version: 1.0
 * @date: 2023/2/27 14:03 星期一
 * Description CN 国内平台
 */
@Mapper
public interface HzCnRoiDAO {


    @Select("select coalesce(case when sum(${transactionAmount})='NaN' then 0 else round(cast(sum(${transactionAmount}) as numeric) / cast(sum(${spend}) as numeric ),2) end,0) as roi from ${table}  where store_id like #{storeId,jdbcType=VARCHAR} and current_date::timestamp+ '-1 year' <=date_of_data and current_date::timestamp+ '-2 day' >=date_of_data group by date_of_data having sum(${spend})>0 and sum(${spend})!='NaN' and date_of_data ${contain} (select date_of_data from alert_date where country=#{country,jdbcType=VARCHAR} and  platform='' ) order by roi desc")
    List<Float> getCNShopNameAll(@Param("storeId") String storeId, @Param("table") String table, @Param("transactionAmount") String transactionAmount, @Param("spend") String spend,@Param("country") String country,@Param("contain") String contain);

    @Select("select case when sum(${spend})='NaN' then 0 else sum(${spend}) end as investment, case when sum(${transactionAmount})='NaN' then 0 else round(cast(sum(${transactionAmount}) as numeric) / cast(sum(${spend}) as numeric ),2) end as roi from ${table}  where store_id like #{storeId,jdbcType=VARCHAR} group by date_of_data having current_date::timestamp+ '-1 day' =date_of_data")
    Map<String, Object> getCNShopNameYesterday(@Param("storeId") String storeId, @Param("table") String table, @Param("transactionAmount") String transactionAmount, @Param("spend") String spend);


}
