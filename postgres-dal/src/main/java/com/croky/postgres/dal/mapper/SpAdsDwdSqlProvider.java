package com.croky.postgres.dal.mapper;

import com.croky.postgres.dal.model.SpAdsDwd;
import com.croky.postgres.dal.model.SpAdsDwdExample.Criteria;
import com.croky.postgres.dal.model.SpAdsDwdExample.Criterion;
import com.croky.postgres.dal.model.SpAdsDwdExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

/**
 * @author Croky.Zheng
 * @date 2023-02-20 16:00:45
*/
public class SpAdsDwdSqlProvider {
    /**

     */
    public String countByExample(SpAdsDwdExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("sp_ads_dwd");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**

     */
    public String insertSelective(SpAdsDwd row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("sp_ads_dwd");
        
        if (row.getDateOfData() != null) {
            sql.VALUES("date_of_data", "#{dateOfData,jdbcType=DATE}");
        }
        
        if (row.getStoreId() != null) {
            sql.VALUES("store_id", "#{storeId,jdbcType=VARCHAR}");
        }
        
        if (row.getProductNameAdName() != null) {
            sql.VALUES("product_name_ad_name", "#{productNameAdName,jdbcType=VARCHAR}");
        }
        
        if (row.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=VARCHAR}");
        }
        
        if (row.getProductId() != null) {
            sql.VALUES("product_id", "#{productId,jdbcType=VARCHAR}");
        }
        
        if (row.getAdsType() != null) {
            sql.VALUES("ads_type", "#{adsType,jdbcType=VARCHAR}");
        }
        
        if (row.getPlacementKeyword() != null) {
            sql.VALUES("placement_keyword", "#{placementKeyword,jdbcType=VARCHAR}");
        }
        
        if (row.getStartDate() != null) {
            sql.VALUES("start_date", "#{startDate,jdbcType=DATE}");
        }
        
        if (row.getEndDate() != null) {
            sql.VALUES("end_date", "#{endDate,jdbcType=VARCHAR}");
        }
        
        if (row.getImpression() != null) {
            sql.VALUES("impression", "#{impression,jdbcType=INTEGER}");
        }
        
        if (row.getClicks() != null) {
            sql.VALUES("clicks", "#{clicks,jdbcType=INTEGER}");
        }
        
        if (row.getCtr() != null) {
            sql.VALUES("ctr", "#{ctr,jdbcType=NUMERIC}");
        }
        
        if (row.getConversions() != null) {
            sql.VALUES("conversions", "#{conversions,jdbcType=INTEGER}");
        }
        
        if (row.getDirectConversions() != null) {
            sql.VALUES("direct_conversions", "#{directConversions,jdbcType=INTEGER}");
        }
        
        if (row.getConversionRate() != null) {
            sql.VALUES("conversion_rate", "#{conversionRate,jdbcType=NUMERIC}");
        }
        
        if (row.getDirectConversionRate() != null) {
            sql.VALUES("direct_conversion_rate", "#{directConversionRate,jdbcType=NUMERIC}");
        }
        
        if (row.getCostPerConversion() != null) {
            sql.VALUES("cost_per_conversion", "#{costPerConversion,jdbcType=NUMERIC}");
        }
        
        if (row.getCostPerDirectConversion() != null) {
            sql.VALUES("cost_per_direct_conversion", "#{costPerDirectConversion,jdbcType=NUMERIC}");
        }
        
        if (row.getItemsSold() != null) {
            sql.VALUES("items_sold", "#{itemsSold,jdbcType=INTEGER}");
        }
        
        if (row.getDirectItemsSold() != null) {
            sql.VALUES("direct_items_sold", "#{directItemsSold,jdbcType=INTEGER}");
        }
        
        if (row.getGmv() != null) {
            sql.VALUES("gmv", "#{gmv,jdbcType=NUMERIC}");
        }
        
        if (row.getDirectGmv() != null) {
            sql.VALUES("direct_gmv", "#{directGmv,jdbcType=NUMERIC}");
        }
        
        if (row.getExpense() != null) {
            sql.VALUES("expense", "#{expense,jdbcType=NUMERIC}");
        }
        
        if (row.getRoi() != null) {
            sql.VALUES("roi", "#{roi,jdbcType=NUMERIC}");
        }
        
        if (row.getDirectRoi() != null) {
            sql.VALUES("direct_roi", "#{directRoi,jdbcType=NUMERIC}");
        }
        
        if (row.getCir() != null) {
            sql.VALUES("cir", "#{cir,jdbcType=NUMERIC}");
        }
        
        if (row.getDirectCir() != null) {
            sql.VALUES("direct_cir", "#{directCir,jdbcType=NUMERIC}");
        }
        
        if (row.getProductImpressions() != null) {
            sql.VALUES("product_impressions", "#{productImpressions,jdbcType=INTEGER}");
        }
        
        if (row.getProductClicks() != null) {
            sql.VALUES("product_clicks", "#{productClicks,jdbcType=INTEGER}");
        }
        
        if (row.getProductCtr() != null) {
            sql.VALUES("product_ctr", "#{productCtr,jdbcType=NUMERIC}");
        }
        
        if (row.getFlowId() != null) {
            sql.VALUES("flow_id", "#{flowId,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**

     */
    public String selectByExample(SpAdsDwdExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("date_of_data");
        } else {
            sql.SELECT("date_of_data");
        }
        sql.SELECT("store_id");
        sql.SELECT("product_name_ad_name");
        sql.SELECT("status");
        sql.SELECT("product_id");
        sql.SELECT("ads_type");
        sql.SELECT("placement_keyword");
        sql.SELECT("start_date");
        sql.SELECT("end_date");
        sql.SELECT("impression");
        sql.SELECT("clicks");
        sql.SELECT("ctr");
        sql.SELECT("conversions");
        sql.SELECT("direct_conversions");
        sql.SELECT("conversion_rate");
        sql.SELECT("direct_conversion_rate");
        sql.SELECT("cost_per_conversion");
        sql.SELECT("cost_per_direct_conversion");
        sql.SELECT("items_sold");
        sql.SELECT("direct_items_sold");
        sql.SELECT("gmv");
        sql.SELECT("direct_gmv");
        sql.SELECT("expense");
        sql.SELECT("roi");
        sql.SELECT("direct_roi");
        sql.SELECT("cir");
        sql.SELECT("direct_cir");
        sql.SELECT("product_impressions");
        sql.SELECT("product_clicks");
        sql.SELECT("product_ctr");
        sql.SELECT("flow_id");
        sql.FROM("sp_ads_dwd");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        StringBuffer buffer = new StringBuffer();
        buffer.append(sql.toString());
        if ((null != example) && (example.getLimit() > 0)) {
            buffer.append(" limit ");
            if (example.getOffset() > 0) {
                buffer.append(example.getOffset()).append(" , ");
            }
            buffer.append(example.getLimit());
        }
        return buffer.toString();
    }

    /**

     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        SpAdsDwd row = (SpAdsDwd) parameter.get("row");
        SpAdsDwdExample example = (SpAdsDwdExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("sp_ads_dwd");
        
        if (row.getDateOfData() != null) {
            sql.SET("date_of_data = #{row.dateOfData,jdbcType=DATE}");
        }
        
        if (row.getStoreId() != null) {
            sql.SET("store_id = #{row.storeId,jdbcType=VARCHAR}");
        }
        
        if (row.getProductNameAdName() != null) {
            sql.SET("product_name_ad_name = #{row.productNameAdName,jdbcType=VARCHAR}");
        }
        
        if (row.getStatus() != null) {
            sql.SET("status = #{row.status,jdbcType=VARCHAR}");
        }
        
        if (row.getProductId() != null) {
            sql.SET("product_id = #{row.productId,jdbcType=VARCHAR}");
        }
        
        if (row.getAdsType() != null) {
            sql.SET("ads_type = #{row.adsType,jdbcType=VARCHAR}");
        }
        
        if (row.getPlacementKeyword() != null) {
            sql.SET("placement_keyword = #{row.placementKeyword,jdbcType=VARCHAR}");
        }
        
        if (row.getStartDate() != null) {
            sql.SET("start_date = #{row.startDate,jdbcType=DATE}");
        }
        
        if (row.getEndDate() != null) {
            sql.SET("end_date = #{row.endDate,jdbcType=VARCHAR}");
        }
        
        if (row.getImpression() != null) {
            sql.SET("impression = #{row.impression,jdbcType=INTEGER}");
        }
        
        if (row.getClicks() != null) {
            sql.SET("clicks = #{row.clicks,jdbcType=INTEGER}");
        }
        
        if (row.getCtr() != null) {
            sql.SET("ctr = #{row.ctr,jdbcType=NUMERIC}");
        }
        
        if (row.getConversions() != null) {
            sql.SET("conversions = #{row.conversions,jdbcType=INTEGER}");
        }
        
        if (row.getDirectConversions() != null) {
            sql.SET("direct_conversions = #{row.directConversions,jdbcType=INTEGER}");
        }
        
        if (row.getConversionRate() != null) {
            sql.SET("conversion_rate = #{row.conversionRate,jdbcType=NUMERIC}");
        }
        
        if (row.getDirectConversionRate() != null) {
            sql.SET("direct_conversion_rate = #{row.directConversionRate,jdbcType=NUMERIC}");
        }
        
        if (row.getCostPerConversion() != null) {
            sql.SET("cost_per_conversion = #{row.costPerConversion,jdbcType=NUMERIC}");
        }
        
        if (row.getCostPerDirectConversion() != null) {
            sql.SET("cost_per_direct_conversion = #{row.costPerDirectConversion,jdbcType=NUMERIC}");
        }
        
        if (row.getItemsSold() != null) {
            sql.SET("items_sold = #{row.itemsSold,jdbcType=INTEGER}");
        }
        
        if (row.getDirectItemsSold() != null) {
            sql.SET("direct_items_sold = #{row.directItemsSold,jdbcType=INTEGER}");
        }
        
        if (row.getGmv() != null) {
            sql.SET("gmv = #{row.gmv,jdbcType=NUMERIC}");
        }
        
        if (row.getDirectGmv() != null) {
            sql.SET("direct_gmv = #{row.directGmv,jdbcType=NUMERIC}");
        }
        
        if (row.getExpense() != null) {
            sql.SET("expense = #{row.expense,jdbcType=NUMERIC}");
        }
        
        if (row.getRoi() != null) {
            sql.SET("roi = #{row.roi,jdbcType=NUMERIC}");
        }
        
        if (row.getDirectRoi() != null) {
            sql.SET("direct_roi = #{row.directRoi,jdbcType=NUMERIC}");
        }
        
        if (row.getCir() != null) {
            sql.SET("cir = #{row.cir,jdbcType=NUMERIC}");
        }
        
        if (row.getDirectCir() != null) {
            sql.SET("direct_cir = #{row.directCir,jdbcType=NUMERIC}");
        }
        
        if (row.getProductImpressions() != null) {
            sql.SET("product_impressions = #{row.productImpressions,jdbcType=INTEGER}");
        }
        
        if (row.getProductClicks() != null) {
            sql.SET("product_clicks = #{row.productClicks,jdbcType=INTEGER}");
        }
        
        if (row.getProductCtr() != null) {
            sql.SET("product_ctr = #{row.productCtr,jdbcType=NUMERIC}");
        }
        
        if (row.getFlowId() != null) {
            sql.SET("flow_id = #{row.flowId,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**

     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("sp_ads_dwd");
        
        sql.SET("date_of_data = #{row.dateOfData,jdbcType=DATE}");
        sql.SET("store_id = #{row.storeId,jdbcType=VARCHAR}");
        sql.SET("product_name_ad_name = #{row.productNameAdName,jdbcType=VARCHAR}");
        sql.SET("status = #{row.status,jdbcType=VARCHAR}");
        sql.SET("product_id = #{row.productId,jdbcType=VARCHAR}");
        sql.SET("ads_type = #{row.adsType,jdbcType=VARCHAR}");
        sql.SET("placement_keyword = #{row.placementKeyword,jdbcType=VARCHAR}");
        sql.SET("start_date = #{row.startDate,jdbcType=DATE}");
        sql.SET("end_date = #{row.endDate,jdbcType=VARCHAR}");
        sql.SET("impression = #{row.impression,jdbcType=INTEGER}");
        sql.SET("clicks = #{row.clicks,jdbcType=INTEGER}");
        sql.SET("ctr = #{row.ctr,jdbcType=NUMERIC}");
        sql.SET("conversions = #{row.conversions,jdbcType=INTEGER}");
        sql.SET("direct_conversions = #{row.directConversions,jdbcType=INTEGER}");
        sql.SET("conversion_rate = #{row.conversionRate,jdbcType=NUMERIC}");
        sql.SET("direct_conversion_rate = #{row.directConversionRate,jdbcType=NUMERIC}");
        sql.SET("cost_per_conversion = #{row.costPerConversion,jdbcType=NUMERIC}");
        sql.SET("cost_per_direct_conversion = #{row.costPerDirectConversion,jdbcType=NUMERIC}");
        sql.SET("items_sold = #{row.itemsSold,jdbcType=INTEGER}");
        sql.SET("direct_items_sold = #{row.directItemsSold,jdbcType=INTEGER}");
        sql.SET("gmv = #{row.gmv,jdbcType=NUMERIC}");
        sql.SET("direct_gmv = #{row.directGmv,jdbcType=NUMERIC}");
        sql.SET("expense = #{row.expense,jdbcType=NUMERIC}");
        sql.SET("roi = #{row.roi,jdbcType=NUMERIC}");
        sql.SET("direct_roi = #{row.directRoi,jdbcType=NUMERIC}");
        sql.SET("cir = #{row.cir,jdbcType=NUMERIC}");
        sql.SET("direct_cir = #{row.directCir,jdbcType=NUMERIC}");
        sql.SET("product_impressions = #{row.productImpressions,jdbcType=INTEGER}");
        sql.SET("product_clicks = #{row.productClicks,jdbcType=INTEGER}");
        sql.SET("product_ctr = #{row.productCtr,jdbcType=NUMERIC}");
        sql.SET("flow_id = #{row.flowId,jdbcType=VARCHAR}");
        
        SpAdsDwdExample example = (SpAdsDwdExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**

     */
    protected void applyWhere(SQL sql, SpAdsDwdExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}