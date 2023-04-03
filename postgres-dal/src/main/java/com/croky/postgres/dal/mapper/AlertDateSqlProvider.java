package com.croky.postgres.dal.mapper;

import com.croky.postgres.dal.model.AlertDate;
import com.croky.postgres.dal.model.AlertDateExample.Criteria;
import com.croky.postgres.dal.model.AlertDateExample.Criterion;
import com.croky.postgres.dal.model.AlertDateExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

/**
 * @author Croky.Zheng
 * @date 2023-02-28 11:16:30
*/
public class AlertDateSqlProvider {
    /**

     */
    public String countByExample(AlertDateExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("alert_date");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**

     */
    public String insertSelective(AlertDate row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("alert_date");
        
        if (row.getCountry() != null) {
            sql.VALUES("country", "#{country,jdbcType=VARCHAR}");
        }
        
        if (row.getTier() != null) {
            sql.VALUES("tier", "#{tier,jdbcType=VARCHAR}");
        }
        
        if (row.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (row.getStartDate() != null) {
            sql.VALUES("start_date", "#{startDate,jdbcType=VARCHAR}");
        }
        
        if (row.getEndDate() != null) {
            sql.VALUES("end_date", "#{endDate,jdbcType=VARCHAR}");
        }
        
        if (row.getDateOfData() != null) {
            sql.VALUES("date_of_data", "#{dateOfData,jdbcType=DATE}");
        }
        
        if (row.getPlatform() != null) {
            sql.VALUES("platform", "#{platform,jdbcType=VARCHAR}");
        }
        
        if (row.getYear() != null) {
            sql.VALUES("year", "#{year,jdbcType=VARCHAR}");
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
    public String selectByExample(AlertDateExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("country");
        sql.SELECT("tier");
        sql.SELECT("name");
        sql.SELECT("start_date");
        sql.SELECT("end_date");
        sql.SELECT("date_of_data");
        sql.SELECT("platform");
        sql.SELECT("year");
        sql.SELECT("gmt_modify");
        sql.SELECT("gmt_create");
        sql.FROM("alert_date");
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
        AlertDate row = (AlertDate) parameter.get("row");
        AlertDateExample example = (AlertDateExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("alert_date");
        
        if (row.getId() != null) {
            sql.SET("id = #{row.id,jdbcType=INTEGER}");
        }
        
        if (row.getCountry() != null) {
            sql.SET("country = #{row.country,jdbcType=VARCHAR}");
        }
        
        if (row.getTier() != null) {
            sql.SET("tier = #{row.tier,jdbcType=VARCHAR}");
        }
        
        if (row.getName() != null) {
            sql.SET("name = #{row.name,jdbcType=VARCHAR}");
        }
        
        if (row.getStartDate() != null) {
            sql.SET("start_date = #{row.startDate,jdbcType=VARCHAR}");
        }
        
        if (row.getEndDate() != null) {
            sql.SET("end_date = #{row.endDate,jdbcType=VARCHAR}");
        }
        
        if (row.getDateOfData() != null) {
            sql.SET("date_of_data = #{row.dateOfData,jdbcType=DATE}");
        }
        
        if (row.getPlatform() != null) {
            sql.SET("platform = #{row.platform,jdbcType=VARCHAR}");
        }
        
        if (row.getYear() != null) {
            sql.SET("year = #{row.year,jdbcType=VARCHAR}");
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
        sql.UPDATE("alert_date");
        
        sql.SET("id = #{row.id,jdbcType=INTEGER}");
        sql.SET("country = #{row.country,jdbcType=VARCHAR}");
        sql.SET("tier = #{row.tier,jdbcType=VARCHAR}");
        sql.SET("name = #{row.name,jdbcType=VARCHAR}");
        sql.SET("start_date = #{row.startDate,jdbcType=VARCHAR}");
        sql.SET("end_date = #{row.endDate,jdbcType=VARCHAR}");
        sql.SET("date_of_data = #{row.dateOfData,jdbcType=DATE}");
        sql.SET("platform = #{row.platform,jdbcType=VARCHAR}");
        sql.SET("year = #{row.year,jdbcType=VARCHAR}");
        sql.SET("gmt_modify = #{row.lastModifyDateTime,jdbcType=TIMESTAMP}");
        sql.SET("gmt_create = #{row.createDateTime,jdbcType=TIMESTAMP}");
        
        AlertDateExample example = (AlertDateExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**

     */
    public String updateByPrimaryKeySelective(AlertDate row) {
        SQL sql = new SQL();
        sql.UPDATE("alert_date");
        
        if (row.getCountry() != null) {
            sql.SET("country = #{country,jdbcType=VARCHAR}");
        }
        
        if (row.getTier() != null) {
            sql.SET("tier = #{tier,jdbcType=VARCHAR}");
        }
        
        if (row.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (row.getStartDate() != null) {
            sql.SET("start_date = #{startDate,jdbcType=VARCHAR}");
        }
        
        if (row.getEndDate() != null) {
            sql.SET("end_date = #{endDate,jdbcType=VARCHAR}");
        }
        
        if (row.getDateOfData() != null) {
            sql.SET("date_of_data = #{dateOfData,jdbcType=DATE}");
        }
        
        if (row.getPlatform() != null) {
            sql.SET("platform = #{platform,jdbcType=VARCHAR}");
        }
        
        if (row.getYear() != null) {
            sql.SET("year = #{year,jdbcType=VARCHAR}");
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
    protected void applyWhere(SQL sql, AlertDateExample example, boolean includeExamplePhrase) {
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