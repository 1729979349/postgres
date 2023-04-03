package com.croky.postgres.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;
import org.springframework.format.annotation.NumberFormat;

@Schema(title = "AlertDateForm-提交null")
public class AlertDateForm {
    @Schema(title = "null", name = "id", nullable = false, example = "nextval('alert_date_id_seq'::regclass)", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer id;

    @Schema(title = "null", name = "country", nullable = true, example = "NULL::character varying", maxLength = 16)
    private String country;

    @Schema(title = "null", name = "tier", nullable = true, example = "NULL::character varying", maxLength = 8)
    private String tier;

    @Schema(title = "null", name = "name", nullable = true, example = "NULL::character varying", maxLength = 64)
    private String name;

    @Schema(title = "null", name = "start_date", nullable = true, example = "NULL::character varying", maxLength = 32)
    private String startDate;

    @Schema(title = "null", name = "end_date", nullable = true, example = "NULL::character varying", maxLength = 32)
    private String endDate;

    @Schema(title = "null", name = "date_of_data", nullable = true, example = "null", maxLength = 13)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date dateOfData;

    @Schema(title = "null", name = "platform", nullable = true, example = "NULL::character varying", maxLength = 64)
    private String platform;

    @Schema(title = "null", name = "year", nullable = true, example = "NULL::character varying", maxLength = 16)
    private String year;

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

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier == null ? null : tier.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate == null ? null : startDate.trim();
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    public Date getDateOfData() {
        return dateOfData;
    }

    public void setDateOfData(Date dateOfData) {
        this.dateOfData = dateOfData;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year == null ? null : year.trim();
    }
}