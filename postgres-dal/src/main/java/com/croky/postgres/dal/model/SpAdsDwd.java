package com.croky.postgres.dal.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Croky.Zheng
 * @date 2023-02-20 16:00:45
*/
public class SpAdsDwd implements Serializable {
    /**
     *
     * The database column name:sp_ads_dwd.date_of_data;length:13;type:DATE;default:"null";comment:"null"
     */
    private Date dateOfData;

    /**
     *
     * The database column name:sp_ads_dwd.store_id;length:20;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String storeId;

    /**
     *
     * The database column name:sp_ads_dwd.product_name_ad_name;length:500;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String productNameAdName;

    /**
     *
     * The database column name:sp_ads_dwd.status;length:500;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String status;

    /**
     *
     * The database column name:sp_ads_dwd.product_id;length:500;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String productId;

    /**
     *
     * The database column name:sp_ads_dwd.ads_type;length:500;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String adsType;

    /**
     *
     * The database column name:sp_ads_dwd.placement_keyword;length:500;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String placementKeyword;

    /**
     *
     * The database column name:sp_ads_dwd.start_date;length:13;type:DATE;default:"null";comment:"null"
     */
    private Date startDate;

    /**
     *
     * The database column name:sp_ads_dwd.end_date;length:50;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String endDate;

    /**
     *
     * The database column name:sp_ads_dwd.impression;length:10;type:INTEGER;default:"null";comment:"null"
     */
    private Integer impression;

    /**
     *
     * The database column name:sp_ads_dwd.clicks;length:10;type:INTEGER;default:"null";comment:"null"
     */
    private Integer clicks;

    /**
     *
     * The database column name:sp_ads_dwd.ctr;length:0;type:NUMERIC;default:"null";comment:"null"
     */
    private Short ctr;

    /**
     *
     * The database column name:sp_ads_dwd.conversions;length:10;type:INTEGER;default:"null";comment:"null"
     */
    private Integer conversions;

    /**
     *
     * The database column name:sp_ads_dwd.direct_conversions;length:10;type:INTEGER;default:"null";comment:"null"
     */
    private Integer directConversions;

    /**
     *
     * The database column name:sp_ads_dwd.conversion_rate;length:0;type:NUMERIC;default:"null";comment:"null"
     */
    private Short conversionRate;

    /**
     *
     * The database column name:sp_ads_dwd.direct_conversion_rate;length:0;type:NUMERIC;default:"null";comment:"null"
     */
    private Short directConversionRate;

    /**
     *
     * The database column name:sp_ads_dwd.cost_per_conversion;length:0;type:NUMERIC;default:"null";comment:"null"
     */
    private Short costPerConversion;

    /**
     *
     * The database column name:sp_ads_dwd.cost_per_direct_conversion;length:0;type:NUMERIC;default:"null";comment:"null"
     */
    private Short costPerDirectConversion;

    /**
     *
     * The database column name:sp_ads_dwd.items_sold;length:10;type:INTEGER;default:"null";comment:"null"
     */
    private Integer itemsSold;

    /**
     *
     * The database column name:sp_ads_dwd.direct_items_sold;length:10;type:INTEGER;default:"null";comment:"null"
     */
    private Integer directItemsSold;

    /**
     *
     * The database column name:sp_ads_dwd.gmv;length:0;type:NUMERIC;default:"null";comment:"null"
     */
    private Short gmv;

    /**
     *
     * The database column name:sp_ads_dwd.direct_gmv;length:0;type:NUMERIC;default:"null";comment:"null"
     */
    private Short directGmv;

    /**
     *
     * The database column name:sp_ads_dwd.expense;length:0;type:NUMERIC;default:"null";comment:"null"
     */
    private Short expense;

    /**
     *
     * The database column name:sp_ads_dwd.roi;length:0;type:NUMERIC;default:"null";comment:"null"
     */
    private Short roi;

    /**
     *
     * The database column name:sp_ads_dwd.direct_roi;length:0;type:NUMERIC;default:"null";comment:"null"
     */
    private Short directRoi;

    /**
     *
     * The database column name:sp_ads_dwd.cir;length:0;type:NUMERIC;default:"null";comment:"null"
     */
    private Short cir;

    /**
     *
     * The database column name:sp_ads_dwd.direct_cir;length:0;type:NUMERIC;default:"null";comment:"null"
     */
    private Short directCir;

    /**
     *
     * The database column name:sp_ads_dwd.product_impressions;length:10;type:INTEGER;default:"null";comment:"null"
     */
    private Integer productImpressions;

    /**
     *
     * The database column name:sp_ads_dwd.product_clicks;length:10;type:INTEGER;default:"null";comment:"null"
     */
    private Integer productClicks;

    /**
     *
     * The database column name:sp_ads_dwd.product_ctr;length:0;type:NUMERIC;default:"null";comment:"null"
     */
    private Short productCtr;

    /**
     *
     * The database column name:sp_ads_dwd.flow_id;length:50;type:VARCHAR;default:"null";comment:"null"
     */
    private String flowId;

    /**

     */
    private static final long serialVersionUID = 1L;

    /**

     *
     * @return the value of sp_ads_dwd.date_of_data
     */
    public Date getDateOfData() {
        return dateOfData;
    }

    /**

     *
     * @param dateOfData the value for sp_ads_dwd.date_of_data
     */
    public void setDateOfData(Date dateOfData) {
        this.dateOfData = dateOfData;
    }

    /**

     *
     * @return the value of sp_ads_dwd.store_id
     */
    public String getStoreId() {
        return storeId;
    }

    /**

     *
     * @param storeId the value for sp_ads_dwd.store_id
     */
    public void setStoreId(String storeId) {
        this.storeId = storeId == null ? null : storeId.trim();
    }

    /**

     *
     * @return the value of sp_ads_dwd.product_name_ad_name
     */
    public String getProductNameAdName() {
        return productNameAdName;
    }

    /**

     *
     * @param productNameAdName the value for sp_ads_dwd.product_name_ad_name
     */
    public void setProductNameAdName(String productNameAdName) {
        this.productNameAdName = productNameAdName == null ? null : productNameAdName.trim();
    }

    /**

     *
     * @return the value of sp_ads_dwd.status
     */
    public String getStatus() {
        return status;
    }

    /**

     *
     * @param status the value for sp_ads_dwd.status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**

     *
     * @return the value of sp_ads_dwd.product_id
     */
    public String getProductId() {
        return productId;
    }

    /**

     *
     * @param productId the value for sp_ads_dwd.product_id
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**

     *
     * @return the value of sp_ads_dwd.ads_type
     */
    public String getAdsType() {
        return adsType;
    }

    /**

     *
     * @param adsType the value for sp_ads_dwd.ads_type
     */
    public void setAdsType(String adsType) {
        this.adsType = adsType == null ? null : adsType.trim();
    }

    /**

     *
     * @return the value of sp_ads_dwd.placement_keyword
     */
    public String getPlacementKeyword() {
        return placementKeyword;
    }

    /**

     *
     * @param placementKeyword the value for sp_ads_dwd.placement_keyword
     */
    public void setPlacementKeyword(String placementKeyword) {
        this.placementKeyword = placementKeyword == null ? null : placementKeyword.trim();
    }

    /**

     *
     * @return the value of sp_ads_dwd.start_date
     */
    public Date getStartDate() {
        return startDate;
    }

    /**

     *
     * @param startDate the value for sp_ads_dwd.start_date
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**

     *
     * @return the value of sp_ads_dwd.end_date
     */
    public String getEndDate() {
        return endDate;
    }

    /**

     *
     * @param endDate the value for sp_ads_dwd.end_date
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate == null ? null : endDate.trim();
    }

    /**

     *
     * @return the value of sp_ads_dwd.impression
     */
    public Integer getImpression() {
        return impression;
    }

    /**

     *
     * @param impression the value for sp_ads_dwd.impression
     */
    public void setImpression(Integer impression) {
        this.impression = impression;
    }

    /**

     *
     * @return the value of sp_ads_dwd.clicks
     */
    public Integer getClicks() {
        return clicks;
    }

    /**

     *
     * @param clicks the value for sp_ads_dwd.clicks
     */
    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    /**

     *
     * @return the value of sp_ads_dwd.ctr
     */
    public Short getCtr() {
        return ctr;
    }

    /**

     *
     * @param ctr the value for sp_ads_dwd.ctr
     */
    public void setCtr(Short ctr) {
        this.ctr = ctr;
    }

    /**

     *
     * @return the value of sp_ads_dwd.conversions
     */
    public Integer getConversions() {
        return conversions;
    }

    /**

     *
     * @param conversions the value for sp_ads_dwd.conversions
     */
    public void setConversions(Integer conversions) {
        this.conversions = conversions;
    }

    /**

     *
     * @return the value of sp_ads_dwd.direct_conversions
     */
    public Integer getDirectConversions() {
        return directConversions;
    }

    /**

     *
     * @param directConversions the value for sp_ads_dwd.direct_conversions
     */
    public void setDirectConversions(Integer directConversions) {
        this.directConversions = directConversions;
    }

    /**

     *
     * @return the value of sp_ads_dwd.conversion_rate
     */
    public Short getConversionRate() {
        return conversionRate;
    }

    /**

     *
     * @param conversionRate the value for sp_ads_dwd.conversion_rate
     */
    public void setConversionRate(Short conversionRate) {
        this.conversionRate = conversionRate;
    }

    /**

     *
     * @return the value of sp_ads_dwd.direct_conversion_rate
     */
    public Short getDirectConversionRate() {
        return directConversionRate;
    }

    /**

     *
     * @param directConversionRate the value for sp_ads_dwd.direct_conversion_rate
     */
    public void setDirectConversionRate(Short directConversionRate) {
        this.directConversionRate = directConversionRate;
    }

    /**

     *
     * @return the value of sp_ads_dwd.cost_per_conversion
     */
    public Short getCostPerConversion() {
        return costPerConversion;
    }

    /**

     *
     * @param costPerConversion the value for sp_ads_dwd.cost_per_conversion
     */
    public void setCostPerConversion(Short costPerConversion) {
        this.costPerConversion = costPerConversion;
    }

    /**

     *
     * @return the value of sp_ads_dwd.cost_per_direct_conversion
     */
    public Short getCostPerDirectConversion() {
        return costPerDirectConversion;
    }

    /**

     *
     * @param costPerDirectConversion the value for sp_ads_dwd.cost_per_direct_conversion
     */
    public void setCostPerDirectConversion(Short costPerDirectConversion) {
        this.costPerDirectConversion = costPerDirectConversion;
    }

    /**

     *
     * @return the value of sp_ads_dwd.items_sold
     */
    public Integer getItemsSold() {
        return itemsSold;
    }

    /**

     *
     * @param itemsSold the value for sp_ads_dwd.items_sold
     */
    public void setItemsSold(Integer itemsSold) {
        this.itemsSold = itemsSold;
    }

    /**

     *
     * @return the value of sp_ads_dwd.direct_items_sold
     */
    public Integer getDirectItemsSold() {
        return directItemsSold;
    }

    /**

     *
     * @param directItemsSold the value for sp_ads_dwd.direct_items_sold
     */
    public void setDirectItemsSold(Integer directItemsSold) {
        this.directItemsSold = directItemsSold;
    }

    /**

     *
     * @return the value of sp_ads_dwd.gmv
     */
    public Short getGmv() {
        return gmv;
    }

    /**

     *
     * @param gmv the value for sp_ads_dwd.gmv
     */
    public void setGmv(Short gmv) {
        this.gmv = gmv;
    }

    /**

     *
     * @return the value of sp_ads_dwd.direct_gmv
     */
    public Short getDirectGmv() {
        return directGmv;
    }

    /**

     *
     * @param directGmv the value for sp_ads_dwd.direct_gmv
     */
    public void setDirectGmv(Short directGmv) {
        this.directGmv = directGmv;
    }

    /**

     *
     * @return the value of sp_ads_dwd.expense
     */
    public Short getExpense() {
        return expense;
    }

    /**

     *
     * @param expense the value for sp_ads_dwd.expense
     */
    public void setExpense(Short expense) {
        this.expense = expense;
    }

    /**

     *
     * @return the value of sp_ads_dwd.roi
     */
    public Short getRoi() {
        return roi;
    }

    /**

     *
     * @param roi the value for sp_ads_dwd.roi
     */
    public void setRoi(Short roi) {
        this.roi = roi;
    }

    /**

     *
     * @return the value of sp_ads_dwd.direct_roi
     */
    public Short getDirectRoi() {
        return directRoi;
    }

    /**

     *
     * @param directRoi the value for sp_ads_dwd.direct_roi
     */
    public void setDirectRoi(Short directRoi) {
        this.directRoi = directRoi;
    }

    /**

     *
     * @return the value of sp_ads_dwd.cir
     */
    public Short getCir() {
        return cir;
    }

    /**

     *
     * @param cir the value for sp_ads_dwd.cir
     */
    public void setCir(Short cir) {
        this.cir = cir;
    }

    /**

     *
     * @return the value of sp_ads_dwd.direct_cir
     */
    public Short getDirectCir() {
        return directCir;
    }

    /**

     *
     * @param directCir the value for sp_ads_dwd.direct_cir
     */
    public void setDirectCir(Short directCir) {
        this.directCir = directCir;
    }

    /**

     *
     * @return the value of sp_ads_dwd.product_impressions
     */
    public Integer getProductImpressions() {
        return productImpressions;
    }

    /**

     *
     * @param productImpressions the value for sp_ads_dwd.product_impressions
     */
    public void setProductImpressions(Integer productImpressions) {
        this.productImpressions = productImpressions;
    }

    /**

     *
     * @return the value of sp_ads_dwd.product_clicks
     */
    public Integer getProductClicks() {
        return productClicks;
    }

    /**

     *
     * @param productClicks the value for sp_ads_dwd.product_clicks
     */
    public void setProductClicks(Integer productClicks) {
        this.productClicks = productClicks;
    }

    /**

     *
     * @return the value of sp_ads_dwd.product_ctr
     */
    public Short getProductCtr() {
        return productCtr;
    }

    /**

     *
     * @param productCtr the value for sp_ads_dwd.product_ctr
     */
    public void setProductCtr(Short productCtr) {
        this.productCtr = productCtr;
    }

    /**

     *
     * @return the value of sp_ads_dwd.flow_id
     */
    public String getFlowId() {
        return flowId;
    }

    /**

     *
     * @param flowId the value for sp_ads_dwd.flow_id
     */
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
        SpAdsDwd other = (SpAdsDwd) that;
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