package com.croky.postgres.client.model;

import com.croky.postgres.client.utils.ExpandJackSonSupport;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.NumberFormat;

@Schema(title = "ItemForm-提交")
public class ItemForm {
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

    @Schema(title = "状态: 1=在售,-1=删除,0=下架", name = "status", nullable = true, example = "0", maxLength = 3)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    @JsonDeserialize(using = ExpandJackSonSupport.ByteJsonDeserializer.class)
    private Byte status;

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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }
}