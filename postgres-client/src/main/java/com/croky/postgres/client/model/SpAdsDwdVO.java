package com.croky.postgres.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.NumberFormat;

/**
 * @author Croky.Zheng
 * @date 2023-02-20 16:00:45
*/
@Schema(title = "SpAdsDwdVO-返回null")
public class SpAdsDwdVO implements Serializable {
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
        SpAdsDwdVO other = (SpAdsDwdVO) that;
        return (this.getDateOfData() == null ? other.getDateOfData() == null : this.getDateOfData().equals(other.getDateOfData()))
            && (this.getStoreId() == null ? other.getStoreId() == null : this.getStoreId().equals(other.getStoreId()))
            && (this.getProductNameAdName() == null ? other.getProductNameAdName() == null : this.getProductNameAdName().equals(other.getProductNameAdName()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getAdsType() == null ? other.getAdsType() == null : this.getAdsType().equals(other.getAdsType()))
            && (this.getPlacementKeyword() == null ? other.getPlacementKeyword() == null : this.getPlacementKeyword().equals(other.getPlacementKeyword()))
            && (this.getStartDate() == null ? other.getStartDate() == null : this.getStartDate().equals(other.getStartDate()))
            && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
            && (this.getImpression() == null ? other.getImpression() == null : this.getImpression().equals(other.getImpression()))
            && (this.getClicks() == null ? other.getClicks() == null : this.getClicks().equals(other.getClicks()))
            && (this.getCtr() == null ? other.getCtr() == null : this.getCtr().equals(other.getCtr()))
            && (this.getConversions() == null ? other.getConversions() == null : this.getConversions().equals(other.getConversions()))
            && (this.getDirectConversions() == null ? other.getDirectConversions() == null : this.getDirectConversions().equals(other.getDirectConversions()))
            && (this.getConversionRate() == null ? other.getConversionRate() == null : this.getConversionRate().equals(other.getConversionRate()))
            && (this.getDirectConversionRate() == null ? other.getDirectConversionRate() == null : this.getDirectConversionRate().equals(other.getDirectConversionRate()))
            && (this.getCostPerConversion() == null ? other.getCostPerConversion() == null : this.getCostPerConversion().equals(other.getCostPerConversion()))
            && (this.getCostPerDirectConversion() == null ? other.getCostPerDirectConversion() == null : this.getCostPerDirectConversion().equals(other.getCostPerDirectConversion()))
            && (this.getItemsSold() == null ? other.getItemsSold() == null : this.getItemsSold().equals(other.getItemsSold()))
            && (this.getDirectItemsSold() == null ? other.getDirectItemsSold() == null : this.getDirectItemsSold().equals(other.getDirectItemsSold()))
            && (this.getGmv() == null ? other.getGmv() == null : this.getGmv().equals(other.getGmv()))
            && (this.getDirectGmv() == null ? other.getDirectGmv() == null : this.getDirectGmv().equals(other.getDirectGmv()))
            && (this.getExpense() == null ? other.getExpense() == null : this.getExpense().equals(other.getExpense()))
            && (this.getRoi() == null ? other.getRoi() == null : this.getRoi().equals(other.getRoi()))
            && (this.getDirectRoi() == null ? other.getDirectRoi() == null : this.getDirectRoi().equals(other.getDirectRoi()))
            && (this.getCir() == null ? other.getCir() == null : this.getCir().equals(other.getCir()))
            && (this.getDirectCir() == null ? other.getDirectCir() == null : this.getDirectCir().equals(other.getDirectCir()))
            && (this.getProductImpressions() == null ? other.getProductImpressions() == null : this.getProductImpressions().equals(other.getProductImpressions()))
            && (this.getProductClicks() == null ? other.getProductClicks() == null : this.getProductClicks().equals(other.getProductClicks()))
            && (this.getProductCtr() == null ? other.getProductCtr() == null : this.getProductCtr().equals(other.getProductCtr()))
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
        result = prime * result + ((getProductNameAdName() == null) ? 0 : getProductNameAdName().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getAdsType() == null) ? 0 : getAdsType().hashCode());
        result = prime * result + ((getPlacementKeyword() == null) ? 0 : getPlacementKeyword().hashCode());
        result = prime * result + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getImpression() == null) ? 0 : getImpression().hashCode());
        result = prime * result + ((getClicks() == null) ? 0 : getClicks().hashCode());
        result = prime * result + ((getCtr() == null) ? 0 : getCtr().hashCode());
        result = prime * result + ((getConversions() == null) ? 0 : getConversions().hashCode());
        result = prime * result + ((getDirectConversions() == null) ? 0 : getDirectConversions().hashCode());
        result = prime * result + ((getConversionRate() == null) ? 0 : getConversionRate().hashCode());
        result = prime * result + ((getDirectConversionRate() == null) ? 0 : getDirectConversionRate().hashCode());
        result = prime * result + ((getCostPerConversion() == null) ? 0 : getCostPerConversion().hashCode());
        result = prime * result + ((getCostPerDirectConversion() == null) ? 0 : getCostPerDirectConversion().hashCode());
        result = prime * result + ((getItemsSold() == null) ? 0 : getItemsSold().hashCode());
        result = prime * result + ((getDirectItemsSold() == null) ? 0 : getDirectItemsSold().hashCode());
        result = prime * result + ((getGmv() == null) ? 0 : getGmv().hashCode());
        result = prime * result + ((getDirectGmv() == null) ? 0 : getDirectGmv().hashCode());
        result = prime * result + ((getExpense() == null) ? 0 : getExpense().hashCode());
        result = prime * result + ((getRoi() == null) ? 0 : getRoi().hashCode());
        result = prime * result + ((getDirectRoi() == null) ? 0 : getDirectRoi().hashCode());
        result = prime * result + ((getCir() == null) ? 0 : getCir().hashCode());
        result = prime * result + ((getDirectCir() == null) ? 0 : getDirectCir().hashCode());
        result = prime * result + ((getProductImpressions() == null) ? 0 : getProductImpressions().hashCode());
        result = prime * result + ((getProductClicks() == null) ? 0 : getProductClicks().hashCode());
        result = prime * result + ((getProductCtr() == null) ? 0 : getProductCtr().hashCode());
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
        sb.append(", productNameAdName=").append(productNameAdName);
        sb.append(", status=").append(status);
        sb.append(", productId=").append(productId);
        sb.append(", adsType=").append(adsType);
        sb.append(", placementKeyword=").append(placementKeyword);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", impression=").append(impression);
        sb.append(", clicks=").append(clicks);
        sb.append(", ctr=").append(ctr);
        sb.append(", conversions=").append(conversions);
        sb.append(", directConversions=").append(directConversions);
        sb.append(", conversionRate=").append(conversionRate);
        sb.append(", directConversionRate=").append(directConversionRate);
        sb.append(", costPerConversion=").append(costPerConversion);
        sb.append(", costPerDirectConversion=").append(costPerDirectConversion);
        sb.append(", itemsSold=").append(itemsSold);
        sb.append(", directItemsSold=").append(directItemsSold);
        sb.append(", gmv=").append(gmv);
        sb.append(", directGmv=").append(directGmv);
        sb.append(", expense=").append(expense);
        sb.append(", roi=").append(roi);
        sb.append(", directRoi=").append(directRoi);
        sb.append(", cir=").append(cir);
        sb.append(", directCir=").append(directCir);
        sb.append(", productImpressions=").append(productImpressions);
        sb.append(", productClicks=").append(productClicks);
        sb.append(", productCtr=").append(productCtr);
        sb.append(", flowId=").append(flowId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}