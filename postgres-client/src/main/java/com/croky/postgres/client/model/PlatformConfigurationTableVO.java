package com.croky.postgres.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.NumberFormat;

/**
 * @author Croky.Zheng
 * @date 2022-12-07 16:26:41
*/
@Schema(title = "PlatformConfigurationTableVO-返回null")
public class PlatformConfigurationTableVO implements Serializable {
    @Schema(title = "null", name = "id", nullable = false, example = "nextval('platform_id_seq'::regclass)", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer id;

    @Schema(title = "null", name = "active_status", nullable = true, example = "NULL::character varying", maxLength = 16)
    private String activeStatus;

    @Schema(title = "null", name = "shop_country", nullable = true, example = "NULL::character varying", maxLength = 8)
    private String shopCountry;

    @Schema(title = "null", name = "category", nullable = true, example = "NULL::character varying", maxLength = 32)
    private String category;

    @Schema(title = "null", name = "brand", nullable = true, example = "NULL::character varying", maxLength = 32)
    private String brand;

    @Schema(title = "null", name = "platform", nullable = true, example = "NULL::character varying", maxLength = 16)
    private String platform;

    @Schema(title = "null", name = "store_name", nullable = true, example = "NULL::character varying", maxLength = 64)
    private String storeName;

    @Schema(title = "null", name = "store_id", nullable = true, example = "NULL::character varying", maxLength = 64)
    private String storeId;

    @Schema(title = "null", name = "login_url", nullable = true, example = "NULL::character varying", maxLength = 512)
    private String loginUrl;

    @Schema(title = "null", name = "username", nullable = true, example = "NULL::character varying", maxLength = 32)
    private String username;

    @Schema(title = "null", name = "password", nullable = true, example = "NULL::character varying", maxLength = 32)
    private String password;

    @Schema(title = "null", name = "binded_email", nullable = true, example = "NULL::character varying", maxLength = 32)
    private String bindedEmail;

    @Schema(title = "null", name = "binded_phone", nullable = true, example = "NULL::character varying", maxLength = 16)
    private String bindedPhone;

    @Schema(title = "null", name = "data_extraction", nullable = true, example = "null", maxLength = 8)
    private String dataExtraction;

    @Schema(title = "null", name = "password_failed", nullable = true, example = "NULL::character varying", maxLength = 256)
    private String passwordFailed;

    @Schema(title = "null", name = "email_failed", nullable = true, example = "NULL::character varying", maxLength = 256)
    private String emailFailed;

    @Schema(title = "null", name = "phone_failed", nullable = true, example = "NULL::character varying", maxLength = 256)
    private String phoneFailed;

    @Schema(title = "null", name = "team_region", nullable = true, example = "NULL::character varying", maxLength = 8)
    private String teamRegion;

    @Schema(title = "null", name = "team_leader", nullable = true, example = "NULL::character varying", maxLength = 64)
    private String teamLeader;

    @Schema(title = "null", name = "pic", nullable = true, example = "NULL::character varying", maxLength = 64)
    private String pic;

    @Schema(title = "null", name = "gmt_modify", nullable = true, example = "null", maxLength = 29)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastModifyDateTime;

    @Schema(title = "null", name = "gmt_create", nullable = true, example = "null", maxLength = 29)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDateTime;

    /**

     */
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus == null ? null : activeStatus.trim();
    }

    public String getShopCountry() {
        return shopCountry;
    }

    public void setShopCountry(String shopCountry) {
        this.shopCountry = shopCountry == null ? null : shopCountry.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId == null ? null : storeId.trim();
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl == null ? null : loginUrl.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getBindedEmail() {
        return bindedEmail;
    }

    public void setBindedEmail(String bindedEmail) {
        this.bindedEmail = bindedEmail == null ? null : bindedEmail.trim();
    }

    public String getBindedPhone() {
        return bindedPhone;
    }

    public void setBindedPhone(String bindedPhone) {
        this.bindedPhone = bindedPhone == null ? null : bindedPhone.trim();
    }

    public String getDataExtraction() {
        return dataExtraction;
    }

    public void setDataExtraction(String dataExtraction) {
        this.dataExtraction = dataExtraction == null ? null : dataExtraction.trim();
    }

    public String getPasswordFailed() {
        return passwordFailed;
    }

    public void setPasswordFailed(String passwordFailed) {
        this.passwordFailed = passwordFailed == null ? null : passwordFailed.trim();
    }

    public String getEmailFailed() {
        return emailFailed;
    }

    public void setEmailFailed(String emailFailed) {
        this.emailFailed = emailFailed == null ? null : emailFailed.trim();
    }

    public String getPhoneFailed() {
        return phoneFailed;
    }

    public void setPhoneFailed(String phoneFailed) {
        this.phoneFailed = phoneFailed == null ? null : phoneFailed.trim();
    }

    public String getTeamRegion() {
        return teamRegion;
    }

    public void setTeamRegion(String teamRegion) {
        this.teamRegion = teamRegion == null ? null : teamRegion.trim();
    }

    public String getTeamLeader() {
        return teamLeader;
    }

    public void setTeamLeader(String teamLeader) {
        this.teamLeader = teamLeader == null ? null : teamLeader.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Date getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    public void setLastModifyDateTime(Date lastModifyDateTime) {
        this.lastModifyDateTime = lastModifyDateTime;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

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
        PlatformConfigurationTableVO other = (PlatformConfigurationTableVO) that;
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