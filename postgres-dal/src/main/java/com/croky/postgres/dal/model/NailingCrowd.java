package com.croky.postgres.dal.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Croky.Zheng
 * @date 2023-03-28 18:25:04
*/
public class NailingCrowd implements Serializable {
    /**
     *
     * The database column name:nailing_crowd.id;length:10;type:INTEGER;default:"nextval('nailing_crowd_id_seq'::regclass)";comment:"null"
     */
    private Integer id;

    /**
     *
     * The database column name:nailing_crowd.crowd_name;length:16;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String crowdName;

    /**
     *
     * The database column name:nailing_crowd.crowd_token;length:8;type:VARCHAR;default:"NULL::character varying";comment:"null"
     */
    private String crowdToken;

    /**
     *
     * The database column name:nailing_crowd.gmt_modify;length:29;type:TIMESTAMP;default:"null";comment:"null"
     */
    private Date lastModifyDateTime;

    /**
     *
     * The database column name:nailing_crowd.gmt_create;length:29;type:TIMESTAMP;default:"null";comment:"null"
     */
    private Date createDateTime;

    /**

     */
    private static final long serialVersionUID = 1L;

    /**

     *
     * @return the value of nailing_crowd.id
     */
    public Integer getId() {
        return id;
    }

    /**

     *
     * @param id the value for nailing_crowd.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**

     *
     * @return the value of nailing_crowd.crowd_name
     */
    public String getCrowdName() {
        return crowdName;
    }

    /**

     *
     * @param crowdName the value for nailing_crowd.crowd_name
     */
    public void setCrowdName(String crowdName) {
        this.crowdName = crowdName == null ? null : crowdName.trim();
    }

    /**

     *
     * @return the value of nailing_crowd.crowd_token
     */
    public String getCrowdToken() {
        return crowdToken;
    }

    /**

     *
     * @param crowdToken the value for nailing_crowd.crowd_token
     */
    public void setCrowdToken(String crowdToken) {
        this.crowdToken = crowdToken == null ? null : crowdToken.trim();
    }

    /**

     *
     * @return the value of nailing_crowd.gmt_modify
     */
    public Date getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**

     *
     * @param lastModifyDateTime the value for nailing_crowd.gmt_modify
     */
    public void setLastModifyDateTime(Date lastModifyDateTime) {
        this.lastModifyDateTime = lastModifyDateTime;
    }

    /**

     *
     * @return the value of nailing_crowd.gmt_create
     */
    public Date getCreateDateTime() {
        return createDateTime;
    }

    /**

     *
     * @param createDateTime the value for nailing_crowd.gmt_create
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
        NailingCrowd other = (NailingCrowd) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCrowdName() == null ? other.getCrowdName() == null : this.getCrowdName().equals(other.getCrowdName()))
            && (this.getCrowdToken() == null ? other.getCrowdToken() == null : this.getCrowdToken().equals(other.getCrowdToken()))
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
        result = prime * result + ((getCrowdName() == null) ? 0 : getCrowdName().hashCode());
        result = prime * result + ((getCrowdToken() == null) ? 0 : getCrowdToken().hashCode());
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
        sb.append(", crowdName=").append(crowdName);
        sb.append(", crowdToken=").append(crowdToken);
        sb.append(", lastModifyDateTime=").append(lastModifyDateTime);
        sb.append(", createDateTime=").append(createDateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}