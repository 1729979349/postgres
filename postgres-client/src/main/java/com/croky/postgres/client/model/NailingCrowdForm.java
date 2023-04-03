package com.croky.postgres.client.model;

import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.format.annotation.NumberFormat;

@Schema(title = "NailingCrowdForm-提交null")
public class NailingCrowdForm {
    @Schema(title = "null", name = "id", nullable = false, example = "nextval('nailing_crowd_id_seq'::regclass)", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer id;

    @Schema(title = "null", name = "crowd_name", nullable = true, example = "NULL::character varying", maxLength = 16)
    private String crowdName;

    @Schema(title = "null", name = "crowd_token", nullable = true, example = "NULL::character varying", maxLength = 8)
    private String crowdToken;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCrowdName() {
        return crowdName;
    }

    public void setCrowdName(String crowdName) {
        this.crowdName = crowdName == null ? null : crowdName.trim();
    }

    public String getCrowdToken() {
        return crowdToken;
    }

    public void setCrowdToken(String crowdToken) {
        this.crowdToken = crowdToken == null ? null : crowdToken.trim();
    }
}