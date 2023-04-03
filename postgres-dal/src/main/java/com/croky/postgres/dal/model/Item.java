package com.croky.postgres.dal.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Croky.Zheng
 * @date 2022-04-29 03:04:29
*/
public class Item implements Serializable {
    /**
     *
     * The database column name:item.id;length:20;type:BIGINT;default:"null";comment:""
     */
    private Long id;

    /**
     *
     * The database column name:item.shop_id;length:10;type:INTEGER;default:"0";comment:""
     */
    private Integer shopId;

    /**
     *
     * The database column name:item.barcode;length:20;type:VARCHAR;default:"";comment:"EAN13编码"
     */
    private String barcode;

    /**
     *
     * The database column name:item.name;length:100;type:VARCHAR;default:"";comment:"商品名称"
     */
    private String name;

    /**
     *
     * The database column name:item.pinyin;length:100;type:VARCHAR;default:"";comment:"商品名称拼音"
     */
    private String pinyin;

    /**
     *
     * The database column name:item.spec;length:50;type:VARCHAR;default:"";comment:"规格"
     */
    private String spec;

    /**
     *
     * The database column name:item.unit;length:20;type:VARCHAR;default:"";comment:"单位"
     */
    private String unit;

    /**
     *
     * The database column name:item.location;length:200;type:VARCHAR;default:"";comment:"产地"
     */
    private String location;

    /**
     *
     * The database column name:item.price;length:10;type:INTEGER;default:"0";comment:"销售价"
     */
    private Integer price;

    /**
     *
     * The database column name:item.secr_stock;length:11;type:DOUBLE;default:"0.00";comment:"安全库存"
     */
    private Double secrStock;

    /**
     *
     * The database column name:item.stock;length:11;type:DOUBLE;default:"0.00";comment:"安全库存"
     */
    private Double stock;

    /**
     *
     * The database column name:item.vip_price;length:10;type:INTEGER;default:"0";comment:"会员价"
     */
    private Integer vipPrice;

    /**
     *
     * The database column name:item.cost_price;length:10;type:INTEGER;default:"0";comment:"成本价"
     */
    private Integer costPrice;

    /**
     *
     * The database column name:item.keyword;length:500;type:VARCHAR;default:"";comment:"搜索关键字"
     */
    private String keyword;

    /**
     *
     * The database column name:item.gmt_create;length:26;type:TIMESTAMP;default:"null";comment:""
     */
    private Date createDateTime;

    /**
     *
     * The database column name:item.gmt_modify;length:26;type:TIMESTAMP;default:"null";comment:""
     */
    private Date lastModifyDateTime;

    /**
     *
     * The database column name:item.status;length:3;type:TINYINT;default:"0";comment:"状态: 1=在售,-1=删除,0=下架"
     */
    private Byte status;

    /**

     */
    private static final long serialVersionUID = 1L;

    /**

     *
     * @return the value of item.id
     */
    public Long getId() {
        return id;
    }

    /**

     *
     * @param id the value for item.id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**

     *
     * @return the value of item.shop_id
     */
    public Integer getShopId() {
        return shopId;
    }

    /**

     *
     * @param shopId the value for item.shop_id
     */
    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    /**

     *
     * @return the value of item.barcode
     */
    public String getBarcode() {
        return barcode;
    }

    /**

     *
     * @param barcode the value for item.barcode
     */
    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    /**

     *
     * @return the value of item.name
     */
    public String getName() {
        return name;
    }

    /**

     *
     * @param name the value for item.name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**

     *
     * @return the value of item.pinyin
     */
    public String getPinyin() {
        return pinyin;
    }

    /**

     *
     * @param pinyin the value for item.pinyin
     */
    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    /**

     *
     * @return the value of item.spec
     */
    public String getSpec() {
        return spec;
    }

    /**

     *
     * @param spec the value for item.spec
     */
    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    /**

     *
     * @return the value of item.unit
     */
    public String getUnit() {
        return unit;
    }

    /**

     *
     * @param unit the value for item.unit
     */
    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    /**

     *
     * @return the value of item.location
     */
    public String getLocation() {
        return location;
    }

    /**

     *
     * @param location the value for item.location
     */
    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    /**

     *
     * @return the value of item.price
     */
    public Integer getPrice() {
        return price;
    }

    /**

     *
     * @param price the value for item.price
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**

     *
     * @return the value of item.secr_stock
     */
    public Double getSecrStock() {
        return secrStock;
    }

    /**

     *
     * @param secrStock the value for item.secr_stock
     */
    public void setSecrStock(Double secrStock) {
        this.secrStock = secrStock;
    }

    /**

     *
     * @return the value of item.stock
     */
    public Double getStock() {
        return stock;
    }

    /**

     *
     * @param stock the value for item.stock
     */
    public void setStock(Double stock) {
        this.stock = stock;
    }

    /**

     *
     * @return the value of item.vip_price
     */
    public Integer getVipPrice() {
        return vipPrice;
    }

    /**

     *
     * @param vipPrice the value for item.vip_price
     */
    public void setVipPrice(Integer vipPrice) {
        this.vipPrice = vipPrice;
    }

    /**

     *
     * @return the value of item.cost_price
     */
    public Integer getCostPrice() {
        return costPrice;
    }

    /**

     *
     * @param costPrice the value for item.cost_price
     */
    public void setCostPrice(Integer costPrice) {
        this.costPrice = costPrice;
    }

    /**

     *
     * @return the value of item.keyword
     */
    public String getKeyword() {
        return keyword;
    }

    /**

     *
     * @param keyword the value for item.keyword
     */
    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    /**

     *
     * @return the value of item.gmt_create
     */
    public Date getCreateDateTime() {
        return createDateTime;
    }

    /**

     *
     * @param createDateTime the value for item.gmt_create
     */
    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    /**

     *
     * @return the value of item.gmt_modify
     */
    public Date getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**

     *
     * @param lastModifyDateTime the value for item.gmt_modify
     */
    public void setLastModifyDateTime(Date lastModifyDateTime) {
        this.lastModifyDateTime = lastModifyDateTime;
    }

    /**

     *
     * @return the value of item.status
     */
    public Byte getStatus() {
        return status;
    }

    /**

     *
     * @param status the value for item.status
     */
    public void setStatus(Byte status) {
        this.status = status;
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
        Item other = (Item) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getShopId() == null ? other.getShopId() == null : this.getShopId().equals(other.getShopId()))
            && (this.getBarcode() == null ? other.getBarcode() == null : this.getBarcode().equals(other.getBarcode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPinyin() == null ? other.getPinyin() == null : this.getPinyin().equals(other.getPinyin()))
            && (this.getSpec() == null ? other.getSpec() == null : this.getSpec().equals(other.getSpec()))
            && (this.getUnit() == null ? other.getUnit() == null : this.getUnit().equals(other.getUnit()))
            && (this.getLocation() == null ? other.getLocation() == null : this.getLocation().equals(other.getLocation()))
            && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()))
            && (this.getSecrStock() == null ? other.getSecrStock() == null : this.getSecrStock().equals(other.getSecrStock()))
            && (this.getStock() == null ? other.getStock() == null : this.getStock().equals(other.getStock()))
            && (this.getVipPrice() == null ? other.getVipPrice() == null : this.getVipPrice().equals(other.getVipPrice()))
            && (this.getCostPrice() == null ? other.getCostPrice() == null : this.getCostPrice().equals(other.getCostPrice()))
            && (this.getKeyword() == null ? other.getKeyword() == null : this.getKeyword().equals(other.getKeyword()))
            && (this.getCreateDateTime() == null ? other.getCreateDateTime() == null : this.getCreateDateTime().equals(other.getCreateDateTime()))
            && (this.getLastModifyDateTime() == null ? other.getLastModifyDateTime() == null : this.getLastModifyDateTime().equals(other.getLastModifyDateTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    /**

     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getShopId() == null) ? 0 : getShopId().hashCode());
        result = prime * result + ((getBarcode() == null) ? 0 : getBarcode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPinyin() == null) ? 0 : getPinyin().hashCode());
        result = prime * result + ((getSpec() == null) ? 0 : getSpec().hashCode());
        result = prime * result + ((getUnit() == null) ? 0 : getUnit().hashCode());
        result = prime * result + ((getLocation() == null) ? 0 : getLocation().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        result = prime * result + ((getSecrStock() == null) ? 0 : getSecrStock().hashCode());
        result = prime * result + ((getStock() == null) ? 0 : getStock().hashCode());
        result = prime * result + ((getVipPrice() == null) ? 0 : getVipPrice().hashCode());
        result = prime * result + ((getCostPrice() == null) ? 0 : getCostPrice().hashCode());
        result = prime * result + ((getKeyword() == null) ? 0 : getKeyword().hashCode());
        result = prime * result + ((getCreateDateTime() == null) ? 0 : getCreateDateTime().hashCode());
        result = prime * result + ((getLastModifyDateTime() == null) ? 0 : getLastModifyDateTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
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
        sb.append(", shopId=").append(shopId);
        sb.append(", barcode=").append(barcode);
        sb.append(", name=").append(name);
        sb.append(", pinyin=").append(pinyin);
        sb.append(", spec=").append(spec);
        sb.append(", unit=").append(unit);
        sb.append(", location=").append(location);
        sb.append(", price=").append(price);
        sb.append(", secrStock=").append(secrStock);
        sb.append(", stock=").append(stock);
        sb.append(", vipPrice=").append(vipPrice);
        sb.append(", costPrice=").append(costPrice);
        sb.append(", keyword=").append(keyword);
        sb.append(", createDateTime=").append(createDateTime);
        sb.append(", lastModifyDateTime=").append(lastModifyDateTime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}