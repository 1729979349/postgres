package com.croky.postgres.dal.mapper;

import com.croky.postgres.dal.model.PlatformDimensionReport;
import com.croky.postgres.dal.model.PlatformDimensionReportExample.Criteria;
import com.croky.postgres.dal.model.PlatformDimensionReportExample.Criterion;
import com.croky.postgres.dal.model.PlatformDimensionReportExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

/**
 * @author Croky.Zheng
 * @date 2023-03-06 17:48:11
*/
public class PlatformDimensionReportSqlProvider {
    /**

     */
    public String countByExample(PlatformDimensionReportExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("platform_dimension_report");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**

     */
    public String insertSelective(PlatformDimensionReport row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("platform_dimension_report");
        
        if (row.getChannel() != null) {
            sql.VALUES("channel", "#{channel,jdbcType=VARCHAR}");
        }
        
        if (row.getPlatformType() != null) {
            sql.VALUES("platform_type", "#{platformType,jdbcType=VARCHAR}");
        }
        
        if (row.getPlatform() != null) {
            sql.VALUES("platform", "#{platform,jdbcType=VARCHAR}");
        }
        
        if (row.getDataCategory() != null) {
            sql.VALUES("data_category", "#{dataCategory,jdbcType=VARCHAR}");
        }
        
        if (row.getSourceCategory() != null) {
            sql.VALUES("source_category", "#{sourceCategory,jdbcType=VARCHAR}");
        }
        
        if (row.getSource() != null) {
            sql.VALUES("source", "#{source,jdbcType=VARCHAR}");
        }
        
        if (row.getTableNameDwd() != null) {
            sql.VALUES("table_name_dwd", "#{tableNameDwd,jdbcType=VARCHAR}");
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
    public String selectByExample(PlatformDimensionReportExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("channel");
        sql.SELECT("platform_type");
        sql.SELECT("platform");
        sql.SELECT("data_category");
        sql.SELECT("source_category");
        sql.SELECT("source");
        sql.SELECT("table_name_dwd");
        sql.SELECT("gmt_modify");
        sql.SELECT("gmt_create");
        sql.FROM("platform_dimension_report");
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
        PlatformDimensionReport row = (PlatformDimensionReport) parameter.get("row");
        PlatformDimensionReportExample example = (PlatformDimensionReportExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("platform_dimension_report");
        
        if (row.getId() != null) {
            sql.SET("id = #{row.id,jdbcType=INTEGER}");
        }
        
        if (row.getChannel() != null) {
            sql.SET("channel = #{row.channel,jdbcType=VARCHAR}");
        }
        
        if (row.getPlatformType() != null) {
            sql.SET("platform_type = #{row.platformType,jdbcType=VARCHAR}");
        }
        
        if (row.getPlatform() != null) {
            sql.SET("platform = #{row.platform,jdbcType=VARCHAR}");
        }
        
        if (row.getDataCategory() != null) {
            sql.SET("data_category = #{row.dataCategory,jdbcType=VARCHAR}");
        }
        
        if (row.getSourceCategory() != null) {
            sql.SET("source_category = #{row.sourceCategory,jdbcType=VARCHAR}");
        }
        
        if (row.getSource() != null) {
            sql.SET("source = #{row.source,jdbcType=VARCHAR}");
        }
        
        if (row.getTableNameDwd() != null) {
            sql.SET("table_name_dwd = #{row.tableNameDwd,jdbcType=VARCHAR}");
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
        sql.UPDATE("platform_dimension_report");
        
        sql.SET("id = #{row.id,jdbcType=INTEGER}");
        sql.SET("channel = #{row.channel,jdbcType=VARCHAR}");
        sql.SET("platform_type = #{row.platformType,jdbcType=VARCHAR}");
        sql.SET("platform = #{row.platform,jdbcType=VARCHAR}");
        sql.SET("data_category = #{row.dataCategory,jdbcType=VARCHAR}");
        sql.SET("source_category = #{row.sourceCategory,jdbcType=VARCHAR}");
        sql.SET("source = #{row.source,jdbcType=VARCHAR}");
        sql.SET("table_name_dwd = #{row.tableNameDwd,jdbcType=VARCHAR}");
        sql.SET("gmt_modify = #{row.lastModifyDateTime,jdbcType=TIMESTAMP}");
        sql.SET("gmt_create = #{row.createDateTime,jdbcType=TIMESTAMP}");
        
        PlatformDimensionReportExample example = (PlatformDimensionReportExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**

     */
    public String updateByPrimaryKeySelective(PlatformDimensionReport row) {
        SQL sql = new SQL();
        sql.UPDATE("platform_dimension_report");
        
        if (row.getChannel() != null) {
            sql.SET("channel = #{channel,jdbcType=VARCHAR}");
        }
        
        if (row.getPlatformType() != null) {
            sql.SET("platform_type = #{platformType,jdbcType=VARCHAR}");
        }
        
        if (row.getPlatform() != null) {
            sql.SET("platform = #{platform,jdbcType=VARCHAR}");
        }
        
        if (row.getDataCategory() != null) {
            sql.SET("data_category = #{dataCategory,jdbcType=VARCHAR}");
        }
        
        if (row.getSourceCategory() != null) {
            sql.SET("source_category = #{sourceCategory,jdbcType=VARCHAR}");
        }
        
        if (row.getSource() != null) {
            sql.SET("source = #{source,jdbcType=VARCHAR}");
        }
        
        if (row.getTableNameDwd() != null) {
            sql.SET("table_name_dwd = #{tableNameDwd,jdbcType=VARCHAR}");
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
    protected void applyWhere(SQL sql, PlatformDimensionReportExample example, boolean includeExamplePhrase) {
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