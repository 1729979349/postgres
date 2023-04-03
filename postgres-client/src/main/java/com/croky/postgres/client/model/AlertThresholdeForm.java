package com.croky.postgres.client.model;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.NumberFormat;

@Schema(title = "AlertThresholdeForm-提交null")
public class AlertThresholdeForm {
    @Schema(title = "null", name = "id", nullable = false, example = "nextval('alert_thresholde_id_seq'::regclass)", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer id;

    @Schema(title = "null", name = "ROI_A", nullable = true, example = "NULL::character varying", maxLength = 16)
    private String roiA;

    @Schema(title = "null", name = "ROI_C", nullable = true, example = "NULL::character varying", maxLength = 16)
    private String roiC;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoiA() {
        return roiA;
    }

    public void setRoiA(String roiA) {
        this.roiA = roiA == null ? null : roiA.trim();
    }

    public String getRoiC() {
        return roiC;
    }

    public void setRoiC(String roiC) {
        this.roiC = roiC == null ? null : roiC.trim();
    }
}