package org.tarena.note.entity;

import java.io.Serializable;

public class Note implements Serializable{
	private String noteId;
	private String notebookId;
	private String userId;
	private String noteStatusId;
	private String noteTypeId;
	private String noteTitle;
	private String noteBody;
	private Long noteCreateTime;
	private Long noteLastModifyTime;
	public String getNoteId() {
		return noteId;
	}
	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}
	public String getNotebookId() {
		return notebookId;
	}
	public void setNotebookId(String notebookId) {
		this.notebookId = notebookId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getNoteStatusId() {
		return noteStatusId;
	}
	public void setNoteStatusId(String noteStatusId) {
		this.noteStatusId = noteStatusId;
	}
	public String getNoteTypeId() {
		return noteTypeId;
	}
	public void setNoteTypeId(String noteTypeId) {
		this.noteTypeId = noteTypeId;
	}
	public String getNoteTitle() {
		return noteTitle;
	}
	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}
	public String getNoteBody() {
		return noteBody;
	}
	public void setNoteBody(String noteBody) {
		this.noteBody = noteBody;
	}
	public Long getNoteCreateTime() {
		return noteCreateTime;
	}
	public void setNoteCreateTime(Long noteCreateTime) {
		this.noteCreateTime = noteCreateTime;
	}
	public Long getNoteLastModifyTime() {
		return noteLastModifyTime;
	}
	public void setNoteLastModifyTime(Long noteLastModifyTime) {
		this.noteLastModifyTime = noteLastModifyTime;
	}
	
}
