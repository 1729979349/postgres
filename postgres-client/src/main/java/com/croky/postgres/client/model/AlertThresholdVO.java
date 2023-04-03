package com.croky.postgres.client.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.Serializable;
import java.util.Date;
import org.springframework.format.annotation.NumberFormat;

/**
 * @author Croky.Zheng
 * @date 2023-02-13 17:21:18
*/
@Schema(title = "AlertThresholdVO-返回null")
public class AlertThresholdVO implements Serializable {
    @Schema(title = "null", name = "id", nullable = false, example = "nextval('alert_thresholde_id_seq'::regclass)", maxLength = 10)
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer id;

    @Schema(title = "null", name = "roi_a", nullable = true, example = "NULL::character varying", maxLength = 16)
    private String roiA;

    @Schema(title = "null", name = "roi_c", nullable = true, example = "NULL::character varying", maxLength = 16)
    private String roiC;

    @Schema(title = "null", name = "gmt_modify", nullable = true, example = "null", maxLength = 29)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date lastModifyDateTime;

    @Schema(title = "null", name = "gmt_create", nullable = true, example = "null", maxLength = 29)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createDateTime;

    /**

     */
    private static final long serialVersionUID = 1L;

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

    public Date getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    public void setLastModifyDateTime(Date lastModifyDateTime) {
        this.lastModifyDateTime = lastModifyDateTime;
    }

    public Date getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(Date createDateTime) {
        this.createDateTime = createDateTime;
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
        AlertThresholdVO other = (AlertThresholdVO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRoiA() == null ? other.getRoiA() == null : this.getRoiA().equals(other.getRoiA()))
            && (this.getRoiC() == null ? other.getRoiC() == null : this.getRoiC().equals(other.getRoiC()))
            && (this.getLastModifyDateTime() == null ? other.getLastModifyDateTime() == null : this.getLastModifyDateTime().equals(other.getLastModifyDateTime()))
            && (this.getCreateDateTime() == null ? other.getCreateDateTime() == null : this.getCreateDateTime().equals(other.getCreateDateTime()));
    }

    /**

     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRoiA() == null) ? 0 : getRoiA().hashCode());
        result = prime * result + ((getRoiC() == null) ? 0 : getRoiC().hashCode());
        result = prime * result + ((getLastModifyDateTime() == null) ? 0 : getLastModifyDateTime().hashCode());
        result = prime * result + ((getCreateDateTime() == null) ? 0 : getCreateDateTime().hashCode());
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
        sb.append(", roiA=").append(roiA);
        sb.append(", roiC=").append(roiC);
        sb.append(", lastModifyDateTime=").append(lastModifyDateTime);
        sb.append(", createDateTime=").append(createDateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}