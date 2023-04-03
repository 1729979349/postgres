package com.croky.postgres.dal.mapper;

import com.croky.postgres.dal.model.CompetitionMonitoring;
import com.croky.postgres.dal.model.CompetitionMonitoringExample.Criteria;
import com.croky.postgres.dal.model.CompetitionMonitoringExample.Criterion;
import com.croky.postgres.dal.model.CompetitionMonitoringExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

/**
 * @author Croky.Zheng
 * @date 2023-03-07 15:30:24
*/
public class CompetitionMonitoringSqlProvider {
    /**

     */
    public String countByExample(CompetitionMonitoringExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("competition_monitoring");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**

     */
    public String insertSelective(CompetitionMonitoring row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("competition_monitoring");
        
        if (row.getBrand() != null) {
            sql.VALUES("brand", "#{brand,jdbcType=VARCHAR}");
        }
        
        if (row.getLazada() != null) {
            sql.VALUES("lazada", "#{lazada,jdbcType=VARCHAR}");
        }
        
        if (row.getShopee() != null) {
            sql.VALUES("shopee", "#{shopee,jdbcType=VARCHAR}");
        }
        
        if (row.getShopeeShopId() != null) {
            sql.VALUES("shopee_shop_id", "#{shopeeShopId,jdbcType=VARCHAR}");
        }
        
        if (row.getQoo10() != null) {
            sql.VALUES("qoo10", "#{qoo10,jdbcType=VARCHAR}");
        }
        
        if (row.getTmall() != null) {
            sql.VALUES("tmall", "#{tmall,jdbcType=VARCHAR}");
        }
        
        if (row.getJd() != null) {
            sql.VALUES("jd", "#{jd,jdbcType=VARCHAR}");
        }
        
        if (row.getLastModifyDateTime() != null) {
            sql.VALUES("gmt_modify", "#{lastModifyDateTime,jdbcType=TIMESTAMP}");
        }
        
        if (row.getCreateDateTime() != null) {
            sql.VALUES("gmt_create", "#{createDateTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**

     */
    public String selectByExample(CompetitionMonitoringExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("brand");
        sql.SELECT("lazada");
        sql.SELECT("shopee");
        sql.SELECT("shopee_shop_id");
        sql.SELECT("qoo10");
        sql.SELECT("tmall");
        sql.SELECT("jd");
        sql.SELECT("gmt_modify");
        sql.SELECT("gmt_create");
        sql.FROM("competition_monitoring");
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
        CompetitionMonitoring row = (CompetitionMonitoring) parameter.get("row");
        CompetitionMonitoringExample example = (CompetitionMonitoringExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("competition_monitoring");
        
        if (row.getId() != null) {
            sql.SET("id = #{row.id,jdbcType=INTEGER}");
        }
        
        if (row.getBrand() != null) {
            sql.SET("brand = #{row.brand,jdbcType=VARCHAR}");
        }
        
        if (row.getLazada() != null) {
            sql.SET("lazada = #{row.lazada,jdbcType=VARCHAR}");
        }
        
        if (row.getShopee() != null) {
            sql.SET("shopee = #{row.shopee,jdbcType=VARCHAR}");
        }
        
        if (row.getShopeeShopId() != null) {
            sql.SET("shopee_shop_id = #{row.shopeeShopId,jdbcType=VARCHAR}");
        }
        
        if (row.getQoo10() != null) {
            sql.SET("qoo10 = #{row.qoo10,jdbcType=VARCHAR}");
        }
        
        if (row.getTmall() != null) {
            sql.SET("tmall = #{row.tmall,jdbcType=VARCHAR}");
        }
        
        if (row.getJd() != null) {
            sql.SET("jd = #{row.jd,jdbcType=VARCHAR}");
        }
        
        if (row.getLastModifyDateTime() != null) {
            sql.SET("gmt_modify = #{row.lastModifyDateTime,jdbcType=TIMESTAMP}");
        }
        
        if (row.getCreateDateTime() != null) {
            sql.SET("gmt_create = #{row.createDateTime,jdbcType=TIMESTAMP}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**

     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("competition_monitoring");
        
        sql.SET("id = #{row.id,jdbcType=INTEGER}");
        sql.SET("brand = #{row.brand,jdbcType=VARCHAR}");
        sql.SET("lazada = #{row.lazada,jdbcType=VARCHAR}");
        sql.SET("shopee = #{row.shopee,jdbcType=VARCHAR}");
        sql.SET("shopee_shop_id = #{row.shopeeShopId,jdbcType=VARCHAR}");
        sql.SET("qoo10 = #{row.qoo10,jdbcType=VARCHAR}");
        sql.SET("tmall = #{row.tmall,jdbcType=VARCHAR}");
        sql.SET("jd = #{row.jd,jdbcType=VARCHAR}");
        sql.SET("gmt_modify = #{row.lastModifyDateTime,jdbcType=TIMESTAMP}");
        sql.SET("gmt_create = #{row.createDateTime,jdbcType=TIMESTAMP}");
        
        CompetitionMonitoringExample example = (CompetitionMonitoringExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**

     */
    public String updateByPrimaryKeySelective(CompetitionMonitoring row) {
        SQL sql = new SQL();
        sql.UPDATE("competition_monitoring");
        
        if (row.getBrand() != null) {
            sql.SET("brand = #{brand,jdbcType=VARCHAR}");
        }
        
        if (row.getLazada() != null) {
            sql.SET("lazada = #{lazada,jdbcType=VARCHAR}");
        }
        
        if (row.getShopee() != null) {
            sql.SET("shopee = #{shopee,jdbcType=VARCHAR}");
        }
        
        if (row.getShopeeShopId() != null) {
            sql.SET("shopee_shop_id = #{shopeeShopId,jdbcType=VARCHAR}");
        }
        
        if (row.getQoo10() != null) {
            sql.SET("qoo10 = #{qoo10,jdbcType=VARCHAR}");
        }
        
        if (row.getTmall() != null) {
            sql.SET("tmall = #{tmall,jdbcType=VARCHAR}");
        }
        
        if (row.getJd() != null) {
            sql.SET("jd = #{jd,jdbcType=VARCHAR}");
        }
        
        if (row.getLastModifyDateTime() != null) {
            sql.SET("gmt_modify = #{lastModifyDateTime,jdbcType=TIMESTAMP}");
        }
        
        if (row.getCreateDateTime() != null) {
            sql.SET("gmt_create = #{createDateTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    /**

     */
    protected void applyWhere(SQL sql, CompetitionMonitoringExample example, boolean includeExamplePhrase) {
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