package com.croky.postgres.dal.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Croky.Zheng
 * @date 2022-12-07 16:26:41
*/
public class PlatformConfigurationTable implements Serializable {
    /**
     *
     * The database column name:platform_configuration_table.id;length:10;type:INTEGER;default:"nextval('platform_id_seq'::regclass)";comment:"null"
     */
    private Integer id;

    /**
     *
     * The database column name:platform_configuration_table.active_status;length:16;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String activeStatus;

    /**
     *
     * The database column name:platform_configuration_table.shop_country;length:8;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String shopCountry;

    /**
     *
     * The database column name:platform_configuration_table.category;length:32;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String category;

    /**
     *
     * The database column name:platform_configuration_table.brand;length:32;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String brand;

    /**
     *
     * The database column name:platform_configuration_table.platform;length:16;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String platform;

    /**
     *
     * The database column name:platform_configuration_table.store_name;length:64;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String storeName;

    /**
     *
     * The database column name:platform_configuration_table.store_id;length:64;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String storeId;

    /**
     *
     * The database column name:platform_configuration_table.login_url;length:512;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String loginUrl;

    /**
     *
     * The database column name:platform_configuration_table.username;length:32;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String username;

    /**
     *
     * The database column name:platform_configuration_table.password;length:32;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String password;

    /**
     *
     * The database column name:platform_configuration_table.binded_email;length:32;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String bindedEmail;

    /**
     *
     * The database column name:platform_configuration_table.binded_phone;length:16;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String bindedPhone;

    /**
     *
     * The database column name:platform_configuration_table.data_extraction;length:8;type:VARCHAR;default:"null";comment:"null"
     */
    private String dataExtraction;

    /**
     *
     * The database column name:platform_configuration_table.password_failed;length:256;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String passwordFailed;

    /**
     *
     * The database column name:platform_configuration_table.email_failed;length:256;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String emailFailed;

    /**
     *
     * The database column name:platform_configuration_table.phone_failed;length:256;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String phoneFailed;

    /**
     *
     * The database column name:platform_configuration_table.team_region;length:8;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String teamRegion;

    /**
     *
     * The database column name:platform_configuration_table.team_leader;length:64;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String teamLeader;

    /**
     *
     * The database column name:platform_configuration_table.pic;length:64;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String pic;

    /**
     *
     * The database column name:platform_configuration_table.gmt_modify;length:29;type:TIMESTAMP;default:"null";comment:"null"
     */
    private Date lastModifyDateTime;

    /**
     *
     * The database column name:platform_configuration_table.gmt_create;length:29;type:TIMESTAMP;default:"null";comment:"null"
     */
    private Date createDateTime;

    /**

     */
    private static final long serialVersionUID = 1L;

    /**

     *
     * @return the value of platform_configuration_table.id
     */
    public Integer getId() {
        return id;
    }

    /**

     *
     * @param id the value for platform_configuration_table.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**

     *
     * @return the value of platform_configuration_table.active_status
     */
    public String getActiveStatus() {
        return activeStatus;
    }

    /**

     *
     * @param activeStatus the value for platform_configuration_table.active_status
     */
    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus == null ? null : activeStatus.trim();
    }

    /**

     *
     * @return the value of platform_configuration_table.shop_country
     */
    public String getShopCountry() {
        return shopCountry;
    }

    /**

     *
     * @param shopCountry the value for platform_configuration_table.shop_country
     */
    public void setShopCountry(String shopCountry) {
        this.shopCountry = shopCountry == null ? null : shopCountry.trim();
    }

    /**

     *
     * @return the value of platform_configuration_table.category
     */
    public String getCategory() {
        return category;
    }

    /**

     *
     * @param category the value for platform_configuration_table.category
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**

     *
     * @return the value of platform_configuration_table.brand
     */
    public String getBrand() {
        return brand;
    }

    /**

     *
     * @param brand the value for platform_configuration_table.brand
     */
    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    /**

     *
     * @return the value of platform_configuration_table.platform
     */
    public String getPlatform() {
        return platform;
    }

    /**

     *
     * @param platform the value for platform_configuration_table.platform
     */
    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    /**

     *
     * @return the value of platform_configuration_table.store_name
     */
    public String getStoreName() {
        return storeName;
    }

    /**

     *
     * @param storeName the value for platform_configuration_table.store_name
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /**

     *
     * @return the value of platform_configuration_table.store_id
     */
    public String getStoreId() {
        return storeId;
    }

    /**

     *
     * @param storeId the value for platform_configuration_table.store_id
     */
    public void setStoreId(String storeId) {
        this.storeId = storeId == null ? null : storeId.trim();
    }

    /**

     *
     * @return the value of platform_configuration_table.login_url
     */
    public String getLoginUrl() {
        return loginUrl;
    }

    /**

     *
     * @param loginUrl the value for platform_configuration_table.login_url
     */
    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl == null ? null : loginUrl.trim();
    }

    /**

     *
     * @return the value of platform_configuration_table.username
     */
    public String getUsername() {
        return username;
    }

    /**

     *
     * @param username the value for platform_configuration_table.username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**

     *
     * @return the value of platform_configuration_table.password
     */
    public String getPassword() {
        return password;
    }

    /**

     *
     * @param password the value for platform_configuration_table.password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**

     *
     * @return the value of platform_configuration_table.binded_email
     */
    public String getBindedEmail() {
        return bindedEmail;
    }

    /**

     *
     * @param bindedEmail the value for platform_configuration_table.binded_email
     */
    public void setBindedEmail(String bindedEmail) {
        this.bindedEmail = bindedEmail == null ? null : bindedEmail.trim();
    }

    /**

     *
     * @return the value of platform_configuration_table.binded_phone
     */
    public String getBindedPhone() {
        return bindedPhone;
    }

    /**

     *
     * @param bindedPhone the value for platform_configuration_table.binded_phone
     */
    public void setBindedPhone(String bindedPhone) {
        this.bindedPhone = bindedPhone == null ? null : bindedPhone.trim();
    }

    /**

     *
     * @return the value of platform_configuration_table.data_extraction
     */
    public String getDataExtraction() {
        return dataExtraction;
    }

    /**

     *
     * @param dataExtraction the value for platform_configuration_table.data_extraction
     */
    public void setDataExtraction(String dataExtraction) {
        this.dataExtraction = dataExtraction == null ? null : dataExtraction.trim();
    }

    /**

     *
     * @return the value of platform_configuration_table.password_failed
     */
    public String getPasswordFailed() {
        return passwordFailed;
    }

    /**

     *
     * @param passwordFailed the value for platform_configuration_table.password_failed
     */
    public void setPasswordFailed(String passwordFailed) {
        this.passwordFailed = passwordFailed == null ? null : passwordFailed.trim();
    }

    /**

     *
     * @return the value of platform_configuration_table.email_failed
     */
    public String getEmailFailed() {
        return emailFailed;
    }

    /**

     *
     * @param emailFailed the value for platform_configuration_table.email_failed
     */
    public void setEmailFailed(String emailFailed) {
        this.emailFailed = emailFailed == null ? null : emailFailed.trim();
    }

    /**

     *
     * @return the value of platform_configuration_table.phone_failed
     */
    public String getPhoneFailed() {
        return phoneFailed;
    }

    /**

     *
     * @param phoneFailed the value for platform_configuration_table.phone_failed
     */
    public void setPhoneFailed(String phoneFailed) {
        this.phoneFailed = phoneFailed == null ? null : phoneFailed.trim();
    }

    /**

     *
     * @return the value of platform_configuration_table.team_region
     */
    public String getTeamRegion() {
        return teamRegion;
    }

    /**

     *
     * @param teamRegion the value for platform_configuration_table.team_region
     */
    public void setTeamRegion(String teamRegion) {
        this.teamRegion = teamRegion == null ? null : teamRegion.trim();
    }

    /**

     *
     * @return the value of platform_configuration_table.team_leader
     */
    public String getTeamLeader() {
        return teamLeader;
    }

    /**

     *
     * @param teamLeader the value for platform_configuration_table.team_leader
     */
    public void setTeamLeader(String teamLeader) {
        this.teamLeader = teamLeader == null ? null : teamLeader.trim();
    }

    /**

     *
     * @return the value of platform_configuration_table.pic
     */
    public String getPic() {
        return pic;
    }

    /**

     *
     * @param pic the value for platform_configuration_table.pic
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**

     *
     * @return the value of platform_configuration_table.gmt_modify
     */
    public Date getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**

     *
     * @param lastModifyDateTime the value for platform_configuration_table.gmt_modify
     */
    public void setLastModifyDateTime(Date lastModifyDateTime) {
        this.lastModifyDateTime = lastModifyDateTime;
    }

    /**

     *
     * @return the value of platform_configuration_table.gmt_create
     */
    public Date getCreateDateTime() {
        return createDateTime;
    }

    /**

     *
     * @param createDateTime the value for platform_configuration_table.gmt_create
     */
    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    /**

     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PlatformConfigurationTable other = (PlatformConfigurationTable) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getActiveStatus() == null ? other.getActiveStatus() == null : this.getActiveStatus().equals(other.getActiveStatus()))
            && (this.getShopCountry() == null ? other.getShopCountry() == null : this.getShopCountry().equals(other.getShopCountry()))
            && (this.getCategory() == null ? other.getCategory() == null : this.getCategory().equals(other.getCategory()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getStoreName() == null ? other.getStoreName() == null : this.getStoreName().equals(other.getStoreName()))
            && (this.getStoreId() == null ? other.getStoreId() == null : this.getStoreId().equals(other.getStoreId()))
            && (this.getLoginUrl() == null ? other.getLoginUrl() == null : this.getLoginUrl().equals(other.getLoginUrl()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getBindedEmail() == null ? other.getBindedEmail() == null : this.getBindedEmail().equals(other.getBindedEmail()))
            && (this.getBindedPhone() == null ? other.getBindedPhone() == null : this.getBindedPhone().equals(other.getBindedPhone()))
            && (this.getDataExtraction() == null ? other.getDataExtraction() == null : this.getDataExtraction().equals(other.getDataExtraction()))
            && (this.getPasswordFailed() == null ? other.getPasswordFailed() == null : this.getPasswordFailed().equals(other.getPasswordFailed()))
            && (this.getEmailFailed() == null ? other.getEmailFailed() == null : this.getEmailFailed().equals(other.getEmailFailed()))
            && (this.getPhoneFailed() == null ? other.getPhoneFailed() == null : this.getPhoneFailed().equals(other.getPhoneFailed()))
            && (this.getTeamRegion() == null ? other.getTeamRegion() == null : this.getTeamRegion().equals(other.getTeamRegion()))
            && (this.getTeamLeader() == null ? other.getTeamLeader() == null : this.getTeamLeader().equals(other.getTeamLeader()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()))
            && (this.getLastModifyDateTime() == null ? other.getLastModifyDateTime() == null : this.getLastModifyDateTime().equals(other.getLastModifyDateTime()))
            && (this.getCreateDateTime() == null ? other.getCreateDateTime() == null : this.getCreateDateTime().equals(other.getCreateDateTime()));
    }

    /**

     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getActiveStatus() == null) ? 0 : getActiveStatus().hashCode());
        result = prime * result + ((getShopCountry() == null) ? 0 : getShopCountry().hashCode());
        result = prime * result + ((getCategory() == null) ? 0 : getCategory().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getStoreName() == null) ? 0 : getStoreName().hashCode());
        result = prime * result + ((getStoreId() == null) ? 0 : getStoreId().hashCode());
        result = prime * result + ((getLoginUrl() == null) ? 0 : getLoginUrl().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getBindedEmail() == null) ? 0 : getBindedEmail().hashCode());
        result = prime * result + ((getBindedPhone() == null) ? 0 : getBindedPhone().hashCode());
        result = prime * result + ((getDataExtraction() == null) ? 0 : getDataExtraction().hashCode());
        result = prime * result + ((getPasswordFailed() == null) ? 0 : getPasswordFailed().hashCode());
        result = prime * result + ((getEmailFailed() == null) ? 0 : getEmailFailed().hashCode());
        result = prime * result + ((getPhoneFailed() == null) ? 0 : getPhoneFailed().hashCode());
        result = prime * result + ((getTeamRegion() == null) ? 0 : getTeamRegion().hashCode());
        result = prime * result + ((getTeamLeader() == null) ? 0 : getTeamLeader().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
        result = prime * result + ((getLastModifyDateTime() == null) ? 0 : getLastModifyDateTime().hashCode());
        result = prime * result + ((getCreateDateTime() == null) ? 0 : getCreateDateTime().hashCode());
        return result;
    }

    /**

     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", activeStatus=").append(activeStatus);
        sb.append(", shopCountry=").append(shopCountry);
        sb.append(", category=").append(category);
        sb.append(", brand=").append(brand);
        sb.append(", platform=").append(platform);
        sb.append(", storeName=").append(storeName);
        sb.append(", storeId=").append(storeId);
        sb.append(", loginUrl=").append(loginUrl);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", bindedEmail=").append(bindedEmail);
        sb.append(", bindedPhone=").append(bindedPhone);
        sb.append(", dataExtraction=").append(dataExtraction);
        sb.append(", passwordFailed=").append(passwordFailed);
        sb.append(", emailFailed=").append(emailFailed);
        sb.append(", phoneFailed=").append(phoneFailed);
        sb.append(", teamRegion=").append(teamRegion);
        sb.append(", teamLeader=").append(teamLeader);
        sb.append(", pic=").append(pic);
        sb.append(", lastModifyDateTime=").append(lastModifyDateTime);
        sb.append(", createDateTime=").append(createDateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}