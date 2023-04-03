package com.croky.postgres.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;
import org.springframework.format.annotation.NumberFormat;

@Schema(title = "LzAdsDiscoveryDwdForm-提交null")
public class LzAdsDiscoveryDwdForm {
    @Schema(title = "null", name = "date_of_data", nullable = true, example = "null", maxLength = 13)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date dateOfData;

    @Schema(title = "null", name = "store_id", nullable = true, example = "null", maxLength = 2147483647)
    private String storeId;

    @Schema(title = "null", name = "date", nullable = true, example = "null", maxLength = 2147483647)
    private String date;

    @Schema(title = "null", name = "campaign_name", nullable = true, example = "null", maxLength = 2147483647)
    private String campaignName;

    @Schema(title = "null", name = "campaign_id", nullable = true, example = "null", maxLength = 2147483647)
    private String campaignId;

    @Schema(title = "null", name = "campaign_objective", nullable = true, example = "null", maxLength = 2147483647)
    private String campaignObjective;

    @Schema(title = "null", name = "campaign_type", nullable = true, example = "null", maxLength = 2147483647)
    private String campaignType;

    @Schema(title = "null", name = "placement", nullable = true, example = "null", maxLength = 2147483647)
    private String placement;

    @Schema(title = "null", name = "budget", nullable = true, example = "null", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer budget;

    @Schema(title = "null", name = "spend", nullable = true, example = "null", maxLength = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short spend;

    @Schema(title = "null", name = "impression", nullable = true, example = "null", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer impression;

    @Schema(title = "null", name = "clicks", nullable = true, example = "null", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer clicks;

    @Schema(title = "null", name = "ctr", nullable = true, example = "null", maxLength = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short ctr;

    @Schema(title = "null", name = "cpc", nullable = true, example = "null", maxLength = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short cpc;

    @Schema(title = "null", name = "store_add_to_cart_units", nullable = true, example = "null", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer storeAddToCartUnits;

    @Schema(title = "null", name = "store_orders", nullable = true, example = "null", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer storeOrders;

    @Schema(title = "null", name = "store_cvr", nullable = true, example = "null", maxLength = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short storeCvr;

    @Schema(title = "null", name = "store_units_sold", nullable = true, example = "null", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer storeUnitsSold;

    @Schema(title = "null", name = "store_revenue", nullable = true, example = "null", maxLength = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short storeRevenue;

    @Schema(title = "null", name = "store_roi", nullable = true, example = "null", maxLength = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short storeRoi;

    @Schema(title = "null", name = "direct_add_to_cart_units", nullable = true, example = "null", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer directAddToCartUnits;

    @Schema(title = "null", name = "direct_orders", nullable = true, example = "null", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer directOrders;

    @Schema(title = "null", name = "direct_cvr", nullable = true, example = "null", maxLength = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short directCvr;

    @Schema(title = "null", name = "direct_units_sold", nullable = true, example = "null", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer directUnitsSold;

    @Schema(title = "null", name = "direct_revenue", nullable = true, example = "null", maxLength = 0)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Short directRevenue;

    @Schema(title = "null", name = "currency", nullable = true, example = "null", maxLength = 2147483647)
    private String currency;

    @Schema(title = "null", name = "flow_id", nullable = true, example = "null", maxLength = 2147483647)
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

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName == null ? null : campaignName.trim();
    }

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId == null ? null : campaignId.trim();
    }

    public String getCampaignObjective() {
        return campaignObjective;
    }

    public void setCampaignObjective(String campaignObjective) {
        this.campaignObjective = campaignObjective == null ? null : campaignObjective.trim();
    }

    public String getCampaignType() {
        return campaignType;
    }

    public void setCampaignType(String campaignType) {
        this.campaignType = campaignType == null ? null : campaignType.trim();
    }

    public String getPlacement() {
        return placement;
    }

    public void setPlacement(String placement) {
        this.placement = placement == null ? null : placement.trim();
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public Short getSpend() {
        return spend;
    }

    public void setSpend(Short spend) {
        this.spend = spend;
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

    public Short getCpc() {
        return cpc;
    }

    public void setCpc(Short cpc) {
        this.cpc = cpc;
    }

    public Integer getStoreAddToCartUnits() {
        return storeAddToCartUnits;
    }

    public void setStoreAddToCartUnits(Integer storeAddToCartUnits) {
        this.storeAddToCartUnits = storeAddToCartUnits;
    }

    public Integer getStoreOrders() {
        return storeOrders;
    }

    public void setStoreOrders(Integer storeOrders) {
        this.storeOrders = storeOrders;
    }

    public Short getStoreCvr() {
        return storeCvr;
    }

    public void setStoreCvr(Short storeCvr) {
        this.storeCvr = storeCvr;
    }

    public Integer getStoreUnitsSold() {
        return storeUnitsSold;
    }

    public void setStoreUnitsSold(Integer storeUnitsSold) {
        this.storeUnitsSold = storeUnitsSold;
    }

    public Short getStoreRevenue() {
        return storeRevenue;
    }

    public void setStoreRevenue(Short storeRevenue) {
        this.storeRevenue = storeRevenue;
    }

    public Short getStoreRoi() {
        return storeRoi;
    }

    public void setStoreRoi(Short storeRoi) {
        this.storeRoi = storeRoi;
    }

    public Integer getDirectAddToCartUnits() {
        return directAddToCartUnits;
    }

    public void setDirectAddToCartUnits(Integer directAddToCartUnits) {
        this.directAddToCartUnits = directAddToCartUnits;
    }

    public Integer getDirectOrders() {
        return directOrders;
    }

    public void setDirectOrders(Integer directOrders) {
        this.directOrders = directOrders;
    }

    public Short getDirectCvr() {
        return directCvr;
    }

    public void setDirectCvr(Short directCvr) {
        this.directCvr = directCvr;
    }

    public Integer getDirectUnitsSold() {
        return directUnitsSold;
    }

    public void setDirectUnitsSold(Integer directUnitsSold) {
        this.directUnitsSold = directUnitsSold;
    }

    public Short getDirectRevenue() {
        return directRevenue;
    }

    public void setDirectRevenue(Short directRevenue) {
        this.directRevenue = directRevenue;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    public String getFlowId() {
        return flowId;
    }

    public void setFlowId(String flowId) {
        this.flowId = flowId == null ? null : flowId.trim();
    }
}