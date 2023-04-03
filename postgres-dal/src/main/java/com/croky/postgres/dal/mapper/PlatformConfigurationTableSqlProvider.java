package com.croky.postgres.dal.mapper;

import com.croky.postgres.dal.model.PlatformConfigurationTable;
import com.croky.postgres.dal.model.PlatformConfigurationTableExample.Criteria;
import com.croky.postgres.dal.model.PlatformConfigurationTableExample.Criterion;
import com.croky.postgres.dal.model.PlatformConfigurationTableExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

/**
 * @author Croky.Zheng
 * @date 2022-12-07 16:26:41
*/
public class PlatformConfigurationTableSqlProvider {
    /**

     */
    public String countByExample(PlatformConfigurationTableExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("platform_configuration_table");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**

     */
    public String insertSelective(PlatformConfigurationTable row) {
        SQL sql = new SQL();
        sql.INSERT_INTO("platform_configuration_table");
        
        if (row.getActiveStatus() != null) {
            sql.VALUES("active_status", "#{activeStatus,jdbcType=VARCHAR}");
        }
        
        if (row.getShopCountry() != null) {
            sql.VALUES("shop_country", "#{shopCountry,jdbcType=VARCHAR}");
        }
        
        if (row.getCategory() != null) {
            sql.VALUES("category", "#{category,jdbcType=VARCHAR}");
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
        
        if (row.getLoginUrl() != null) {
            sql.VALUES("login_url", "#{loginUrl,jdbcType=VARCHAR}");
        }
        
        if (row.getUsername() != null) {
            sql.VALUES("username", "#{username,jdbcType=VARCHAR}");
        }
        
        if (row.getPassword() != null) {
            sql.VALUES("password", "#{password,jdbcType=VARCHAR}");
        }
        
        if (row.getBindedEmail() != null) {
            sql.VALUES("binded_email", "#{bindedEmail,jdbcType=VARCHAR}");
        }
        
        if (row.getBindedPhone() != null) {
            sql.VALUES("binded_phone", "#{bindedPhone,jdbcType=VARCHAR}");
        }
        
        if (row.getDataExtraction() != null) {
            sql.VALUES("data_extraction", "#{dataExtraction,jdbcType=VARCHAR}");
        }
        
        if (row.getPasswordFailed() != null) {
            sql.VALUES("password_failed", "#{passwordFailed,jdbcType=VARCHAR}");
        }
        
        if (row.getEmailFailed() != null) {
            sql.VALUES("email_failed", "#{emailFailed,jdbcType=VARCHAR}");
        }
        
        if (row.getPhoneFailed() != null) {
            sql.VALUES("phone_failed", "#{phoneFailed,jdbcType=VARCHAR}");
        }
        
        if (row.getTeamRegion() != null) {
            sql.VALUES("team_region", "#{teamRegion,jdbcType=VARCHAR}");
        }
        
        if (row.getTeamLeader() != null) {
            sql.VALUES("team_leader", "#{teamLeader,jdbcType=VARCHAR}");
        }
        
        if (row.getPic() != null) {
            sql.VALUES("pic", "#{pic,jdbcType=VARCHAR}");
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
    public String selectByExample(PlatformConfigurationTableExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("active_status");
        sql.SELECT("shop_country");
        sql.SELECT("category");
        sql.SELECT("brand");
        sql.SELECT("platform");
        sql.SELECT("store_name");
        sql.SELECT("store_id");
        sql.SELECT("login_url");
        sql.SELECT("username");
        sql.SELECT("password");
        sql.SELECT("binded_email");
        sql.SELECT("binded_phone");
        sql.SELECT("data_extraction");
        sql.SELECT("password_failed");
        sql.SELECT("email_failed");
        sql.SELECT("phone_failed");
        sql.SELECT("team_region");
        sql.SELECT("team_leader");
        sql.SELECT("pic");
        sql.SELECT("gmt_modify");
        sql.SELECT("gmt_create");
        sql.FROM("platform_configuration_table");
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
        PlatformConfigurationTable row = (PlatformConfigurationTable) parameter.get("row");
        PlatformConfigurationTableExample example = (PlatformConfigurationTableExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("platform_configuration_table");
        
        if (row.getId() != null) {
            sql.SET("id = #{row.id,jdbcType=INTEGER}");
        }
        
        if (row.getActiveStatus() != null) {
            sql.SET("active_status = #{row.activeStatus,jdbcType=VARCHAR}");
        }
        
        if (row.getShopCountry() != null) {
            sql.SET("shop_country = #{row.shopCountry,jdbcType=VARCHAR}");
        }
        
        if (row.getCategory() != null) {
            sql.SET("category = #{row.category,jdbcType=VARCHAR}");
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
        
        if (row.getLoginUrl() != null) {
            sql.SET("login_url = #{row.loginUrl,jdbcType=VARCHAR}");
        }
        
        if (row.getUsername() != null) {
            sql.SET("username = #{row.username,jdbcType=VARCHAR}");
        }
        
        if (row.getPassword() != null) {
            sql.SET("password = #{row.password,jdbcType=VARCHAR}");
        }
        
        if (row.getBindedEmail() != null) {
            sql.SET("binded_email = #{row.bindedEmail,jdbcType=VARCHAR}");
        }
        
        if (row.getBindedPhone() != null) {
            sql.SET("binded_phone = #{row.bindedPhone,jdbcType=VARCHAR}");
        }
        
        if (row.getDataExtraction() != null) {
            sql.SET("data_extraction = #{row.dataExtraction,jdbcType=VARCHAR}");
        }
        
        if (row.getPasswordFailed() != null) {
            sql.SET("password_failed = #{row.passwordFailed,jdbcType=VARCHAR}");
        }
        
        if (row.getEmailFailed() != null) {
            sql.SET("email_failed = #{row.emailFailed,jdbcType=VARCHAR}");
        }
        
        if (row.getPhoneFailed() != null) {
            sql.SET("phone_failed = #{row.phoneFailed,jdbcType=VARCHAR}");
        }
        
        if (row.getTeamRegion() != null) {
            sql.SET("team_region = #{row.teamRegion,jdbcType=VARCHAR}");
        }
        
        if (row.getTeamLeader() != null) {
            sql.SET("team_leader = #{row.teamLeader,jdbcType=VARCHAR}");
        }
        
        if (row.getPic() != null) {
            sql.SET("pic = #{row.pic,jdbcType=VARCHAR}");
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
        sql.UPDATE("platform_configuration_table");
        
        sql.SET("id = #{row.id,jdbcType=INTEGER}");
        sql.SET("active_status = #{row.activeStatus,jdbcType=VARCHAR}");
        sql.SET("shop_country = #{row.shopCountry,jdbcType=VARCHAR}");
        sql.SET("category = #{row.category,jdbcType=VARCHAR}");
        sql.SET("brand = #{row.brand,jdbcType=VARCHAR}");
        sql.SET("platform = #{row.platform,jdbcType=VARCHAR}");
        sql.SET("store_name = #{row.storeName,jdbcType=VARCHAR}");
        sql.SET("store_id = #{row.storeId,jdbcType=VARCHAR}");
        sql.SET("login_url = #{row.loginUrl,jdbcType=VARCHAR}");
        sql.SET("username = #{row.username,jdbcType=VARCHAR}");
        sql.SET("password = #{row.password,jdbcType=VARCHAR}");
        sql.SET("binded_email = #{row.bindedEmail,jdbcType=VARCHAR}");
        sql.SET("binded_phone = #{row.bindedPhone,jdbcType=VARCHAR}");
        sql.SET("data_extraction = #{row.dataExtraction,jdbcType=VARCHAR}");
        sql.SET("password_failed = #{row.passwordFailed,jdbcType=VARCHAR}");
        sql.SET("email_failed = #{row.emailFailed,jdbcType=VARCHAR}");
        sql.SET("phone_failed = #{row.phoneFailed,jdbcType=VARCHAR}");
        sql.SET("team_region = #{row.teamRegion,jdbcType=VARCHAR}");
        sql.SET("team_leader = #{row.teamLeader,jdbcType=VARCHAR}");
        sql.SET("pic = #{row.pic,jdbcType=VARCHAR}");
        sql.SET("gmt_modify = #{row.lastModifyDateTime,jdbcType=TIMESTAMP}");
        sql.SET("gmt_create = #{row.createDateTime,jdbcType=TIMESTAMP}");
        
        PlatformConfigurationTableExample example = (PlatformConfigurationTableExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**

     */
    public String updateByPrimaryKeySelective(PlatformConfigurationTable row) {
        SQL sql = new SQL();
        sql.UPDATE("platform_configuration_table");
        
        if (row.getActiveStatus() != null) {
            sql.SET("active_status = #{activeStatus,jdbcType=VARCHAR}");
        }
        
        if (row.getShopCountry() != null) {
            sql.SET("shop_country = #{shopCountry,jdbcType=VARCHAR}");
        }
        
        if (row.getCategory() != null) {
            sql.SET("category = #{category,jdbcType=VARCHAR}");
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
        
        if (row.getLoginUrl() != null) {
            sql.SET("login_url = #{loginUrl,jdbcType=VARCHAR}");
        }
        
        if (row.getUsername() != null) {
            sql.SET("username = #{username,jdbcType=VARCHAR}");
        }
        
        if (row.getPassword() != null) {
            sql.SET("password = #{password,jdbcType=VARCHAR}");
        }
        
        if (row.getBindedEmail() != null) {
            sql.SET("binded_email = #{bindedEmail,jdbcType=VARCHAR}");
        }
        
        if (row.getBindedPhone() != null) {
            sql.SET("binded_phone = #{bindedPhone,jdbcType=VARCHAR}");
        }
        
        if (row.getDataExtraction() != null) {
            sql.SET("data_extraction = #{dataExtraction,jdbcType=VARCHAR}");
        }
        
        if (row.getPasswordFailed() != null) {
            sql.SET("password_failed = #{passwordFailed,jdbcType=VARCHAR}");
        }
        
        if (row.getEmailFailed() != null) {
            sql.SET("email_failed = #{emailFailed,jdbcType=VARCHAR}");
        }
        
        if (row.getPhoneFailed() != null) {
            sql.SET("phone_failed = #{phoneFailed,jdbcType=VARCHAR}");
        }
        
        if (row.getTeamRegion() != null) {
            sql.SET("team_region = #{teamRegion,jdbcType=VARCHAR}");
        }
        
        if (row.getTeamLeader() != null) {
            sql.SET("team_leader = #{teamLeader,jdbcType=VARCHAR}");
        }
        
        if (row.getPic() != null) {
            sql.SET("pic = #{pic,jdbcType=VARCHAR}");
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
    protected void applyWhere(SQL sql, PlatformConfigurationTableExample example, boolean includeExamplePhrase) {
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