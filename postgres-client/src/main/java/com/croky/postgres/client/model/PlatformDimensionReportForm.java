package com.croky.postgres.client.model;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.NumberFormat;

@Schema(title = "PlatformDimensionReportForm-提交null")
public class PlatformDimensionReportForm {
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
}