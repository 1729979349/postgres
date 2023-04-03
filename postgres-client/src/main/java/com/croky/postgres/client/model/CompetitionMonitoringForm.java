package com.croky.postgres.client.model;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.NumberFormat;

@Schema(title = "CompetitionMonitoringForm-提交null")
public class CompetitionMonitoringForm {
    @Schema(title = "null", name = "id", nullable = false, example = "nextval('competition_monitoring_id_seq'::regclass)", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer id;

    @Schema(title = "null", name = "brand", nullable = true, example = "NULL::character varying", maxLength = 64)
    private String brand;

    @Schema(title = "null", name = "lazada", nullable = true, example = "NULL::character varying", maxLength = 512)
    private String lazada;

    @Schema(title = "null", name = "shopee", nullable = true, example = "NULL::character varying", maxLength = 512)
    private String shopee;

    @Schema(title = "null", name = "shopee_shop_id", nullable = true, example = "NULL::character varying", maxLength = 32)
    private String shopeeShopId;

    @Schema(title = "null", name = "qoo10", nullable = true, example = "NULL::character varying", maxLength = 512)
    private String qoo10;

    @Schema(title = "null", name = "tmall", nullable = true, example = "NULL::character varying", maxLength = 512)
    private String tmall;

    @Schema(title = "null", name = "jd", nullable = true, example = "NULL::character varying", maxLength = 512)
    private String jd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getLazada() {
        return lazada;
    }

    public void setLazada(String lazada) {
        this.lazada = lazada == null ? null : lazada.trim();
    }

    public String getShopee() {
        return shopee;
    }

    public void setShopee(String shopee) {
        this.shopee = shopee == null ? null : shopee.trim();
    }

    public String getShopeeShopId() {
        return shopeeShopId;
    }

    public void setShopeeShopId(String shopeeShopId) {
        this.shopeeShopId = shopeeShopId == null ? null : shopeeShopId.trim();
    }

    public String getQoo10() {
        return qoo10;
    }

    public void setQoo10(String qoo10) {
        this.qoo10 = qoo10 == null ? null : qoo10.trim();
    }

    public String getTmall() {
        return tmall;
    }

    public void setTmall(String tmall) {
        this.tmall = tmall == null ? null : tmall.trim();
    }

    public String getJd() {
        return jd;
    }

    public void setJd(String jd) {
        this.jd = jd == null ? null : jd.trim();
    }
}