package com.croky.postgres.dal.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Croky.Zheng
 * @date 2023-03-06 17:19:16
*/
public class AlertStore implements Serializable {
    /**
     *
     * The database column name:alert_store.id;length:10;type:INTEGER;default:"nextval('alert_store_id_seq'::regclass)";comment:"null"
     */
    private Integer id;

    /**
     *
     * The database column name:alert_store.country;length:16;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String country;

    /**
     *
     * The database column name:alert_store.brand;length:16;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String brand;

    /**
     *
     * The database column name:alert_store.platform;length:64;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String platform;

    /**
     *
     * The database column name:alert_store.store_name;length:64;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String storeName;

    /**
     *
     * The database column name:alert_store.store_id;length:32;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String storeId;

    /**
     *
     * The database column name:alert_store.mkt_type;length:128;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String mktType;

    /**
     *
     * The database column name:alert_store.tl;length:128;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String tl;

    /**
     *
     * The database column name:alert_store.tl_min_day;length:5;type:SMALLINT;default:"null";comment:"null"
     */
    private Short tlMinDay;

    /**
     *
     * The database column name:alert_store.pic;length:128;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String pic;

    /**
     *
     * The database column name:alert_store.pic_min_day;length:5;type:SMALLINT;default:"null";comment:"null"
     */
    private Short picMinDay;

    /**
     *
     * The database column name:alert_store.mkt_pic;length:128;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String mktPic;

    /**
     *
     * The database column name:alert_store.mkt_pic_min_day;length:5;type:SMALLINT;default:"null";comment:"null"
     */
    private Short mktPicMinDay;

    /**
     *
     * The database column name:alert_store.is_manual;length:10;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String isManual;

    /**
     *
     * The database column name:alert_store.roi_b;length:8;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String roiB;

    /**
     *
     * The database column name:alert_store.remarks;length:256;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String remarks;

    /**
     *
     * The database column name:alert_store.gmt_modify;length:29;type:TIMESTAMP;default:"null";comment:"null"
     */
    private Date lastModifyDateTime;

    /**
     *
     * The database column name:alert_store.gmt_create;length:29;type:TIMESTAMP;default:"null";comment:"null"
     */
    private Date createDateTime;

    /**

     */
    private static final long serialVersionUID = 1L;

    /**

     *
     * @return the value of alert_store.id
     */
    public Integer getId() {
        return id;
    }

    /**

     *
     * @param id the value for alert_store.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**

     *
     * @return the value of alert_store.country
     */
    public String getCountry() {
        return country;
    }

    /**

     *
     * @param country the value for alert_store.country
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**

     *
     * @return the value of alert_store.brand
     */
    public String getBrand() {
        return brand;
    }

    /**

     *
     * @param brand the value for alert_store.brand
     */
    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    /**

     *
     * @return the value of alert_store.platform
     */
    public String getPlatform() {
        return platform;
    }

    /**

     *
     * @param platform the value for alert_store.platform
     */
    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    /**

     *
     * @return the value of alert_store.store_name
     */
    public String getStoreName() {
        return storeName;
    }

    /**

     *
     * @param storeName the value for alert_store.store_name
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /**

     *
     * @return the value of alert_store.store_id
     */
    public String getStoreId() {
        return storeId;
    }

    /**

     *
     * @param storeId the value for alert_store.store_id
     */
    public void setStoreId(String storeId) {
        this.storeId = storeId == null ? null : storeId.trim();
    }

    /**

     *
     * @return the value of alert_store.mkt_type
     */
    public String getMktType() {
        return mktType;
    }

    /**

     *
     * @param mktType the value for alert_store.mkt_type
     */
    public void setMktType(String mktType) {
        this.mktType = mktType == null ? null : mktType.trim();
    }

    /**

     *
     * @return the value of alert_store.tl
     */
    public String getTl() {
        return tl;
    }

    /**

     *
     * @param tl the value for alert_store.tl
     */
    public void setTl(String tl) {
        this.tl = tl == null ? null : tl.trim();
    }

    /**

     *
     * @return the value of alert_store.tl_min_day
     */
    public Short getTlMinDay() {
        return tlMinDay;
    }

    /**

     *
     * @param tlMinDay the value for alert_store.tl_min_day
     */
    public void setTlMinDay(Short tlMinDay) {
        this.tlMinDay = tlMinDay;
    }

    /**

     *
     * @return the value of alert_store.pic
     */
    public String getPic() {
        return pic;
    }

    /**

     *
     * @param pic the value for alert_store.pic
     */
    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    /**

     *
     * @return the value of alert_store.pic_min_day
     */
    public Short getPicMinDay() {
        return picMinDay;
    }

    /**

     *
     * @param picMinDay the value for alert_store.pic_min_day
     */
    public void setPicMinDay(Short picMinDay) {
        this.picMinDay = picMinDay;
    }

    /**

     *
     * @return the value of alert_store.mkt_pic
     */
    public String getMktPic() {
        return mktPic;
    }

    /**

     *
     * @param mktPic the value for alert_store.mkt_pic
     */
    public void setMktPic(String mktPic) {
        this.mktPic = mktPic == null ? null : mktPic.trim();
    }

    /**

     *
     * @return the value of alert_store.mkt_pic_min_day
     */
    public Short getMktPicMinDay() {
        return mktPicMinDay;
    }

    /**

     *
     * @param mktPicMinDay the value for alert_store.mkt_pic_min_day
     */
    public void setMktPicMinDay(Short mktPicMinDay) {
        this.mktPicMinDay = mktPicMinDay;
    }

    /**

     *
     * @return the value of alert_store.is_manual
     */
    public String getIsManual() {
        return isManual;
    }

    /**

     *
     * @param isManual the value for alert_store.is_manual
     */
    public void setIsManual(String isManual) {
        this.isManual = isManual == null ? null : isManual.trim();
    }

    /**

     *
     * @return the value of alert_store.roi_b
     */
    public String getRoiB() {
        return roiB;
    }

    /**

     *
     * @param roiB the value for alert_store.roi_b
     */
    public void setRoiB(String roiB) {
        this.roiB = roiB == null ? null : roiB.trim();
    }

    /**

     *
     * @return the value of alert_store.remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**

     *
     * @param remarks the value for alert_store.remarks
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**

     *
     * @return the value of alert_store.gmt_modify
     */
    public Date getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**

     *
     * @param lastModifyDateTime the value for alert_store.gmt_modify
     */
    public void setLastModifyDateTime(Date lastModifyDateTime) {
        this.lastModifyDateTime = lastModifyDateTime;
    }

    /**

     *
     * @return the value of alert_store.gmt_create
     */
    public Date getCreateDateTime() {
        return createDateTime;
    }

    /**

     *
     * @param createDateTime the value for alert_store.gmt_create
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
        AlertStore other = (AlertStore) that;
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