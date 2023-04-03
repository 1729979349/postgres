package com.croky.postgres.dal.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Croky.Zheng
 * @date 2023-03-07 15:30:24
*/
public class CompetitionMonitoring implements Serializable {
    /**
     *
     * The database column name:competition_monitoring.id;length:10;type:INTEGER;default:"nextval('competition_monitoring_id_seq'::regclass)";comment:"null"
     */
    private Integer id;

    /**
     *
     * The database column name:competition_monitoring.brand;length:64;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String brand;

    /**
     *
     * The database column name:competition_monitoring.lazada;length:512;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String lazada;

    /**
     *
     * The database column name:competition_monitoring.shopee;length:512;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String shopee;

    /**
     *
     * The database column name:competition_monitoring.shopee_shop_id;length:32;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String shopeeShopId;

    /**
     *
     * The database column name:competition_monitoring.qoo10;length:512;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String qoo10;

    /**
     *
     * The database column name:competition_monitoring.tmall;length:512;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String tmall;

    /**
     *
     * The database column name:competition_monitoring.jd;length:512;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String jd;

    /**
     *
     * The database column name:competition_monitoring.gmt_modify;length:29;type:TIMESTAMP;default:"null";comment:"null"
     */
    private Date lastModifyDateTime;

    /**
     *
     * The database column name:competition_monitoring.gmt_create;length:29;type:TIMESTAMP;default:"null";comment:"null"
     */
    private Date createDateTime;

    /**

     */
    private static final long serialVersionUID = 1L;

    /**

     *
     * @return the value of competition_monitoring.id
     */
    public Integer getId() {
        return id;
    }

    /**

     *
     * @param id the value for competition_monitoring.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**

     *
     * @return the value of competition_monitoring.brand
     */
    public String getBrand() {
        return brand;
    }

    /**

     *
     * @param brand the value for competition_monitoring.brand
     */
    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    /**

     *
     * @return the value of competition_monitoring.lazada
     */
    public String getLazada() {
        return lazada;
    }

    /**

     *
     * @param lazada the value for competition_monitoring.lazada
     */
    public void setLazada(String lazada) {
        this.lazada = lazada == null ? null : lazada.trim();
    }

    /**

     *
     * @return the value of competition_monitoring.shopee
     */
    public String getShopee() {
        return shopee;
    }

    /**

     *
     * @param shopee the value for competition_monitoring.shopee
     */
    public void setShopee(String shopee) {
        this.shopee = shopee == null ? null : shopee.trim();
    }

    /**

     *
     * @return the value of competition_monitoring.shopee_shop_id
     */
    public String getShopeeShopId() {
        return shopeeShopId;
    }

    /**

     *
     * @param shopeeShopId the value for competition_monitoring.shopee_shop_id
     */
    public void setShopeeShopId(String shopeeShopId) {
        this.shopeeShopId = shopeeShopId == null ? null : shopeeShopId.trim();
    }

    /**

     *
     * @return the value of competition_monitoring.qoo10
     */
    public String getQoo10() {
        return qoo10;
    }

    /**

     *
     * @param qoo10 the value for competition_monitoring.qoo10
     */
    public void setQoo10(String qoo10) {
        this.qoo10 = qoo10 == null ? null : qoo10.trim();
    }

    /**

     *
     * @return the value of competition_monitoring.tmall
     */
    public String getTmall() {
        return tmall;
    }

    /**

     *
     * @param tmall the value for competition_monitoring.tmall
     */
    public void setTmall(String tmall) {
        this.tmall = tmall == null ? null : tmall.trim();
    }

    /**

     *
     * @return the value of competition_monitoring.jd
     */
    public String getJd() {
        return jd;
    }

    /**

     *
     * @param jd the value for competition_monitoring.jd
     */
    public void setJd(String jd) {
        this.jd = jd == null ? null : jd.trim();
    }

    /**

     *
     * @return the value of competition_monitoring.gmt_modify
     */
    public Date getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**

     *
     * @param lastModifyDateTime the value for competition_monitoring.gmt_modify
     */
    public void setLastModifyDateTime(Date lastModifyDateTime) {
        this.lastModifyDateTime = lastModifyDateTime;
    }

    /**

     *
     * @return the value of competition_monitoring.gmt_create
     */
    public Date getCreateDateTime() {
        return createDateTime;
    }

    /**

     *
     * @param createDateTime the value for competition_monitoring.gmt_create
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
        CompetitionMonitoring other = (CompetitionMonitoring) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getBrand() == null ? other.getBrand() == null : this.getBrand().equals(other.getBrand()))
            && (this.getLazada() == null ? other.getLazada() == null : this.getLazada().equals(other.getLazada()))
            && (this.getShopee() == null ? other.getShopee() == null : this.getShopee().equals(other.getShopee()))
            && (this.getShopeeShopId() == null ? other.getShopeeShopId() == null : this.getShopeeShopId().equals(other.getShopeeShopId()))
            && (this.getQoo10() == null ? other.getQoo10() == null : this.getQoo10().equals(other.getQoo10()))
            && (this.getTmall() == null ? other.getTmall() == null : this.getTmall().equals(other.getTmall()))
            && (this.getJd() == null ? other.getJd() == null : this.getJd().equals(other.getJd()))
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
        result = prime * result + ((getBrand() == null) ? 0 : getBrand().hashCode());
        result = prime * result + ((getLazada() == null) ? 0 : getLazada().hashCode());
        result = prime * result + ((getShopee() == null) ? 0 : getShopee().hashCode());
        result = prime * result + ((getShopeeShopId() == null) ? 0 : getShopeeShopId().hashCode());
        result = prime * result + ((getQoo10() == null) ? 0 : getQoo10().hashCode());
        result = prime * result + ((getTmall() == null) ? 0 : getTmall().hashCode());
        result = prime * result + ((getJd() == null) ? 0 : getJd().hashCode());
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
        sb.append(", brand=").append(brand);
        sb.append(", lazada=").append(lazada);
        sb.append(", shopee=").append(shopee);
        sb.append(", shopeeShopId=").append(shopeeShopId);
        sb.append(", qoo10=").append(qoo10);
        sb.append(", tmall=").append(tmall);
        sb.append(", jd=").append(jd);
        sb.append(", lastModifyDateTime=").append(lastModifyDateTime);
        sb.append(", createDateTime=").append(createDateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}