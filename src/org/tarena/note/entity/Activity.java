package org.tarena.note.entity;

import java.io.Serializable;

public class Activity implements Serializable{
	private String activityId;
	private String activityTitle;
	private String activityBody;
	private Long activityEndTime;
	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getActivityTitle() {
		return activityTitle;
	}
	public void setActivityTitle(String activityTitle) {
		this.activityTitle = activityTitle;
	}
	public String getActivityBody() {
		return activityBody;
	}
	public void setActivityBody(String activityBody) {
		this.activityBody = activityBody;
	}
	public Long getActivityEndTime() {
		return activityEndTime;
	}
	public void setActivityEndTime(Long activityEndTime) {
		this.activityEndTime = activityEndTime;
	}
	
}
