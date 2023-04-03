package com.croky.postgres.client.model;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.NumberFormat;

@Schema(title = "AlertStoreForm-提交null")
public class AlertStoreForm {
    @Schema(title = "null", name = "id", nullable = false, example = "nextval('alert_store_id_seq'::regclass)", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer id;

    @Schema(title = "null", name = "country", nullable = true, example = "NULL::character varying", maxLength = 16)
    private String country;

    @Schema(title = "null", name = "brand", nullable = true, example = "NULL::character varying", maxLength = 16)
    private String brand;

    @Schema(title = "null", name = "platform", nullable = true, example = "NULL::character varying", maxLength = 64)
    private String platform;

    @Schema(title = "null", name = "store_name", nullable = true, example = "NULL::character varying", maxLength = 64)
    private String storeName;

    @Schema(title = "null", name = "store_id", nullable = true, example = "NULL::character varying", maxLength = 32)
    private String storeId;

    @Schema(title = "null", name = "mkt_type", nullable = true, example = "NULL::character varying", maxLength = 128)
    private String mktType;

    @Schema(title = "null", name = "tl", nullable = true, example = "NULL::character varying", maxLength = 128)
    private String tl;

    @Schema(title = "null", name = "tl_min_day", nullable = true, example = "null", maxLength = 5)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short tlMinDay;

    @Schema(title = "null", name = "pic", nullable = true, example = "NULL::character varying", maxLength = 128)
    private String pic;

    @Schema(title = "null", name = "pic_min_day", nullable = true, example = "null", maxLength = 5)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short picMinDay;

    @Schema(title = "null", name = "mkt_pic", nullable = true, example = "NULL::character varying", maxLength = 128)
    private String mktPic;

    @Schema(title = "null", name = "mkt_pic_min_day", nullable = true, example = "null", maxLength = 5)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short mktPicMinDay;

    @Schema(title = "null", name = "is_manual", nullable = true, example = "NULL::character varying", maxLength = 10)
    private String isManual;

    @Schema(title = "null", name = "roi_b", nullable = true, example = "NULL::character varying", maxLength = 8)
    private String roiB;

    @Schema(title = "null", name = "remarks", nullable = true, example = "NULL::character varying", maxLength = 256)
    private String remarks;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
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

    public String getMktType() {
        return mktType;
    }

    public void setMktType(String mktType) {
        this.mktType = mktType == null ? null : mktType.trim();
    }

    public String getTl() {
        return tl;
    }

    public void setTl(String tl) {
        this.tl = tl == null ? null : tl.trim();
    }

    public Short getTlMinDay() {
        return tlMinDay;
    }

    public void setTlMinDay(Short tlMinDay) {
        this.tlMinDay = tlMinDay;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Short getPicMinDay() {
        return picMinDay;
    }

    public void setPicMinDay(Short picMinDay) {
        this.picMinDay = picMinDay;
    }

    public String getMktPic() {
        return mktPic;
    }

    public void setMktPic(String mktPic) {
        this.mktPic = mktPic == null ? null : mktPic.trim();
    }

    public Short getMktPicMinDay() {
        return mktPicMinDay;
    }

    public void setMktPicMinDay(Short mktPicMinDay) {
        this.mktPicMinDay = mktPicMinDay;
    }

    public String getIsManual() {
        return isManual;
    }

    public void setIsManual(String isManual) {
        this.isManual = isManual == null ? null : isManual.trim();
    }

    public String getRoiB() {
        return roiB;
    }

    public void setRoiB(String roiB) {
        this.roiB = roiB == null ? null : roiB.trim();
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }
}