package com.croky.postgres.dal.model.extra;

import java.io.Serializable;

public class UnitCount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4440046598698962815L;

	private String unit;
	
	private Integer count;

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}
}
