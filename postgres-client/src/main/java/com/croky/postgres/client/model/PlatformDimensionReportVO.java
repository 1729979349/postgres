package com.croky.postgres.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.NumberFormat;

/**
 * @author Croky.Zheng
 * @date 2023-03-06 17:48:11
*/
@Schema(title = "PlatformDimensionReportVO-返回null")
public class PlatformDimensionReportVO implements Serializable {
    @Schema(title = "null", name = "id", nullable = false, example = "nextval('alert_date_id_seq'::regclass)", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer id;

    @Schema(title = "null", name = "channel", nullable = true, example = "NULL::character varying", maxLength = 8)
    private String channel;

    @Schema(title = "null", name = "platform_type", nullable = true, example = "NULL::character varying", maxLength = 16)
    private String platformType;

    @Schema(title = "null", name = "platform", nullable = true, example = "NULL::character varying", maxLength = 16)
    private String platform;

    @Schema(title = "null", name = "data_category", nullable = true, example = "NULL::character varying", maxLength = 32)
    private String dataCategory;

    @Schema(title = "null", name = "source_category", nullable = true, example = "NULL::character varying", maxLength = 32)
    private String sourceCategory;

    @Schema(title = "null", name = "source", nullable = true, example = "NULL::character varying", maxLength = 32)
    private String source;

    @Schema(title = "null", name = "table_name_dwd", nullable = true, example = "NULL::character varying", maxLength = 64)
    private String tableNameDwd;

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

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel == null ? null : channel.trim();
    }

    public String getPlatformType() {
        return platformType;
    }

    public void setPlatformType(String platformType) {
        this.platformType = platformType == null ? null : platformType.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getDataCategory() {
        return dataCategory;
    }

    public void setDataCategory(String dataCategory) {
        this.dataCategory = dataCategory == null ? null : dataCategory.trim();
    }

    public String getSourceCategory() {
        return sourceCategory;
    }

    public void setSourceCategory(String sourceCategory) {
        this.sourceCategory = sourceCategory == null ? null : sourceCategory.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getTableNameDwd() {
        return tableNameDwd;
    }

    public void setTableNameDwd(String tableNameDwd) {
        this.tableNameDwd = tableNameDwd == null ? null : tableNameDwd.trim();
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
        PlatformDimensionReportVO other = (PlatformDimensionReportVO) that;
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