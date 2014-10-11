package org.tarena.note.entity;

import java.io.Serializable;

public class NoteActivity implements Serializable{
	private String noteActivityId;
	private String activityId;
	private String noteId;
	private Integer noteActivityUp;
	private Integer noteActivityDown;
	private String noteActivityTitle;
	private String noteActivityBody;
	public String getNoteActivityId() {
		return noteActivityId;
	}
	public void setNoteActivityId(String noteActivityId) {
		this.noteActivityId = noteActivityId;
	}
	public String getActivityId() {
		return activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}
	public String getNoteId() {
		return noteId;
	}
	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}
	public Integer getNoteActivityUp() {
		return noteActivityUp;
	}
	public void setNoteActivityUp(Integer noteActivityUp) {
		this.noteActivityUp = noteActivityUp;
	}
	public Integer getNoteActivityDown() {
		return noteActivityDown;
	}
	public void setNoteActivityDown(Integer noteActivityDown) {
		this.noteActivityDown = noteActivityDown;
	}
	public String getNoteActivityTitle() {
		return noteActivityTitle;
	}
	public void setNoteActivityTitle(String noteActivityTitle) {
		this.noteActivityTitle = noteActivityTitle;
	}
	public String getNoteActivityBody() {
		return noteActivityBody;
	}
	public void setNoteActivityBody(String noteActivityBody) {
		this.noteActivityBody = noteActivityBody;
	}
	
}
