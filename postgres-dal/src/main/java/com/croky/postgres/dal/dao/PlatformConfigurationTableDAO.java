package com.croky.postgres.dal.dao;

import com.croky.common.lang.Pagination;
import com.croky.postgres.dal.mapper.PlatformConfigurationTableMapper;
import com.croky.postgres.dal.model.PlatformConfigurationTable;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;

/**
 * @author Croky.Zheng
 * @date 2022-12-07 16:26:41
*/
@Mapper
public interface PlatformConfigurationTableDAO extends PlatformConfigurationTableMapper {
    /**

     */
    @Select({
        "select",
        "id, active_status, shop_country, category, brand, platform, store_name, store_id, ",
        "login_url, username, password, binded_email, binded_phone, data_extraction, ",
        "password_failed, email_failed, phone_failed, team_region, team_leader, pic, ",
        "gmt_modify, gmt_create",
        "from platform_configuration_table",
        "where id = #{id,jdbcType=INTEGER}",
        "for update"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="active_status", property="activeStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="shop_country", property="shopCountry", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="brand", property="brand", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform", property="platform", jdbcType=JdbcType.VARCHAR),
        @Result(column="store_name", property="storeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_url", property="loginUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="binded_email", property="bindedEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="binded_phone", property="bindedPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="data_extraction", property="dataExtraction", jdbcType=JdbcType.VARCHAR),
        @Result(column="password_failed", property="passwordFailed", jdbcType=JdbcType.VARCHAR),
        @Result(column="email_failed", property="emailFailed", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone_failed", property="phoneFailed", jdbcType=JdbcType.VARCHAR),
        @Result(column="team_region", property="teamRegion", jdbcType=JdbcType.VARCHAR),
        @Result(column="team_leader", property="teamLeader", jdbcType=JdbcType.VARCHAR),
        @Result(column="pic", property="pic", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    PlatformConfigurationTable getAndLock(Integer id);

    /**

     */
    @Select({
        "select",
        "id, active_status, shop_country, category, brand, platform, store_name, store_id, ",
        "login_url, username, password, binded_email, binded_phone, data_extraction, ",
        "password_failed, email_failed, phone_failed, team_region, team_leader, pic, ",
        "gmt_modify, gmt_create",
        "from platform_configuration_table",
        "where id = #{id,jdbcType=INTEGER}",
        "lock in share mode"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="active_status", property="activeStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="shop_country", property="shopCountry", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="brand", property="brand", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform", property="platform", jdbcType=JdbcType.VARCHAR),
        @Result(column="store_name", property="storeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_url", property="loginUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="binded_email", property="bindedEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="binded_phone", property="bindedPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="data_extraction", property="dataExtraction", jdbcType=JdbcType.VARCHAR),
        @Result(column="password_failed", property="passwordFailed", jdbcType=JdbcType.VARCHAR),
        @Result(column="email_failed", property="emailFailed", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone_failed", property="phoneFailed", jdbcType=JdbcType.VARCHAR),
        @Result(column="team_region", property="teamRegion", jdbcType=JdbcType.VARCHAR),
        @Result(column="team_leader", property="teamLeader", jdbcType=JdbcType.VARCHAR),
        @Result(column="pic", property="pic", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    PlatformConfigurationTable getAndShareLock(Integer id);

    /**

     */
    @Update({
    "update platform_configuration_table ",
    "set status = -1",
    "where ",
    "id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**

     */
    @Select({"<script> ",
        "select",
        "id, active_status, shop_country, category, brand, platform, store_name, store_id, ",
        "login_url, username, password, binded_email, binded_phone, data_extraction, ",
        "password_failed, email_failed, phone_failed, team_region, team_leader, pic, ",
        "gmt_modify, gmt_create",
        "from platform_configuration_table",
    "<when test=\"where!=null and where!=''\">  where 1=1 and #{where,jdbcType=VARCHAR} </when>",
    "<when test=\"orderby!=null and orderby!=''\">  order by  #{orderby,jdbcType=VARCHAR}</when>",
    "<when test=\"pagination!=null\">  limit  #{pagination.offset,jdbcType=INTEGER},#{pagination.limit,jdbcType=INTEGER}</when>",
    "</script>"})
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="active_status", property="activeStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="shop_country", property="shopCountry", jdbcType=JdbcType.VARCHAR),
        @Result(column="category", property="category", jdbcType=JdbcType.VARCHAR),
        @Result(column="brand", property="brand", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform", property="platform", jdbcType=JdbcType.VARCHAR),
        @Result(column="store_name", property="storeName", jdbcType=JdbcType.VARCHAR),
        @Result(column="store_id", property="storeId", jdbcType=JdbcType.VARCHAR),
        @Result(column="login_url", property="loginUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="binded_email", property="bindedEmail", jdbcType=JdbcType.VARCHAR),
        @Result(column="binded_phone", property="bindedPhone", jdbcType=JdbcType.VARCHAR),
        @Result(column="data_extraction", property="dataExtraction", jdbcType=JdbcType.VARCHAR),
        @Result(column="password_failed", property="passwordFailed", jdbcType=JdbcType.VARCHAR),
        @Result(column="email_failed", property="emailFailed", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone_failed", property="phoneFailed", jdbcType=JdbcType.VARCHAR),
        @Result(column="team_region", property="teamRegion", jdbcType=JdbcType.VARCHAR),
        @Result(column="team_leader", property="teamLeader", jdbcType=JdbcType.VARCHAR),
        @Result(column="pic", property="pic", jdbcType=JdbcType.VARCHAR),
        @Result(column="gmt_modify", property="lastModifyDateTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="gmt_create", property="createDateTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<PlatformConfigurationTable> listByWhere(@Param("where") String where, @Param("orderby") String orderby, @Param("pagination") Pagination pagination);
}