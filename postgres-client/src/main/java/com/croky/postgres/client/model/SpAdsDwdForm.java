package com.croky.postgres.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;
import org.springframework.format.annotation.NumberFormat;

@Schema(title = "SpAdsDwdForm-提交null")
public class SpAdsDwdForm {
    @Schema(title = "null", name = "date_of_data", nullable = true, example = "null", maxLength = 13)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date dateOfData;

    @Schema(title = "null", name = "store_id", nullable = true, example = "NULL::character varying", maxLength = 20)
    private String storeId;

    @Schema(title = "null", name = "product_name_ad_name", nullable = true, example = "NULL::character varying", maxLength = 500)
    private String productNameAdName;

    @Schema(title = "null", name = "status", nullable = true, example = "NULL::character varying", maxLength = 500)
    private String status;

    @Schema(title = "null", name = "product_id", nullable = true, example = "NULL::character varying", maxLength = 500)
    private String productId;

    @Schema(title = "null", name = "ads_type", nullable = true, example = "NULL::character varying", maxLength = 500)
    private String adsType;

    @Schema(title = "null", name = "placement_keyword", nullable = true, example = "NULL::character varying", maxLength = 500)
    private String placementKeyword;

    @Schema(title = "null", name = "start_date", nullable = true, example = "null", maxLength = 13)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date startDate;

    @Schema(title = "null", name = "end_date", nullable = true, example = "NULL::character varying", maxLength = 50)
    private String endDate;

    @Schema(title = "null", name = "impression", nullable = true, example = "null", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer impression;

    @Schema(title = "null", name = "clicks", nullable = true, example = "null", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer clicks;

    @Schema(title = "null", name = "ctr", nullable = true, example = "null", maxLength = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short ctr;

    @Schema(title = "null", name = "conversions", nullable = true, example = "null", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer conversions;

    @Schema(title = "null", name = "direct_conversions", nullable = true, example = "null", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer directConversions;

    @Schema(title = "null", name = "conversion_rate", nullable = true, example = "null", maxLength = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short conversionRate;

    @Schema(title = "null", name = "direct_conversion_rate", nullable = true, example = "null", maxLength = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short directConversionRate;

    @Schema(title = "null", name = "cost_per_conversion", nullable = true, example = "null", maxLength = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short costPerConversion;

    @Schema(title = "null", name = "cost_per_direct_conversion", nullable = true, example = "null", maxLength = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short costPerDirectConversion;

    @Schema(title = "null", name = "items_sold", nullable = true, example = "null", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer itemsSold;

    @Schema(title = "null", name = "direct_items_sold", nullable = true, example = "null", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer directItemsSold;

    @Schema(title = "null", name = "gmv", nullable = true, example = "null", maxLength = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short gmv;

    @Schema(title = "null", name = "direct_gmv", nullable = true, example = "null", maxLength = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short directGmv;

    @Schema(title = "null", name = "expense", nullable = true, example = "null", maxLength = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short expense;

    @Schema(title = "null", name = "roi", nullable = true, example = "null", maxLength = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short roi;

    @Schema(title = "null", name = "direct_roi", nullable = true, example = "null", maxLength = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short directRoi;

    @Schema(title = "null", name = "cir", nullable = true, example = "null", maxLength = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short cir;

    @Schema(title = "null", name = "direct_cir", nullable = true, example = "null", maxLength = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short directCir;

    @Schema(title = "null", name = "product_impressions", nullable = true, example = "null", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer productImpressions;

    @Schema(title = "null", name = "product_clicks", nullable = true, example = "null", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer productClicks;

    @Schema(title = "null", name = "product_ctr", nullable = true, example = "null", maxLength = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short productCtr;

    @Schema(title = "null", name = "flow_id", nullable = true, example = "null", maxLength = 50)
    private String flowId;

    public Date getDateOfData() {
        return dateOfData;
    }

    public void setDateOfData(Date dateOfData) {
        this.dateOfData = dateOfData;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId == null ? null : storeId.trim();
    }

    public String getProductNameAdName() {
        return productNameAdName;
    }

    public void setProductNameAdName(String productNameAdName) {
        this.productNameAdName = productNameAdName == null ? null : productNameAdName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getAdsType() {
        return adsType;
    }

    public void setAdsType(String adsType) {
        this.adsType = adsType == null ? null : adsType.trim();
    }

    public String getPlacementKeyword() {
        return placementKeyword;
    }

    public void setPlacementKeyword(String placementKeyword) {
        this.placementKeyword = placementKeyword == null ? null : placementKeyword.trim();
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    public Integer getImpression() {
        return impression;
    }

    public void setImpression(Integer impression) {
        this.impression = impression;
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    public Short getCtr() {
        return ctr;
    }

    public void setCtr(Short ctr) {
        this.ctr = ctr;
    }

    public Integer getConversions() {
        return conversions;
    }

    public void setConversions(Integer conversions) {
        this.conversions = conversions;
    }

    public Integer getDirectConversions() {
        return directConversions;
    }

    public void setDirectConversions(Integer directConversions) {
        this.directConversions = directConversions;
    }

    public Short getConversionRate() {
        return conversionRate;
    }

    public void setConversionRate(Short conversionRate) {
        this.conversionRate = conversionRate;
    }

    public Short getDirectConversionRate() {
        return directConversionRate;
    }

    public void setDirectConversionRate(Short directConversionRate) {
        this.directConversionRate = directConversionRate;
    }

    public Short getCostPerConversion() {
        return costPerConversion;
    }

    public void setCostPerConversion(Short costPerConversion) {
        this.costPerConversion = costPerConversion;
    }

    public Short getCostPerDirectConversion() {
        return costPerDirectConversion;
    }

    public void setCostPerDirectConversion(Short costPerDirectConversion) {
        this.costPerDirectConversion = costPerDirectConversion;
    }

    public Integer getItemsSold() {
        return itemsSold;
    }

    public void setItemsSold(Integer itemsSold) {
        this.itemsSold = itemsSold;
    }

    public Integer getDirectItemsSold() {
        return directItemsSold;
    }

    public void setDirectItemsSold(Integer directItemsSold) {
        this.directItemsSold = directItemsSold;
    }

    public Short getGmv() {
        return gmv;
    }

    public void setGmv(Short gmv) {
        this.gmv = gmv;
    }

    public Short getDirectGmv() {
        return directGmv;
    }

    public void setDirectGmv(Short directGmv) {
        this.directGmv = directGmv;
    }

    public Short getExpense() {
        return expense;
    }

    public void setExpense(Short expense) {
        this.expense = expense;
    }

    public Short getRoi() {
        return roi;
    }

    public void setRoi(Short roi) {
        this.roi = roi;
    }

    public Short getDirectRoi() {
        return directRoi;
    }

    public void setDirectRoi(Short directRoi) {
        this.directRoi = directRoi;
    }

    public Short getCir() {
        return cir;
    }

    public void setCir(Short cir) {
        this.cir = cir;
    }

    public Short getDirectCir() {
        return directCir;
    }

    public void setDirectCir(Short directCir) {
        this.directCir = directCir;
    }

    public Integer getProductImpressions() {
        return productImpressions;
    }

    public void setProductImpressions(Integer productImpressions) {
        this.productImpressions = productImpressions;
    }

    public Integer getProductClicks() {
        return productClicks;
    }

    public void setProductClicks(Integer productClicks) {
        this.productClicks = productClicks;
    }

    public Short getProductCtr() {
        return productCtr;
    }

    public void setProductCtr(Short productCtr) {
        this.productCtr = productCtr;
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
    }
}