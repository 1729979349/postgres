package com.croky.postgres.dal.mapper;

import com.croky.postgres.dal.model.LzAdsDiscoveryDwd;
import com.croky.postgres.dal.model.LzAdsDiscoveryDwdExample.Criteria;
import com.croky.postgres.dal.model.LzAdsDiscoveryDwdExample.Criterion;
import com.croky.postgres.dal.model.LzAdsDiscoveryDwdExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

/**
 * @author Croky.Zheng
 * @date 2023-02-20 11:23:50
*/
public class LzAdsDiscoveryDwdSqlProvider {
    /**

     */
    public String countByExample(LzAdsDiscoveryDwdExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("lz_ads_discovery_dwd");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**

     */
    public String insertSelective(LzAdsDiscoveryDwd row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("lz_ads_discovery_dwd");
        
        if (row.getDateOfData() != null) {
            sql.VALUES("date_of_data", "#{dateOfData,jdbcType=DATE}");
        }
        
        if (row.getStoreId() != null) {
            sql.VALUES("store_id", "#{storeId,jdbcType=VARCHAR}");
        }
        
        if (row.getDate() != null) {
            sql.VALUES("date", "#{date,jdbcType=VARCHAR}");
        }
        
        if (row.getCampaignName() != null) {
            sql.VALUES("campaign_name", "#{campaignName,jdbcType=VARCHAR}");
        }
        
        if (row.getCampaignId() != null) {
            sql.VALUES("campaign_id", "#{campaignId,jdbcType=VARCHAR}");
        }
        
        if (row.getCampaignObjective() != null) {
            sql.VALUES("campaign_objective", "#{campaignObjective,jdbcType=VARCHAR}");
        }
        
        if (row.getCampaignType() != null) {
            sql.VALUES("campaign_type", "#{campaignType,jdbcType=VARCHAR}");
        }
        
        if (row.getPlacement() != null) {
            sql.VALUES("placement", "#{placement,jdbcType=VARCHAR}");
        }
        
        if (row.getBudget() != null) {
            sql.VALUES("budget", "#{budget,jdbcType=INTEGER}");
        }
        
        if (row.getSpend() != null) {
            sql.VALUES("spend", "#{spend,jdbcType=NUMERIC}");
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
        
        if (row.getCpc() != null) {
            sql.VALUES("cpc", "#{cpc,jdbcType=NUMERIC}");
        }
        
        if (row.getStoreAddToCartUnits() != null) {
            sql.VALUES("store_add_to_cart_units", "#{storeAddToCartUnits,jdbcType=INTEGER}");
        }
        
        if (row.getStoreOrders() != null) {
            sql.VALUES("store_orders", "#{storeOrders,jdbcType=INTEGER}");
        }
        
        if (row.getStoreCvr() != null) {
            sql.VALUES("store_cvr", "#{storeCvr,jdbcType=NUMERIC}");
        }
        
        if (row.getStoreUnitsSold() != null) {
            sql.VALUES("store_units_sold", "#{storeUnitsSold,jdbcType=INTEGER}");
        }
        
        if (row.getStoreRevenue() != null) {
            sql.VALUES("store_revenue", "#{storeRevenue,jdbcType=NUMERIC}");
        }
        
        if (row.getStoreRoi() != null) {
            sql.VALUES("store_roi", "#{storeRoi,jdbcType=NUMERIC}");
        }
        
        if (row.getDirectAddToCartUnits() != null) {
            sql.VALUES("direct_add_to_cart_units", "#{directAddToCartUnits,jdbcType=INTEGER}");
        }
        
        if (row.getDirectOrders() != null) {
            sql.VALUES("direct_orders", "#{directOrders,jdbcType=INTEGER}");
        }
        
        if (row.getDirectCvr() != null) {
            sql.VALUES("direct_cvr", "#{directCvr,jdbcType=NUMERIC}");
        }
        
        if (row.getDirectUnitsSold() != null) {
            sql.VALUES("direct_units_sold", "#{directUnitsSold,jdbcType=INTEGER}");
        }
        
        if (row.getDirectRevenue() != null) {
            sql.VALUES("direct_revenue", "#{directRevenue,jdbcType=NUMERIC}");
        }
        
        if (row.getCurrency() != null) {
            sql.VALUES("currency", "#{currency,jdbcType=VARCHAR}");
        }
        
        if (row.getFlowId() != null) {
            sql.VALUES("flow_id", "#{flowId,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**

     */
    public String selectByExample(LzAdsDiscoveryDwdExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("date_of_data");
        } else {
            sql.SELECT("date_of_data");
        }
        sql.SELECT("store_id");
        sql.SELECT("date");
        sql.SELECT("campaign_name");
        sql.SELECT("campaign_id");
        sql.SELECT("campaign_objective");
        sql.SELECT("campaign_type");
        sql.SELECT("placement");
        sql.SELECT("budget");
        sql.SELECT("spend");
        sql.SELECT("impression");
        sql.SELECT("clicks");
        sql.SELECT("ctr");
        sql.SELECT("cpc");
        sql.SELECT("store_add_to_cart_units");
        sql.SELECT("store_orders");
        sql.SELECT("store_cvr");
        sql.SELECT("store_units_sold");
        sql.SELECT("store_revenue");
        sql.SELECT("store_roi");
        sql.SELECT("direct_add_to_cart_units");
        sql.SELECT("direct_orders");
        sql.SELECT("direct_cvr");
        sql.SELECT("direct_units_sold");
        sql.SELECT("direct_revenue");
        sql.SELECT("currency");
        sql.SELECT("flow_id");
        sql.FROM("lz_ads_discovery_dwd");
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
        LzAdsDiscoveryDwd row = (LzAdsDiscoveryDwd) parameter.get("row");
        LzAdsDiscoveryDwdExample example = (LzAdsDiscoveryDwdExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("lz_ads_discovery_dwd");
        
        if (row.getDateOfData() != null) {
            sql.SET("date_of_data = #{row.dateOfData,jdbcType=DATE}");
        }
        
        if (row.getStoreId() != null) {
            sql.SET("store_id = #{row.storeId,jdbcType=VARCHAR}");
        }
        
        if (row.getDate() != null) {
            sql.SET("date = #{row.date,jdbcType=VARCHAR}");
        }
        
        if (row.getCampaignName() != null) {
            sql.SET("campaign_name = #{row.campaignName,jdbcType=VARCHAR}");
        }
        
        if (row.getCampaignId() != null) {
            sql.SET("campaign_id = #{row.campaignId,jdbcType=VARCHAR}");
        }
        
        if (row.getCampaignObjective() != null) {
            sql.SET("campaign_objective = #{row.campaignObjective,jdbcType=VARCHAR}");
        }
        
        if (row.getCampaignType() != null) {
            sql.SET("campaign_type = #{row.campaignType,jdbcType=VARCHAR}");
        }
        
        if (row.getPlacement() != null) {
            sql.SET("placement = #{row.placement,jdbcType=VARCHAR}");
        }
        
        if (row.getBudget() != null) {
            sql.SET("budget = #{row.budget,jdbcType=INTEGER}");
        }
        
        if (row.getSpend() != null) {
            sql.SET("spend = #{row.spend,jdbcType=NUMERIC}");
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
        
        if (row.getCpc() != null) {
            sql.SET("cpc = #{row.cpc,jdbcType=NUMERIC}");
        }
        
        if (row.getStoreAddToCartUnits() != null) {
            sql.SET("store_add_to_cart_units = #{row.storeAddToCartUnits,jdbcType=INTEGER}");
        }
        
        if (row.getStoreOrders() != null) {
            sql.SET("store_orders = #{row.storeOrders,jdbcType=INTEGER}");
        }
        
        if (row.getStoreCvr() != null) {
            sql.SET("store_cvr = #{row.storeCvr,jdbcType=NUMERIC}");
        }
        
        if (row.getStoreUnitsSold() != null) {
            sql.SET("store_units_sold = #{row.storeUnitsSold,jdbcType=INTEGER}");
        }
        
        if (row.getStoreRevenue() != null) {
            sql.SET("store_revenue = #{row.storeRevenue,jdbcType=NUMERIC}");
        }
        
        if (row.getStoreRoi() != null) {
            sql.SET("store_roi = #{row.storeRoi,jdbcType=NUMERIC}");
        }
        
        if (row.getDirectAddToCartUnits() != null) {
            sql.SET("direct_add_to_cart_units = #{row.directAddToCartUnits,jdbcType=INTEGER}");
        }
        
        if (row.getDirectOrders() != null) {
            sql.SET("direct_orders = #{row.directOrders,jdbcType=INTEGER}");
        }
        
        if (row.getDirectCvr() != null) {
            sql.SET("direct_cvr = #{row.directCvr,jdbcType=NUMERIC}");
        }
        
        if (row.getDirectUnitsSold() != null) {
            sql.SET("direct_units_sold = #{row.directUnitsSold,jdbcType=INTEGER}");
        }
        
        if (row.getDirectRevenue() != null) {
            sql.SET("direct_revenue = #{row.directRevenue,jdbcType=NUMERIC}");
        }
        
        if (row.getCurrency() != null) {
            sql.SET("currency = #{row.currency,jdbcType=VARCHAR}");
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
        sql.UPDATE("lz_ads_discovery_dwd");
        
        sql.SET("date_of_data = #{row.dateOfData,jdbcType=DATE}");
        sql.SET("store_id = #{row.storeId,jdbcType=VARCHAR}");
        sql.SET("date = #{row.date,jdbcType=VARCHAR}");
        sql.SET("campaign_name = #{row.campaignName,jdbcType=VARCHAR}");
        sql.SET("campaign_id = #{row.campaignId,jdbcType=VARCHAR}");
        sql.SET("campaign_objective = #{row.campaignObjective,jdbcType=VARCHAR}");
        sql.SET("campaign_type = #{row.campaignType,jdbcType=VARCHAR}");
        sql.SET("placement = #{row.placement,jdbcType=VARCHAR}");
        sql.SET("budget = #{row.budget,jdbcType=INTEGER}");
        sql.SET("spend = #{row.spend,jdbcType=NUMERIC}");
        sql.SET("impression = #{row.impression,jdbcType=INTEGER}");
        sql.SET("clicks = #{row.clicks,jdbcType=INTEGER}");
        sql.SET("ctr = #{row.ctr,jdbcType=NUMERIC}");
        sql.SET("cpc = #{row.cpc,jdbcType=NUMERIC}");
        sql.SET("store_add_to_cart_units = #{row.storeAddToCartUnits,jdbcType=INTEGER}");
        sql.SET("store_orders = #{row.storeOrders,jdbcType=INTEGER}");
        sql.SET("store_cvr = #{row.storeCvr,jdbcType=NUMERIC}");
        sql.SET("store_units_sold = #{row.storeUnitsSold,jdbcType=INTEGER}");
        sql.SET("store_revenue = #{row.storeRevenue,jdbcType=NUMERIC}");
        sql.SET("store_roi = #{row.storeRoi,jdbcType=NUMERIC}");
        sql.SET("direct_add_to_cart_units = #{row.directAddToCartUnits,jdbcType=INTEGER}");
        sql.SET("direct_orders = #{row.directOrders,jdbcType=INTEGER}");
        sql.SET("direct_cvr = #{row.directCvr,jdbcType=NUMERIC}");
        sql.SET("direct_units_sold = #{row.directUnitsSold,jdbcType=INTEGER}");
        sql.SET("direct_revenue = #{row.directRevenue,jdbcType=NUMERIC}");
        sql.SET("currency = #{row.currency,jdbcType=VARCHAR}");
        sql.SET("flow_id = #{row.flowId,jdbcType=VARCHAR}");
        
        LzAdsDiscoveryDwdExample example = (LzAdsDiscoveryDwdExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**

     */
    protected void applyWhere(SQL sql, LzAdsDiscoveryDwdExample example, boolean includeExamplePhrase) {
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