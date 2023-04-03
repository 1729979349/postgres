package com.croky.postgres.client.model;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.NumberFormat;

@Schema(title = "PlatformConfigurationTableForm-提交null")
public class PlatformConfigurationTableForm {
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
}