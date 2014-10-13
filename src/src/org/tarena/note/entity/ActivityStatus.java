package org.tarena.note.entity;

import java.io.Serializable;

public class ActivityStatus implements Serializable{
	private String activityStatusId;
	private String activityId;
	private String activityStatusCode;
	private String activityStatusName;
	public String getActivityStatusId() {
		return activityStatusId;
	}
	public void setActivityStatusId(String activityStatusId) {
		this.activityStatusId = activityStatusId;
	}
	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityStatusCode() {
		return activityStatusCode;
	}
	public void setActivityStatusCode(String activityStatusCode) {
		this.activityStatusCode = activityStatusCode;
	}
	public String getActivityStatusName() {
		return activityStatusName;
	}
	public void setActivityStatusName(String activityStatusName) {
		this.activityStatusName = activityStatusName;
	}
	
}
