package com.croky.postgres.dal.mapper;

import com.croky.postgres.dal.model.Item;
import com.croky.postgres.dal.model.ItemExample.Criteria;
import com.croky.postgres.dal.model.ItemExample.Criterion;
import com.croky.postgres.dal.model.ItemExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

/**
 * @author Croky.Zheng
 * @date 2022-04-29 03:04:29
*/
public class ItemSqlProvider {
    /**

     */
    public String countByExample(ItemExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("item");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**

     */
    public String insertSelective(Item row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("item");
        
        if (row.getShopId() != null) {
            sql.VALUES("shop_id", "#{shopId,jdbcType=INTEGER}");
        }
        
        if (row.getBarcode() != null) {
            sql.VALUES("barcode", "#{barcode,jdbcType=VARCHAR}");
        }
        
        if (row.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (row.getPinyin() != null) {
            sql.VALUES("pinyin", "#{pinyin,jdbcType=VARCHAR}");
        }
        
        if (row.getSpec() != null) {
            sql.VALUES("spec", "#{spec,jdbcType=VARCHAR}");
        }
        
        if (row.getUnit() != null) {
            sql.VALUES("unit", "#{unit,jdbcType=VARCHAR}");
        }
        
        if (row.getLocation() != null) {
            sql.VALUES("location", "#{location,jdbcType=VARCHAR}");
        }
        
        if (row.getPrice() != null) {
            sql.VALUES("price", "#{price,jdbcType=INTEGER}");
        }
        
        if (row.getSecrStock() != null) {
            sql.VALUES("secr_stock", "#{secrStock,jdbcType=DOUBLE}");
        }
        
        if (row.getStock() != null) {
            sql.VALUES("stock", "#{stock,jdbcType=DOUBLE}");
        }
        
        if (row.getVipPrice() != null) {
            sql.VALUES("vip_price", "#{vipPrice,jdbcType=INTEGER}");
        }
        
        if (row.getCostPrice() != null) {
            sql.VALUES("cost_price", "#{costPrice,jdbcType=INTEGER}");
        }
        
        if (row.getKeyword() != null) {
            sql.VALUES("keyword", "#{keyword,jdbcType=VARCHAR}");
        }
        
        if (row.getCreateDateTime() != null) {
            sql.VALUES("gmt_create", "#{createDateTime,jdbcType=TIMESTAMP}");
        }
        
        if (row.getLastModifyDateTime() != null) {
            sql.VALUES("gmt_modify", "#{lastModifyDateTime,jdbcType=TIMESTAMP}");
        }
        
        if (row.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=TINYINT}");
        }
        
        return sql.toString();
    }

    /**

     */
    public String selectByExample(ItemExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("shop_id");
        sql.SELECT("barcode");
        sql.SELECT("name");
        sql.SELECT("pinyin");
        sql.SELECT("spec");
        sql.SELECT("unit");
        sql.SELECT("location");
        sql.SELECT("price");
        sql.SELECT("secr_stock");
        sql.SELECT("stock");
        sql.SELECT("vip_price");
        sql.SELECT("cost_price");
        sql.SELECT("keyword");
        sql.SELECT("gmt_create");
        sql.SELECT("gmt_modify");
        sql.SELECT("status");
        sql.FROM("item");
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
        Item row = (Item) parameter.get("row");
        ItemExample example = (ItemExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("item");
        
        if (row.getId() != null) {
            sql.SET("id = #{row.id,jdbcType=BIGINT}");
        }
        
        if (row.getShopId() != null) {
            sql.SET("shop_id = #{row.shopId,jdbcType=INTEGER}");
        }
        
        if (row.getBarcode() != null) {
            sql.SET("barcode = #{row.barcode,jdbcType=VARCHAR}");
        }
        
        if (row.getName() != null) {
            sql.SET("name = #{row.name,jdbcType=VARCHAR}");
        }
        
        if (row.getPinyin() != null) {
            sql.SET("pinyin = #{row.pinyin,jdbcType=VARCHAR}");
        }
        
        if (row.getSpec() != null) {
            sql.SET("spec = #{row.spec,jdbcType=VARCHAR}");
        }
        
        if (row.getUnit() != null) {
            sql.SET("unit = #{row.unit,jdbcType=VARCHAR}");
        }
        
        if (row.getLocation() != null) {
            sql.SET("location = #{row.location,jdbcType=VARCHAR}");
        }
        
        if (row.getPrice() != null) {
            sql.SET("price = #{row.price,jdbcType=INTEGER}");
        }
        
        if (row.getSecrStock() != null) {
            sql.SET("secr_stock = #{row.secrStock,jdbcType=DOUBLE}");
        }
        
        if (row.getStock() != null) {
            sql.SET("stock = #{row.stock,jdbcType=DOUBLE}");
        }
        
        if (row.getVipPrice() != null) {
            sql.SET("vip_price = #{row.vipPrice,jdbcType=INTEGER}");
        }
        
        if (row.getCostPrice() != null) {
            sql.SET("cost_price = #{row.costPrice,jdbcType=INTEGER}");
        }
        
        if (row.getKeyword() != null) {
            sql.SET("keyword = #{row.keyword,jdbcType=VARCHAR}");
        }
        
        if (row.getCreateDateTime() != null) {
            sql.SET("gmt_create = #{row.createDateTime,jdbcType=TIMESTAMP}");
        }
        
        if (row.getLastModifyDateTime() != null) {
            sql.SET("gmt_modify = #{row.lastModifyDateTime,jdbcType=TIMESTAMP}");
        }
        
        if (row.getStatus() != null) {
            sql.SET("status = #{row.status,jdbcType=TINYINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**

     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("item");
        
        sql.SET("id = #{row.id,jdbcType=BIGINT}");
        sql.SET("shop_id = #{row.shopId,jdbcType=INTEGER}");
        sql.SET("barcode = #{row.barcode,jdbcType=VARCHAR}");
        sql.SET("name = #{row.name,jdbcType=VARCHAR}");
        sql.SET("pinyin = #{row.pinyin,jdbcType=VARCHAR}");
        sql.SET("spec = #{row.spec,jdbcType=VARCHAR}");
        sql.SET("unit = #{row.unit,jdbcType=VARCHAR}");
        sql.SET("location = #{row.location,jdbcType=VARCHAR}");
        sql.SET("price = #{row.price,jdbcType=INTEGER}");
        sql.SET("secr_stock = #{row.secrStock,jdbcType=DOUBLE}");
        sql.SET("stock = #{row.stock,jdbcType=DOUBLE}");
        sql.SET("vip_price = #{row.vipPrice,jdbcType=INTEGER}");
        sql.SET("cost_price = #{row.costPrice,jdbcType=INTEGER}");
        sql.SET("keyword = #{row.keyword,jdbcType=VARCHAR}");
        sql.SET("gmt_create = #{row.createDateTime,jdbcType=TIMESTAMP}");
        sql.SET("gmt_modify = #{row.lastModifyDateTime,jdbcType=TIMESTAMP}");
        sql.SET("status = #{row.status,jdbcType=TINYINT}");
        
        ItemExample example = (ItemExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**

     */
    public String updateByPrimaryKeySelective(Item row) {
        SQL sql = new SQL();
        sql.UPDATE("item");
        
        if (row.getShopId() != null) {
            sql.SET("shop_id = #{shopId,jdbcType=INTEGER}");
        }
        
        if (row.getBarcode() != null) {
            sql.SET("barcode = #{barcode,jdbcType=VARCHAR}");
        }
        
        if (row.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (row.getPinyin() != null) {
            sql.SET("pinyin = #{pinyin,jdbcType=VARCHAR}");
        }
        
        if (row.getSpec() != null) {
            sql.SET("spec = #{spec,jdbcType=VARCHAR}");
        }
        
        if (row.getUnit() != null) {
            sql.SET("unit = #{unit,jdbcType=VARCHAR}");
        }
        
        if (row.getLocation() != null) {
            sql.SET("location = #{location,jdbcType=VARCHAR}");
        }
        
        if (row.getPrice() != null) {
            sql.SET("price = #{price,jdbcType=INTEGER}");
        }
        
        if (row.getSecrStock() != null) {
            sql.SET("secr_stock = #{secrStock,jdbcType=DOUBLE}");
        }
        
        if (row.getStock() != null) {
            sql.SET("stock = #{stock,jdbcType=DOUBLE}");
        }
        
        if (row.getVipPrice() != null) {
            sql.SET("vip_price = #{vipPrice,jdbcType=INTEGER}");
        }
        
        if (row.getCostPrice() != null) {
            sql.SET("cost_price = #{costPrice,jdbcType=INTEGER}");
        }
        
        if (row.getKeyword() != null) {
            sql.SET("keyword = #{keyword,jdbcType=VARCHAR}");
        }
        
        if (row.getCreateDateTime() != null) {
            sql.SET("gmt_create = #{createDateTime,jdbcType=TIMESTAMP}");
        }
        
        if (row.getLastModifyDateTime() != null) {
            sql.SET("gmt_modify = #{lastModifyDateTime,jdbcType=TIMESTAMP}");
        }
        
        if (row.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=TINYINT}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }

    /**

     */
    protected void applyWhere(SQL sql, ItemExample example, boolean includeExamplePhrase) {
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