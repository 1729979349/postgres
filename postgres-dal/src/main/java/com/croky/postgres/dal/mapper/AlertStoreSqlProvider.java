package com.croky.postgres.dal.mapper;

import com.croky.postgres.dal.model.AlertStore;
import com.croky.postgres.dal.model.AlertStoreExample.Criteria;
import com.croky.postgres.dal.model.AlertStoreExample.Criterion;
import com.croky.postgres.dal.model.AlertStoreExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

/**
 * @author Croky.Zheng
 * @date 2023-03-06 17:19:16
*/
public class AlertStoreSqlProvider {
    /**

     */
    public String countByExample(AlertStoreExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("alert_store");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**

     */
    public String insertSelective(AlertStore row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("alert_store");
        
        if (row.getCountry() != null) {
            sql.VALUES("country", "#{country,jdbcType=VARCHAR}");
        }
        
        if (row.getBrand() != null) {
            sql.VALUES("brand", "#{brand,jdbcType=VARCHAR}");
        }
        
        if (row.getPlatform() != null) {
            sql.VALUES("platform", "#{platform,jdbcType=VARCHAR}");
        }
        
        if (row.getStoreName() != null) {
            sql.VALUES("store_name", "#{storeName,jdbcType=VARCHAR}");
        }
        
        if (row.getStoreId() != null) {
            sql.VALUES("store_id", "#{storeId,jdbcType=VARCHAR}");
        }
        
        if (row.getMktType() != null) {
            sql.VALUES("mkt_type", "#{mktType,jdbcType=VARCHAR}");
        }
        
        if (row.getTl() != null) {
            sql.VALUES("tl", "#{tl,jdbcType=VARCHAR}");
        }
        
        if (row.getTlMinDay() != null) {
            sql.VALUES("tl_min_day", "#{tlMinDay,jdbcType=SMALLINT}");
        }
        
        if (row.getPic() != null) {
            sql.VALUES("pic", "#{pic,jdbcType=VARCHAR}");
        }
        
        if (row.getPicMinDay() != null) {
            sql.VALUES("pic_min_day", "#{picMinDay,jdbcType=SMALLINT}");
        }
        
        if (row.getMktPic() != null) {
            sql.VALUES("mkt_pic", "#{mktPic,jdbcType=VARCHAR}");
        }
        
        if (row.getMktPicMinDay() != null) {
            sql.VALUES("mkt_pic_min_day", "#{mktPicMinDay,jdbcType=SMALLINT}");
        }
        
        if (row.getIsManual() != null) {
            sql.VALUES("is_manual", "#{isManual,jdbcType=VARCHAR}");
        }
        
        if (row.getRoiB() != null) {
            sql.VALUES("roi_b", "#{roiB,jdbcType=VARCHAR}");
        }
        
        if (row.getRemarks() != null) {
            sql.VALUES("remarks", "#{remarks,jdbcType=VARCHAR}");
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
    public String selectByExample(AlertStoreExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("country");
        sql.SELECT("brand");
        sql.SELECT("platform");
        sql.SELECT("store_name");
        sql.SELECT("store_id");
        sql.SELECT("mkt_type");
        sql.SELECT("tl");
        sql.SELECT("tl_min_day");
        sql.SELECT("pic");
        sql.SELECT("pic_min_day");
        sql.SELECT("mkt_pic");
        sql.SELECT("mkt_pic_min_day");
        sql.SELECT("is_manual");
        sql.SELECT("roi_b");
        sql.SELECT("remarks");
        sql.SELECT("gmt_modify");
        sql.SELECT("gmt_create");
        sql.FROM("alert_store");
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
        AlertStore row = (AlertStore) parameter.get("row");
        AlertStoreExample example = (AlertStoreExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("alert_store");
        
        if (row.getId() != null) {
            sql.SET("id = #{row.id,jdbcType=INTEGER}");
        }
        
        if (row.getCountry() != null) {
            sql.SET("country = #{row.country,jdbcType=VARCHAR}");
        }
        
        if (row.getBrand() != null) {
            sql.SET("brand = #{row.brand,jdbcType=VARCHAR}");
        }
        
        if (row.getPlatform() != null) {
            sql.SET("platform = #{row.platform,jdbcType=VARCHAR}");
        }
        
        if (row.getStoreName() != null) {
            sql.SET("store_name = #{row.storeName,jdbcType=VARCHAR}");
        }
        
        if (row.getStoreId() != null) {
            sql.SET("store_id = #{row.storeId,jdbcType=VARCHAR}");
        }
        
        if (row.getMktType() != null) {
            sql.SET("mkt_type = #{row.mktType,jdbcType=VARCHAR}");
        }
        
        if (row.getTl() != null) {
            sql.SET("tl = #{row.tl,jdbcType=VARCHAR}");
        }
        
        if (row.getTlMinDay() != null) {
            sql.SET("tl_min_day = #{row.tlMinDay,jdbcType=SMALLINT}");
        }
        
        if (row.getPic() != null) {
            sql.SET("pic = #{row.pic,jdbcType=VARCHAR}");
        }
        
        if (row.getPicMinDay() != null) {
            sql.SET("pic_min_day = #{row.picMinDay,jdbcType=SMALLINT}");
        }
        
        if (row.getMktPic() != null) {
            sql.SET("mkt_pic = #{row.mktPic,jdbcType=VARCHAR}");
        }
        
        if (row.getMktPicMinDay() != null) {
            sql.SET("mkt_pic_min_day = #{row.mktPicMinDay,jdbcType=SMALLINT}");
        }
        
        if (row.getIsManual() != null) {
            sql.SET("is_manual = #{row.isManual,jdbcType=VARCHAR}");
        }
        
        if (row.getRoiB() != null) {
            sql.SET("roi_b = #{row.roiB,jdbcType=VARCHAR}");
        }
        
        if (row.getRemarks() != null) {
            sql.SET("remarks = #{row.remarks,jdbcType=VARCHAR}");
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
        sql.UPDATE("alert_store");
        
        sql.SET("id = #{row.id,jdbcType=INTEGER}");
        sql.SET("country = #{row.country,jdbcType=VARCHAR}");
        sql.SET("brand = #{row.brand,jdbcType=VARCHAR}");
        sql.SET("platform = #{row.platform,jdbcType=VARCHAR}");
        sql.SET("store_name = #{row.storeName,jdbcType=VARCHAR}");
        sql.SET("store_id = #{row.storeId,jdbcType=VARCHAR}");
        sql.SET("mkt_type = #{row.mktType,jdbcType=VARCHAR}");
        sql.SET("tl = #{row.tl,jdbcType=VARCHAR}");
        sql.SET("tl_min_day = #{row.tlMinDay,jdbcType=SMALLINT}");
        sql.SET("pic = #{row.pic,jdbcType=VARCHAR}");
        sql.SET("pic_min_day = #{row.picMinDay,jdbcType=SMALLINT}");
        sql.SET("mkt_pic = #{row.mktPic,jdbcType=VARCHAR}");
        sql.SET("mkt_pic_min_day = #{row.mktPicMinDay,jdbcType=SMALLINT}");
        sql.SET("is_manual = #{row.isManual,jdbcType=VARCHAR}");
        sql.SET("roi_b = #{row.roiB,jdbcType=VARCHAR}");
        sql.SET("remarks = #{row.remarks,jdbcType=VARCHAR}");
        sql.SET("gmt_modify = #{row.lastModifyDateTime,jdbcType=TIMESTAMP}");
        sql.SET("gmt_create = #{row.createDateTime,jdbcType=TIMESTAMP}");
        
        AlertStoreExample example = (AlertStoreExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**

     */
    public String updateByPrimaryKeySelective(AlertStore row) {
        SQL sql = new SQL();
        sql.UPDATE("alert_store");
        
        if (row.getCountry() != null) {
            sql.SET("country = #{country,jdbcType=VARCHAR}");
        }
        
        if (row.getBrand() != null) {
            sql.SET("brand = #{brand,jdbcType=VARCHAR}");
        }
        
        if (row.getPlatform() != null) {
            sql.SET("platform = #{platform,jdbcType=VARCHAR}");
        }
        
        if (row.getStoreName() != null) {
            sql.SET("store_name = #{storeName,jdbcType=VARCHAR}");
        }
        
        if (row.getStoreId() != null) {
            sql.SET("store_id = #{storeId,jdbcType=VARCHAR}");
        }
        
        if (row.getMktType() != null) {
            sql.SET("mkt_type = #{mktType,jdbcType=VARCHAR}");
        }
        
        if (row.getTl() != null) {
            sql.SET("tl = #{tl,jdbcType=VARCHAR}");
        }
        
        if (row.getTlMinDay() != null) {
            sql.SET("tl_min_day = #{tlMinDay,jdbcType=SMALLINT}");
        }
        
        if (row.getPic() != null) {
            sql.SET("pic = #{pic,jdbcType=VARCHAR}");
        }
        
        if (row.getPicMinDay() != null) {
            sql.SET("pic_min_day = #{picMinDay,jdbcType=SMALLINT}");
        }
        
        if (row.getMktPic() != null) {
            sql.SET("mkt_pic = #{mktPic,jdbcType=VARCHAR}");
        }
        
        if (row.getMktPicMinDay() != null) {
            sql.SET("mkt_pic_min_day = #{mktPicMinDay,jdbcType=SMALLINT}");
        }
        
        if (row.getIsManual() != null) {
            sql.SET("is_manual = #{isManual,jdbcType=VARCHAR}");
        }
        
        if (row.getRoiB() != null) {
            sql.SET("roi_b = #{roiB,jdbcType=VARCHAR}");
        }
        
        if (row.getRemarks() != null) {
            sql.SET("remarks = #{remarks,jdbcType=VARCHAR}");
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
    protected void applyWhere(SQL sql, AlertStoreExample example, boolean includeExamplePhrase) {
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