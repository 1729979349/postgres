package com.croky.postgres.dal.mapper;

import com.croky.postgres.dal.model.PlatformConfigurationTable;
import com.croky.postgres.dal.model.PlatformConfigurationTableExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

/**
 * @author Croky.Zheng
 * @date 2022-12-07 16:26:41
 */
@Mapper
public interface PlatformConfigurationTableMapper {
    /**
     *
     */
    @SelectProvider(type = PlatformConfigurationTableSqlProvider.class, method = "countByExample")
    long countByExample(PlatformConfigurationTableExample example);

    /**
     *
     */
    @Insert({
            "insert into platform_configuration_table (active_status, shop_country, ",
            "category, brand, ",
            "platform, store_name, ",
            "store_id, login_url, ",
            "username, password, ",
            "binded_email, binded_phone, ",
            "data_extraction, password_failed, ",
            "email_failed, phone_failed, ",
            "team_region, team_leader, ",
            "pic, gmt_modify, ",
            "gmt_create)",
            "values (#{activeStatus,jdbcType=VARCHAR}, #{shopCountry,jdbcType=VARCHAR}, ",
            "#{category,jdbcType=VARCHAR}, #{brand,jdbcType=VARCHAR}, ",
            "#{platform,jdbcType=VARCHAR}, #{storeName,jdbcType=VARCHAR}, ",
            "#{storeId,jdbcType=VARCHAR}, #{loginUrl,jdbcType=VARCHAR}, ",
            "#{username,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, ",
            "#{bindedEmail,jdbcType=VARCHAR}, #{bindedPhone,jdbcType=VARCHAR}, ",
            "#{dataExtraction,jdbcType=VARCHAR}, #{passwordFailed,jdbcType=VARCHAR}, ",
            "#{emailFailed,jdbcType=VARCHAR}, #{phoneFailed,jdbcType=VARCHAR}, ",
            "#{teamRegion,jdbcType=VARCHAR}, #{teamLeader,jdbcType=VARCHAR}, ",
            "#{pic,jdbcType=VARCHAR}, #{lastModifyDateTime,jdbcType=TIMESTAMP}, ",
            "#{createDateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insert(PlatformConfigurationTable row);

    /**
     *
     */
    @InsertProvider(type = PlatformConfigurationTableSqlProvider.class, method = "insertSelective")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Integer.class)
    int insertSelective(PlatformConfigurationTable row);

    /**
     *
     */
    @SelectProvider(type = PlatformConfigurationTableSqlProvider.class, method = "selectByExample")
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "active_status", property = "activeStatus", jdbcType = JdbcType.VARCHAR),
            @Result(column = "shop_country", property = "shopCountry", jdbcType = JdbcType.VARCHAR),
            @Result(column = "category", property = "category", jdbcType = JdbcType.VARCHAR),
            @Result(column = "brand", property = "brand", jdbcType = JdbcType.VARCHAR),
            @Result(column = "platform", property = "platform", jdbcType = JdbcType.VARCHAR),
            @Result(column = "store_name", property = "storeName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "store_id", property = "storeId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "login_url", property = "loginUrl", jdbcType = JdbcType.VARCHAR),
            @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
            @Result(column = "binded_email", property = "bindedEmail", jdbcType = JdbcType.VARCHAR),
            @Result(column = "binded_phone", property = "bindedPhone", jdbcType = JdbcType.VARCHAR),
            @Result(column = "data_extraction", property = "dataExtraction", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password_failed", property = "passwordFailed", jdbcType = JdbcType.VARCHAR),
            @Result(column = "email_failed", property = "emailFailed", jdbcType = JdbcType.VARCHAR),
            @Result(column = "phone_failed", property = "phoneFailed", jdbcType = JdbcType.VARCHAR),
            @Result(column = "team_region", property = "teamRegion", jdbcType = JdbcType.VARCHAR),
            @Result(column = "team_leader", property = "teamLeader", jdbcType = JdbcType.VARCHAR),
            @Result(column = "pic", property = "pic", jdbcType = JdbcType.VARCHAR),
            @Result(column = "gmt_modify", property = "lastModifyDateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "gmt_create", property = "createDateTime", jdbcType = JdbcType.TIMESTAMP)
    })
    List<PlatformConfigurationTable> selectByExample(PlatformConfigurationTableExample example);

    /**
     *
     */
    @Select({
            "select",
            "id, active_status, shop_country, category, brand, platform, store_name, store_id, ",
            "login_url, username, password, binded_email, binded_phone, data_extraction, ",
            "password_failed, email_failed, phone_failed, team_region, team_leader, pic, ",
            "gmt_modify, gmt_create",
            "from platform_configuration_table",
            "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
            @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER, id = true),
            @Result(column = "active_status", property = "activeStatus", jdbcType = JdbcType.VARCHAR),
            @Result(column = "shop_country", property = "shopCountry", jdbcType = JdbcType.VARCHAR),
            @Result(column = "category", property = "category", jdbcType = JdbcType.VARCHAR),
            @Result(column = "brand", property = "brand", jdbcType = JdbcType.VARCHAR),
            @Result(column = "platform", property = "platform", jdbcType = JdbcType.VARCHAR),
            @Result(column = "store_name", property = "storeName", jdbcType = JdbcType.VARCHAR),
            @Result(column = "store_id", property = "storeId", jdbcType = JdbcType.VARCHAR),
            @Result(column = "login_url", property = "loginUrl", jdbcType = JdbcType.VARCHAR),
            @Result(column = "username", property = "username", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password", property = "password", jdbcType = JdbcType.VARCHAR),
            @Result(column = "binded_email", property = "bindedEmail", jdbcType = JdbcType.VARCHAR),
            @Result(column = "binded_phone", property = "bindedPhone", jdbcType = JdbcType.VARCHAR),
            @Result(column = "data_extraction", property = "dataExtraction", jdbcType = JdbcType.VARCHAR),
            @Result(column = "password_failed", property = "passwordFailed", jdbcType = JdbcType.VARCHAR),
            @Result(column = "email_failed", property = "emailFailed", jdbcType = JdbcType.VARCHAR),
            @Result(column = "phone_failed", property = "phoneFailed", jdbcType = JdbcType.VARCHAR),
            @Result(column = "team_region", property = "teamRegion", jdbcType = JdbcType.VARCHAR),
            @Result(column = "team_leader", property = "teamLeader", jdbcType = JdbcType.VARCHAR),
            @Result(column = "pic", property = "pic", jdbcType = JdbcType.VARCHAR),
            @Result(column = "gmt_modify", property = "lastModifyDateTime", jdbcType = JdbcType.TIMESTAMP),
            @Result(column = "gmt_create", property = "createDateTime", jdbcType = JdbcType.TIMESTAMP)
    })
    PlatformConfigurationTable selectByPrimaryKey(Integer id);

    /**
     *
     */
    @UpdateProvider(type = PlatformConfigurationTableSqlProvider.class, method = "updateByExampleSelective")
    int updateByExampleSelective(@Param("row") PlatformConfigurationTable row, @Param("example") PlatformConfigurationTableExample example);

    /**
     *
     */
    @UpdateProvider(type = PlatformConfigurationTableSqlProvider.class, method = "updateByExample")
    int updateByExample(@Param("row") PlatformConfigurationTable row, @Param("example") PlatformConfigurationTableExample example);

    /**
     *
     */
    @UpdateProvider(type = PlatformConfigurationTableSqlProvider.class, method = "updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(PlatformConfigurationTable row);

    /**
     *
     */
    @Update({
            "update platform_configuration_table",
            "set active_status = #{activeStatus,jdbcType=VARCHAR},",
            "shop_country = #{shopCountry,jdbcType=VARCHAR},",
            "category = #{category,jdbcType=VARCHAR},",
            "brand = #{brand,jdbcType=VARCHAR},",
            "platform = #{platform,jdbcType=VARCHAR},",
            "store_name = #{storeName,jdbcType=VARCHAR},",
            "store_id = #{storeId,jdbcType=VARCHAR},",
            "login_url = #{loginUrl,jdbcType=VARCHAR},",
            "username = #{username,jdbcType=VARCHAR},",
            "password = #{password,jdbcType=VARCHAR},",
            "binded_email = #{bindedEmail,jdbcType=VARCHAR},",
            "binded_phone = #{bindedPhone,jdbcType=VARCHAR},",
            "data_extraction = #{dataExtraction,jdbcType=VARCHAR},",
            "password_failed = #{passwordFailed,jdbcType=VARCHAR},",
            "email_failed = #{emailFailed,jdbcType=VARCHAR},",
            "phone_failed = #{phoneFailed,jdbcType=VARCHAR},",
            "team_region = #{teamRegion,jdbcType=VARCHAR},",
            "team_leader = #{teamLeader,jdbcType=VARCHAR},",
            "pic = #{pic,jdbcType=VARCHAR},",
            "gmt_modify = #{lastModifyDateTime,jdbcType=TIMESTAMP},",
            "gmt_create = #{createDateTime,jdbcType=TIMESTAMP}",
            "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PlatformConfigurationTable row);
}