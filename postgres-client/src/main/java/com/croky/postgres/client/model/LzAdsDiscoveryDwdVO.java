package com.croky.postgres.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.NumberFormat;

/**
 * @author Croky.Zheng
 * @date 2023-02-20 11:23:50
*/
@Schema(title = "LzAdsDiscoveryDwdVO-返回null")
public class LzAdsDiscoveryDwdVO implements Serializable {
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

    /**

     */
    private static final long serialVersionUID = 1L;

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
        LzAdsDiscoveryDwdVO other = (LzAdsDiscoveryDwdVO) that;
        return (this.getDateOfData() == null ? other.getDateOfData() == null : this.getDateOfData().equals(other.getDateOfData()))
            && (this.getStoreId() == null ? other.getStoreId() == null : this.getStoreId().equals(other.getStoreId()))
            && (this.getDate() == null ? other.getDate() == null : this.getDate().equals(other.getDate()))
            && (this.getCampaignName() == null ? other.getCampaignName() == null : this.getCampaignName().equals(other.getCampaignName()))
            && (this.getCampaignId() == null ? other.getCampaignId() == null : this.getCampaignId().equals(other.getCampaignId()))
            && (this.getCampaignObjective() == null ? other.getCampaignObjective() == null : this.getCampaignObjective().equals(other.getCampaignObjective()))
            && (this.getCampaignType() == null ? other.getCampaignType() == null : this.getCampaignType().equals(other.getCampaignType()))
            && (this.getPlacement() == null ? other.getPlacement() == null : this.getPlacement().equals(other.getPlacement()))
            && (this.getBudget() == null ? other.getBudget() == null : this.getBudget().equals(other.getBudget()))
            && (this.getSpend() == null ? other.getSpend() == null : this.getSpend().equals(other.getSpend()))
            && (this.getImpression() == null ? other.getImpression() == null : this.getImpression().equals(other.getImpression()))
            && (this.getClicks() == null ? other.getClicks() == null : this.getClicks().equals(other.getClicks()))
            && (this.getCtr() == null ? other.getCtr() == null : this.getCtr().equals(other.getCtr()))
            && (this.getCpc() == null ? other.getCpc() == null : this.getCpc().equals(other.getCpc()))
            && (this.getStoreAddToCartUnits() == null ? other.getStoreAddToCartUnits() == null : this.getStoreAddToCartUnits().equals(other.getStoreAddToCartUnits()))
            && (this.getStoreOrders() == null ? other.getStoreOrders() == null : this.getStoreOrders().equals(other.getStoreOrders()))
            && (this.getStoreCvr() == null ? other.getStoreCvr() == null : this.getStoreCvr().equals(other.getStoreCvr()))
            && (this.getStoreUnitsSold() == null ? other.getStoreUnitsSold() == null : this.getStoreUnitsSold().equals(other.getStoreUnitsSold()))
            && (this.getStoreRevenue() == null ? other.getStoreRevenue() == null : this.getStoreRevenue().equals(other.getStoreRevenue()))
            && (this.getStoreRoi() == null ? other.getStoreRoi() == null : this.getStoreRoi().equals(other.getStoreRoi()))
            && (this.getDirectAddToCartUnits() == null ? other.getDirectAddToCartUnits() == null : this.getDirectAddToCartUnits().equals(other.getDirectAddToCartUnits()))
            && (this.getDirectOrders() == null ? other.getDirectOrders() == null : this.getDirectOrders().equals(other.getDirectOrders()))
            && (this.getDirectCvr() == null ? other.getDirectCvr() == null : this.getDirectCvr().equals(other.getDirectCvr()))
            && (this.getDirectUnitsSold() == null ? other.getDirectUnitsSold() == null : this.getDirectUnitsSold().equals(other.getDirectUnitsSold()))
            && (this.getDirectRevenue() == null ? other.getDirectRevenue() == null : this.getDirectRevenue().equals(other.getDirectRevenue()))
            && (this.getCurrency() == null ? other.getCurrency() == null : this.getCurrency().equals(other.getCurrency()))
            && (this.getFlowId() == null ? other.getFlowId() == null : this.getFlowId().equals(other.getFlowId()));
    }

    /**

     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDateOfData() == null) ? 0 : getDateOfData().hashCode());
        result = prime * result + ((getStoreId() == null) ? 0 : getStoreId().hashCode());
        result = prime * result + ((getDate() == null) ? 0 : getDate().hashCode());
        result = prime * result + ((getCampaignName() == null) ? 0 : getCampaignName().hashCode());
        result = prime * result + ((getCampaignId() == null) ? 0 : getCampaignId().hashCode());
        result = prime * result + ((getCampaignObjective() == null) ? 0 : getCampaignObjective().hashCode());
        result = prime * result + ((getCampaignType() == null) ? 0 : getCampaignType().hashCode());
        result = prime * result + ((getPlacement() == null) ? 0 : getPlacement().hashCode());
        result = prime * result + ((getBudget() == null) ? 0 : getBudget().hashCode());
        result = prime * result + ((getSpend() == null) ? 0 : getSpend().hashCode());
        result = prime * result + ((getImpression() == null) ? 0 : getImpression().hashCode());
        result = prime * result + ((getClicks() == null) ? 0 : getClicks().hashCode());
        result = prime * result + ((getCtr() == null) ? 0 : getCtr().hashCode());
        result = prime * result + ((getCpc() == null) ? 0 : getCpc().hashCode());
        result = prime * result + ((getStoreAddToCartUnits() == null) ? 0 : getStoreAddToCartUnits().hashCode());
        result = prime * result + ((getStoreOrders() == null) ? 0 : getStoreOrders().hashCode());
        result = prime * result + ((getStoreCvr() == null) ? 0 : getStoreCvr().hashCode());
        result = prime * result + ((getStoreUnitsSold() == null) ? 0 : getStoreUnitsSold().hashCode());
        result = prime * result + ((getStoreRevenue() == null) ? 0 : getStoreRevenue().hashCode());
        result = prime * result + ((getStoreRoi() == null) ? 0 : getStoreRoi().hashCode());
        result = prime * result + ((getDirectAddToCartUnits() == null) ? 0 : getDirectAddToCartUnits().hashCode());
        result = prime * result + ((getDirectOrders() == null) ? 0 : getDirectOrders().hashCode());
        result = prime * result + ((getDirectCvr() == null) ? 0 : getDirectCvr().hashCode());
        result = prime * result + ((getDirectUnitsSold() == null) ? 0 : getDirectUnitsSold().hashCode());
        result = prime * result + ((getDirectRevenue() == null) ? 0 : getDirectRevenue().hashCode());
        result = prime * result + ((getCurrency() == null) ? 0 : getCurrency().hashCode());
        result = prime * result + ((getFlowId() == null) ? 0 : getFlowId().hashCode());
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
        sb.append(", dateOfData=").append(dateOfData);
        sb.append(", storeId=").append(storeId);
        sb.append(", date=").append(date);
        sb.append(", campaignName=").append(campaignName);
        sb.append(", campaignId=").append(campaignId);
        sb.append(", campaignObjective=").append(campaignObjective);
        sb.append(", campaignType=").append(campaignType);
        sb.append(", placement=").append(placement);
        sb.append(", budget=").append(budget);
        sb.append(", spend=").append(spend);
        sb.append(", impression=").append(impression);
        sb.append(", clicks=").append(clicks);
        sb.append(", ctr=").append(ctr);
        sb.append(", cpc=").append(cpc);
        sb.append(", storeAddToCartUnits=").append(storeAddToCartUnits);
        sb.append(", storeOrders=").append(storeOrders);
        sb.append(", storeCvr=").append(storeCvr);
        sb.append(", storeUnitsSold=").append(storeUnitsSold);
        sb.append(", storeRevenue=").append(storeRevenue);
        sb.append(", storeRoi=").append(storeRoi);
        sb.append(", directAddToCartUnits=").append(directAddToCartUnits);
        sb.append(", directOrders=").append(directOrders);
        sb.append(", directCvr=").append(directCvr);
        sb.append(", directUnitsSold=").append(directUnitsSold);
        sb.append(", directRevenue=").append(directRevenue);
        sb.append(", currency=").append(currency);
        sb.append(", flowId=").append(flowId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}