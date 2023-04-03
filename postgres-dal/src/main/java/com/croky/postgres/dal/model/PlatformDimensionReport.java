package com.croky.postgres.dal.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Croky.Zheng
 * @date 2023-03-06 17:48:11
*/
public class PlatformDimensionReport implements Serializable {
    /**
     *
     * The database column name:platform_dimension_report.id;length:10;type:INTEGER;default:"nextval('alert_date_id_seq'::regclass)";comment:"null"
     */
    private Integer id;

    /**
     *
     * The database column name:platform_dimension_report.channel;length:8;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String channel;

    /**
     *
     * The database column name:platform_dimension_report.platform_type;length:16;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String platformType;

    /**
     *
     * The database column name:platform_dimension_report.platform;length:16;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String platform;

    /**
     *
     * The database column name:platform_dimension_report.data_category;length:32;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String dataCategory;

    /**
     *
     * The database column name:platform_dimension_report.source_category;length:32;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String sourceCategory;

    /**
     *
     * The database column name:platform_dimension_report.source;length:32;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String source;

    /**
     *
     * The database column name:platform_dimension_report.table_name_dwd;length:64;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String tableNameDwd;

    /**
     *
     * The database column name:platform_dimension_report.gmt_modify;length:29;type:TIMESTAMP;default:"null";comment:"null"
     */
    private Date lastModifyDateTime;

    /**
     *
     * The database column name:platform_dimension_report.gmt_create;length:29;type:TIMESTAMP;default:"null";comment:"null"
     */
    private Date createDateTime;

    /**

     */
    private static final long serialVersionUID = 1L;

    /**

     *
     * @return the value of platform_dimension_report.id
     */
    public Integer getId() {
        return id;
    }

    /**

     *
     * @param id the value for platform_dimension_report.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**

     *
     * @return the value of platform_dimension_report.channel
     */
    public String getChannel() {
        return channel;
    }

    /**

     *
     * @param channel the value for platform_dimension_report.channel
     */
    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    /**

     *
     * @return the value of platform_dimension_report.platform_type
     */
    public String getPlatformType() {
        return platformType;
    }

    /**

     *
     * @param platformType the value for platform_dimension_report.platform_type
     */
    public void setPlatformType(String platformType) {
        this.platformType = platformType == null ? null : platformType.trim();
    }

    /**

     *
     * @return the value of platform_dimension_report.platform
     */
    public String getPlatform() {
        return platform;
    }

    /**

     *
     * @param platform the value for platform_dimension_report.platform
     */
    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    /**

     *
     * @return the value of platform_dimension_report.data_category
     */
    public String getDataCategory() {
        return dataCategory;
    }

    /**

     *
     * @param dataCategory the value for platform_dimension_report.data_category
     */
    public void setDataCategory(String dataCategory) {
        this.dataCategory = dataCategory == null ? null : dataCategory.trim();
    }

    /**

     *
     * @return the value of platform_dimension_report.source_category
     */
    public String getSourceCategory() {
        return sourceCategory;
    }

    /**

     *
     * @param sourceCategory the value for platform_dimension_report.source_category
     */
    public void setSourceCategory(String sourceCategory) {
        this.sourceCategory = sourceCategory == null ? null : sourceCategory.trim();
    }

    /**

     *
     * @return the value of platform_dimension_report.source
     */
    public String getSource() {
        return source;
    }

    /**

     *
     * @param source the value for platform_dimension_report.source
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**

     *
     * @return the value of platform_dimension_report.table_name_dwd
     */
    public String getTableNameDwd() {
        return tableNameDwd;
    }

    /**

     *
     * @param tableNameDwd the value for platform_dimension_report.table_name_dwd
     */
    public void setTableNameDwd(String tableNameDwd) {
        this.tableNameDwd = tableNameDwd == null ? null : tableNameDwd.trim();
    }

    /**

     *
     * @return the value of platform_dimension_report.gmt_modify
     */
    public Date getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**

     *
     * @param lastModifyDateTime the value for platform_dimension_report.gmt_modify
     */
    public void setLastModifyDateTime(Date lastModifyDateTime) {
        this.lastModifyDateTime = lastModifyDateTime;
    }

    /**

     *
     * @return the value of platform_dimension_report.gmt_create
     */
    public Date getCreateDateTime() {
        return createDateTime;
    }

    /**

     *
     * @param createDateTime the value for platform_dimension_report.gmt_create
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
        PlatformDimensionReport other = (PlatformDimensionReport) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getChannel() == null ? other.getChannel() == null : this.getChannel().equals(other.getChannel()))
            && (this.getPlatformType() == null ? other.getPlatformType() == null : this.getPlatformType().equals(other.getPlatformType()))
            && (this.getPlatform() == null ? other.getPlatform() == null : this.getPlatform().equals(other.getPlatform()))
            && (this.getDataCategory() == null ? other.getDataCategory() == null : this.getDataCategory().equals(other.getDataCategory()))
            && (this.getSourceCategory() == null ? other.getSourceCategory() == null : this.getSourceCategory().equals(other.getSourceCategory()))
            && (this.getSource() == null ? other.getSource() == null : this.getSource().equals(other.getSource()))
            && (this.getTableNameDwd() == null ? other.getTableNameDwd() == null : this.getTableNameDwd().equals(other.getTableNameDwd()))
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
        result = prime * result + ((getChannel() == null) ? 0 : getChannel().hashCode());
        result = prime * result + ((getPlatformType() == null) ? 0 : getPlatformType().hashCode());
        result = prime * result + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        result = prime * result + ((getDataCategory() == null) ? 0 : getDataCategory().hashCode());
        result = prime * result + ((getSourceCategory() == null) ? 0 : getSourceCategory().hashCode());
        result = prime * result + ((getSource() == null) ? 0 : getSource().hashCode());
        result = prime * result + ((getTableNameDwd() == null) ? 0 : getTableNameDwd().hashCode());
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
        sb.append(", channel=").append(channel);
        sb.append(", platformType=").append(platformType);
        sb.append(", platform=").append(platform);
        sb.append(", dataCategory=").append(dataCategory);
        sb.append(", sourceCategory=").append(sourceCategory);
        sb.append(", source=").append(source);
        sb.append(", tableNameDwd=").append(tableNameDwd);
        sb.append(", lastModifyDateTime=").append(lastModifyDateTime);
        sb.append(", createDateTime=").append(createDateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}