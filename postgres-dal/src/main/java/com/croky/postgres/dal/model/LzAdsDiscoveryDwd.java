package com.croky.postgres.dal.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Croky.Zheng
 * @date 2023-02-20 11:23:50
*/
public class LzAdsDiscoveryDwd implements Serializable {
    /**
     *
     * The database column name:lz_ads_discovery_dwd.date_of_data;length:13;type:DATE;default:"null";comment:"null"
     */
    private Date dateOfData;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.store_id;length:2147483647;type:VARCHAR;default:"null";comment:"null"
     */
    private String storeId;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.date;length:2147483647;type:VARCHAR;default:"null";comment:"null"
     */
    private String date;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.campaign_name;length:2147483647;type:VARCHAR;default:"null";comment:"null"
     */
    private String campaignName;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.campaign_id;length:2147483647;type:VARCHAR;default:"null";comment:"null"
     */
    private String campaignId;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.campaign_objective;length:2147483647;type:VARCHAR;default:"null";comment:"null"
     */
    private String campaignObjective;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.campaign_type;length:2147483647;type:VARCHAR;default:"null";comment:"null"
     */
    private String campaignType;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.placement;length:2147483647;type:VARCHAR;default:"null";comment:"null"
     */
    private String placement;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.budget;length:10;type:INTEGER;default:"null";comment:"null"
     */
    private Integer budget;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.spend;length:0;type:NUMERIC;default:"null";comment:"null"
     */
    private Short spend;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.impression;length:10;type:INTEGER;default:"null";comment:"null"
     */
    private Integer impression;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.clicks;length:10;type:INTEGER;default:"null";comment:"null"
     */
    private Integer clicks;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.ctr;length:0;type:NUMERIC;default:"null";comment:"null"
     */
    private Short ctr;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.cpc;length:0;type:NUMERIC;default:"null";comment:"null"
     */
    private Short cpc;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.store_add_to_cart_units;length:10;type:INTEGER;default:"null";comment:"null"
     */
    private Integer storeAddToCartUnits;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.store_orders;length:10;type:INTEGER;default:"null";comment:"null"
     */
    private Integer storeOrders;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.store_cvr;length:0;type:NUMERIC;default:"null";comment:"null"
     */
    private Short storeCvr;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.store_units_sold;length:10;type:INTEGER;default:"null";comment:"null"
     */
    private Integer storeUnitsSold;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.store_revenue;length:0;type:NUMERIC;default:"null";comment:"null"
     */
    private Short storeRevenue;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.store_roi;length:0;type:NUMERIC;default:"null";comment:"null"
     */
    private Short storeRoi;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.direct_add_to_cart_units;length:10;type:INTEGER;default:"null";comment:"null"
     */
    private Integer directAddToCartUnits;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.direct_orders;length:10;type:INTEGER;default:"null";comment:"null"
     */
    private Integer directOrders;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.direct_cvr;length:0;type:NUMERIC;default:"null";comment:"null"
     */
    private Short directCvr;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.direct_units_sold;length:10;type:INTEGER;default:"null";comment:"null"
     */
    private Integer directUnitsSold;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.direct_revenue;length:0;type:NUMERIC;default:"null";comment:"null"
     */
    private Short directRevenue;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.currency;length:2147483647;type:VARCHAR;default:"null";comment:"null"
     */
    private String currency;

    /**
     *
     * The database column name:lz_ads_discovery_dwd.flow_id;length:2147483647;type:VARCHAR;default:"null";comment:"null"
     */
    private String flowId;

    /**

     */
    private static final long serialVersionUID = 1L;

    /**

     *
     * @return the value of lz_ads_discovery_dwd.date_of_data
     */
    public Date getDateOfData() {
        return dateOfData;
    }

    /**

     *
     * @param dateOfData the value for lz_ads_discovery_dwd.date_of_data
     */
    public void setDateOfData(Date dateOfData) {
        this.dateOfData = dateOfData;
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.store_id
     */
    public String getStoreId() {
        return storeId;
    }

    /**

     *
     * @param storeId the value for lz_ads_discovery_dwd.store_id
     */
    public void setStoreId(String storeId) {
        this.storeId = storeId == null ? null : storeId.trim();
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.date
     */
    public String getDate() {
        return date;
    }

    /**

     *
     * @param date the value for lz_ads_discovery_dwd.date
     */
    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.campaign_name
     */
    public String getCampaignName() {
        return campaignName;
    }

    /**

     *
     * @param campaignName the value for lz_ads_discovery_dwd.campaign_name
     */
    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName == null ? null : campaignName.trim();
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.campaign_id
     */
    public String getCampaignId() {
        return campaignId;
    }

    /**

     *
     * @param campaignId the value for lz_ads_discovery_dwd.campaign_id
     */
    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId == null ? null : campaignId.trim();
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.campaign_objective
     */
    public String getCampaignObjective() {
        return campaignObjective;
    }

    /**

     *
     * @param campaignObjective the value for lz_ads_discovery_dwd.campaign_objective
     */
    public void setCampaignObjective(String campaignObjective) {
        this.campaignObjective = campaignObjective == null ? null : campaignObjective.trim();
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.campaign_type
     */
    public String getCampaignType() {
        return campaignType;
    }

    /**

     *
     * @param campaignType the value for lz_ads_discovery_dwd.campaign_type
     */
    public void setCampaignType(String campaignType) {
        this.campaignType = campaignType == null ? null : campaignType.trim();
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.placement
     */
    public String getPlacement() {
        return placement;
    }

    /**

     *
     * @param placement the value for lz_ads_discovery_dwd.placement
     */
    public void setPlacement(String placement) {
        this.placement = placement == null ? null : placement.trim();
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.budget
     */
    public Integer getBudget() {
        return budget;
    }

    /**

     *
     * @param budget the value for lz_ads_discovery_dwd.budget
     */
    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.spend
     */
    public Short getSpend() {
        return spend;
    }

    /**

     *
     * @param spend the value for lz_ads_discovery_dwd.spend
     */
    public void setSpend(Short spend) {
        this.spend = spend;
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.impression
     */
    public Integer getImpression() {
        return impression;
    }

    /**

     *
     * @param impression the value for lz_ads_discovery_dwd.impression
     */
    public void setImpression(Integer impression) {
        this.impression = impression;
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.clicks
     */
    public Integer getClicks() {
        return clicks;
    }

    /**

     *
     * @param clicks the value for lz_ads_discovery_dwd.clicks
     */
    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.ctr
     */
    public Short getCtr() {
        return ctr;
    }

    /**

     *
     * @param ctr the value for lz_ads_discovery_dwd.ctr
     */
    public void setCtr(Short ctr) {
        this.ctr = ctr;
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.cpc
     */
    public Short getCpc() {
        return cpc;
    }

    /**

     *
     * @param cpc the value for lz_ads_discovery_dwd.cpc
     */
    public void setCpc(Short cpc) {
        this.cpc = cpc;
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.store_add_to_cart_units
     */
    public Integer getStoreAddToCartUnits() {
        return storeAddToCartUnits;
    }

    /**

     *
     * @param storeAddToCartUnits the value for lz_ads_discovery_dwd.store_add_to_cart_units
     */
    public void setStoreAddToCartUnits(Integer storeAddToCartUnits) {
        this.storeAddToCartUnits = storeAddToCartUnits;
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.store_orders
     */
    public Integer getStoreOrders() {
        return storeOrders;
    }

    /**

     *
     * @param storeOrders the value for lz_ads_discovery_dwd.store_orders
     */
    public void setStoreOrders(Integer storeOrders) {
        this.storeOrders = storeOrders;
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.store_cvr
     */
    public Short getStoreCvr() {
        return storeCvr;
    }

    /**

     *
     * @param storeCvr the value for lz_ads_discovery_dwd.store_cvr
     */
    public void setStoreCvr(Short storeCvr) {
        this.storeCvr = storeCvr;
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.store_units_sold
     */
    public Integer getStoreUnitsSold() {
        return storeUnitsSold;
    }

    /**

     *
     * @param storeUnitsSold the value for lz_ads_discovery_dwd.store_units_sold
     */
    public void setStoreUnitsSold(Integer storeUnitsSold) {
        this.storeUnitsSold = storeUnitsSold;
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.store_revenue
     */
    public Short getStoreRevenue() {
        return storeRevenue;
    }

    /**

     *
     * @param storeRevenue the value for lz_ads_discovery_dwd.store_revenue
     */
    public void setStoreRevenue(Short storeRevenue) {
        this.storeRevenue = storeRevenue;
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.store_roi
     */
    public Short getStoreRoi() {
        return storeRoi;
    }

    /**

     *
     * @param storeRoi the value for lz_ads_discovery_dwd.store_roi
     */
    public void setStoreRoi(Short storeRoi) {
        this.storeRoi = storeRoi;
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.direct_add_to_cart_units
     */
    public Integer getDirectAddToCartUnits() {
        return directAddToCartUnits;
    }

    /**

     *
     * @param directAddToCartUnits the value for lz_ads_discovery_dwd.direct_add_to_cart_units
     */
    public void setDirectAddToCartUnits(Integer directAddToCartUnits) {
        this.directAddToCartUnits = directAddToCartUnits;
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.direct_orders
     */
    public Integer getDirectOrders() {
        return directOrders;
    }

    /**

     *
     * @param directOrders the value for lz_ads_discovery_dwd.direct_orders
     */
    public void setDirectOrders(Integer directOrders) {
        this.directOrders = directOrders;
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.direct_cvr
     */
    public Short getDirectCvr() {
        return directCvr;
    }

    /**

     *
     * @param directCvr the value for lz_ads_discovery_dwd.direct_cvr
     */
    public void setDirectCvr(Short directCvr) {
        this.directCvr = directCvr;
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.direct_units_sold
     */
    public Integer getDirectUnitsSold() {
        return directUnitsSold;
    }

    /**

     *
     * @param directUnitsSold the value for lz_ads_discovery_dwd.direct_units_sold
     */
    public void setDirectUnitsSold(Integer directUnitsSold) {
        this.directUnitsSold = directUnitsSold;
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.direct_revenue
     */
    public Short getDirectRevenue() {
        return directRevenue;
    }

    /**

     *
     * @param directRevenue the value for lz_ads_discovery_dwd.direct_revenue
     */
    public void setDirectRevenue(Short directRevenue) {
        this.directRevenue = directRevenue;
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.currency
     */
    public String getCurrency() {
        return currency;
    }

    /**

     *
     * @param currency the value for lz_ads_discovery_dwd.currency
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**

     *
     * @return the value of lz_ads_discovery_dwd.flow_id
     */
    public String getFlowId() {
        return flowId;
    }

    /**

     *
     * @param flowId the value for lz_ads_discovery_dwd.flow_id
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
        LzAdsDiscoveryDwd other = (LzAdsDiscoveryDwd) that;
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