package com.croky.postgres.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.NumberFormat;

/**
 * @author Croky.Zheng
 * @date 2023-03-07 15:30:24
*/
@Schema(title = "CompetitionMonitoringVO-返回null")
public class CompetitionMonitoringVO implements Serializable {


    @Schema(title = "null", name = "shopee_shop_id", nullable = true, example = "NULL::character varying", maxLength = 32)
    private String shopeeShopId;


    public String getShopeeShopId() {
        return shopeeShopId;
    }

    public void setShopeeShopId(String shopeeShopId) {
        this.shopeeShopId = shopeeShopId == null ? null : shopeeShopId.trim();
    }


}