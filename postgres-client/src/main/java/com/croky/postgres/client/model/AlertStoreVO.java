package com.croky.postgres.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.NumberFormat;

/**
 * @author Croky.Zheng
 * @date 2023-03-06 17:19:16
*/
@Schema(title = "AlertStoreVO-返回null")
public class AlertStoreVO implements Serializable {
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
        AlertStoreVO other = (AlertStoreVO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getStoreName() == null ? other.getStoreName() == null : this.getStoreName().equals(other.getStoreName()))
            && (this.getStoreId() == null ? other.getStoreId() == null : this.getStoreId().equals(other.getStoreId()))
            && (this.getMktType() == null ? other.getMktType() == null : this.getMktType().equals(other.getMktType()))
            && (this.getTl() == null ? other.getTl() == null : this.getTl().equals(other.getTl()))
            && (this.getTlMinDay() == null ? other.getTlMinDay() == null : this.getTlMinDay().equals(other.getTlMinDay()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()))
            && (this.getPicMinDay() == null ? other.getPicMinDay() == null : this.getPicMinDay().equals(other.getPicMinDay()))
            && (this.getMktPic() == null ? other.getMktPic() == null : this.getMktPic().equals(other.getMktPic()))
            && (this.getMktPicMinDay() == null ? other.getMktPicMinDay() == null : this.getMktPicMinDay().equals(other.getMktPicMinDay()))
            && (this.getIsManual() == null ? other.getIsManual() == null : this.getIsManual().equals(other.getIsManual()))
            && (this.getRoiB() == null ? other.getRoiB() == null : this.getRoiB().equals(other.getRoiB()))
            && (this.getRemarks() == null ? other.getRemarks() == null : this.getRemarks().equals(other.getRemarks()))
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
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getStoreName() == null) ? 0 : getStoreName().hashCode());
        result = prime * result + ((getStoreId() == null) ? 0 : getStoreId().hashCode());
        result = prime * result + ((getMktType() == null) ? 0 : getMktType().hashCode());
        result = prime * result + ((getTl() == null) ? 0 : getTl().hashCode());
        result = prime * result + ((getTlMinDay() == null) ? 0 : getTlMinDay().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
        result = prime * result + ((getPicMinDay() == null) ? 0 : getPicMinDay().hashCode());
        result = prime * result + ((getMktPic() == null) ? 0 : getMktPic().hashCode());
        result = prime * result + ((getMktPicMinDay() == null) ? 0 : getMktPicMinDay().hashCode());
        result = prime * result + ((getIsManual() == null) ? 0 : getIsManual().hashCode());
        result = prime * result + ((getRoiB() == null) ? 0 : getRoiB().hashCode());
        result = prime * result + ((getRemarks() == null) ? 0 : getRemarks().hashCode());
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
        sb.append(", country=").append(country);
        sb.append(", brand=").append(brand);
        sb.append(", platform=").append(platform);
        sb.append(", storeName=").append(storeName);
        sb.append(", storeId=").append(storeId);
        sb.append(", mktType=").append(mktType);
        sb.append(", tl=").append(tl);
        sb.append(", tlMinDay=").append(tlMinDay);
        sb.append(", pic=").append(pic);
        sb.append(", picMinDay=").append(picMinDay);
        sb.append(", mktPic=").append(mktPic);
        sb.append(", mktPicMinDay=").append(mktPicMinDay);
        sb.append(", isManual=").append(isManual);
        sb.append(", roiB=").append(roiB);
        sb.append(", remarks=").append(remarks);
        sb.append(", lastModifyDateTime=").append(lastModifyDateTime);
        sb.append(", createDateTime=").append(createDateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}