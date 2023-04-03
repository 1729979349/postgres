package com.croky.postgres.dal.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Croky.Zheng
 * @date 2023-02-28 11:16:30
*/
public class AlertDate implements Serializable {
    /**
     *
     * The database column name:alert_date.id;length:10;type:INTEGER;default:"nextval('alert_date_id_seq'::regclass)";comment:"null"
     */
    private Integer id;

    /**
     *
     * The database column name:alert_date.country;length:16;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String country;

    /**
     *
     * The database column name:alert_date.tier;length:8;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String tier;

    /**
     *
     * The database column name:alert_date.name;length:64;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String name;

    /**
     *
     * The database column name:alert_date.start_date;length:32;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String startDate;

    /**
     *
     * The database column name:alert_date.end_date;length:32;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String endDate;

    /**
     *
     * The database column name:alert_date.date_of_data;length:13;type:DATE;default:"null";comment:"null"
     */
    private Date dateOfData;

    /**
     *
     * The database column name:alert_date.platform;length:64;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String platform;

    /**
     *
     * The database column name:alert_date.year;length:16;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String year;

    /**
     *
     * The database column name:alert_date.gmt_modify;length:29;type:TIMESTAMP;default:"null";comment:"null"
     */
    private Date lastModifyDateTime;

    /**
     *
     * The database column name:alert_date.gmt_create;length:29;type:TIMESTAMP;default:"null";comment:"null"
     */
    private Date createDateTime;

    /**

     */
    private static final long serialVersionUID = 1L;

    /**

     *
     * @return the value of alert_date.id
     */
    public Integer getId() {
        return id;
    }

    /**

     *
     * @param id the value for alert_date.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**

     *
     * @return the value of alert_date.country
     */
    public String getCountry() {
        return country;
    }

    /**

     *
     * @param country the value for alert_date.country
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**

     *
     * @return the value of alert_date.tier
     */
    public String getTier() {
        return tier;
    }

    /**

     *
     * @param tier the value for alert_date.tier
     */
    public void setTier(String tier) {
        this.tier = tier == null ? null : tier.trim();
    }

    /**

     *
     * @return the value of alert_date.name
     */
    public String getName() {
        return name;
    }

    /**

     *
     * @param name the value for alert_date.name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**

     *
     * @return the value of alert_date.start_date
     */
    public String getStartDate() {
        return startDate;
    }

    /**

     *
     * @param startDate the value for alert_date.start_date
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    /**

     *
     * @return the value of alert_date.end_date
     */
    public String getEndDate() {
        return endDate;
    }

    /**

     *
     * @param endDate the value for alert_date.end_date
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    /**

     *
     * @return the value of alert_date.date_of_data
     */
    public Date getDateOfData() {
        return dateOfData;
    }

    /**

     *
     * @param dateOfData the value for alert_date.date_of_data
     */
    public void setDateOfData(Date dateOfData) {
        this.dateOfData = dateOfData;
    }

    /**

     *
     * @return the value of alert_date.platform
     */
    public String getPlatform() {
        return platform;
    }

    /**

     *
     * @param platform the value for alert_date.platform
     */
    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    /**

     *
     * @return the value of alert_date.year
     */
    public String getYear() {
        return year;
    }

    /**

     *
     * @param year the value for alert_date.year
     */
    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }

    /**

     *
     * @return the value of alert_date.gmt_modify
     */
    public Date getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**

     *
     * @param lastModifyDateTime the value for alert_date.gmt_modify
     */
    public void setLastModifyDateTime(Date lastModifyDateTime) {
        this.lastModifyDateTime = lastModifyDateTime;
    }

    /**

     *
     * @return the value of alert_date.gmt_create
     */
    public Date getCreateDateTime() {
        return createDateTime;
    }

    /**

     *
     * @param createDateTime the value for alert_date.gmt_create
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
        AlertDate other = (AlertDate) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getTier() == null ? other.getTier() == null : this.getTier().equals(other.getTier()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getStartDate() == null ? other.getStartDate() == null : this.getStartDate().equals(other.getStartDate()))
            && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
            && (this.getDateOfData() == null ? other.getDateOfData() == null : this.getDateOfData().equals(other.getDateOfData()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getYear() == null ? other.getYear() == null : this.getYear().equals(other.getYear()))
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
        result = prime * result + ((getTier() == null) ? 0 : getTier().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getDateOfData() == null) ? 0 : getDateOfData().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getYear() == null) ? 0 : getYear().hashCode());
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
        sb.append(", tier=").append(tier);
        sb.append(", name=").append(name);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", dateOfData=").append(dateOfData);
        sb.append(", platform=").append(platform);
        sb.append(", year=").append(year);
        sb.append(", lastModifyDateTime=").append(lastModifyDateTime);
        sb.append(", createDateTime=").append(createDateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}