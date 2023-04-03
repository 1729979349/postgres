package com.croky.postgres.dal.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Croky.Zheng
 * @date 2023-02-13 17:21:18
*/
public class AlertThreshold implements Serializable {
    /**
     *
     * The database column name:alert_threshold.id;length:10;type:INTEGER;default:"nextval('alert_thresholde_id_seq'::regclass)";comment:"null"
     */
    private Integer id;

    /**
     *
     * The database column name:alert_threshold.roi_a;length:16;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String roiA;

    /**
     *
     * The database column name:alert_threshold.roi_c;length:16;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String roiC;

    /**
     *
     * The database column name:alert_threshold.gmt_modify;length:29;type:TIMESTAMP;default:"null";comment:"null"
     */
    private Date lastModifyDateTime;

    /**
     *
     * The database column name:alert_threshold.gmt_create;length:29;type:TIMESTAMP;default:"null";comment:"null"
     */
    private Date createDateTime;

    /**

     */
    private static final long serialVersionUID = 1L;

    /**

     *
     * @return the value of alert_threshold.id
     */
    public Integer getId() {
        return id;
    }

    /**

     *
     * @param id the value for alert_threshold.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**

     *
     * @return the value of alert_threshold.roi_a
     */
    public String getRoiA() {
        return roiA;
    }

    /**

     *
     * @param roiA the value for alert_threshold.roi_a
     */
    public void setRoiA(String roiA) {
        this.roiA = roiA == null ? null : roiA.trim();
    }

    /**

     *
     * @return the value of alert_threshold.roi_c
     */
    public String getRoiC() {
        return roiC;
    }

    /**

     *
     * @param roiC the value for alert_threshold.roi_c
     */
    public void setRoiC(String roiC) {
        this.roiC = roiC == null ? null : roiC.trim();
    }

    /**

     *
     * @return the value of alert_threshold.gmt_modify
     */
    public Date getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**

     *
     * @param lastModifyDateTime the value for alert_threshold.gmt_modify
     */
    public void setLastModifyDateTime(Date lastModifyDateTime) {
        this.lastModifyDateTime = lastModifyDateTime;
    }

    /**

     *
     * @return the value of alert_threshold.gmt_create
     */
    public Date getCreateDateTime() {
        return createDateTime;
    }

    /**

     *
     * @param createDateTime the value for alert_threshold.gmt_create
     */
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
        AlertThreshold other = (AlertThreshold) that;
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