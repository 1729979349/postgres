package com.croky.postgres.client.model;

import com.croky.postgres.client.utils.ExpandJackSonSupport;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.NumberFormat;

/**
 * @author Croky.Zheng
 * @date 2022-04-29 03:04:29
*/
@Schema(title = "ItemVO-返回")
public class ItemVO implements Serializable {
    @Schema(title = "", name = "id", nullable = false, example = "null", maxLength = 20)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Long id;

    @Schema(title = "", name = "shop_id", nullable = false, example = "0", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer shopId;

    @Schema(title = "EAN13编码", name = "barcode", nullable = false, example = "", maxLength = 20)
    private String barcode;

    @Schema(title = "商品名称", name = "name", nullable = false, example = "", maxLength = 100)
    private String name;

    @Schema(title = "商品名称拼音", name = "pinyin", nullable = true, example = "", maxLength = 100)
    private String pinyin;

    @Schema(title = "规格", name = "spec", nullable = true, example = "", maxLength = 50)
    private String spec;

    @Schema(title = "单位", name = "unit", nullable = true, example = "", maxLength = 20)
    private String unit;

    @Schema(title = "产地", name = "location", nullable = true, example = "", maxLength = 200)
    private String location;

    @Schema(title = "销售价", name = "price", nullable = true, example = "0", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer price;

    @Schema(title = "安全库存", name = "secr_stock", nullable = true, example = "0.00", maxLength = 11)
    private Double secrStock;

    @Schema(title = "安全库存", name = "stock", nullable = true, example = "0.00", maxLength = 11)
    private Double stock;

    @Schema(title = "会员价", name = "vip_price", nullable = true, example = "0", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer vipPrice;

    @Schema(title = "成本价", name = "cost_price", nullable = true, example = "0", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer costPrice;

    @Schema(title = "搜索关键字", name = "keyword", nullable = true, example = "", maxLength = 500)
    private String keyword;

    @Schema(title = "", name = "gmt_create", nullable = true, example = "null", maxLength = 26)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDateTime;

    @Schema(title = "", name = "gmt_modify", nullable = true, example = "null", maxLength = 26)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastModifyDateTime;

    @Schema(title = "状态: 1=在售,-1=删除,0=下架", name = "status", nullable = true, example = "0", maxLength = 3)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    @JsonDeserialize(using = ExpandJackSonSupport.ByteJsonDeserializer.class)
    private Byte status;

    /**

     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode == null ? null : barcode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec == null ? null : spec.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Double getSecrStock() {
        return secrStock;
    }

    public void setSecrStock(Double secrStock) {
        this.secrStock = secrStock;
    }

    public Double getStock() {
        return stock;
    }

    public void setStock(Double stock) {
        this.stock = stock;
    }

    public Integer getVipPrice() {
        return vipPrice;
    }

    public void setVipPrice(Integer vipPrice) {
        this.vipPrice = vipPrice;
    }

    public Integer getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(Integer costPrice) {
        this.costPrice = costPrice;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
    }

    public Date getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    public void setLastModifyDateTime(Date lastModifyDateTime) {
        this.lastModifyDateTime = lastModifyDateTime;
    }

    public Byte getStatus() {
        return status;
    }

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
        ItemVO other = (ItemVO) that;
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