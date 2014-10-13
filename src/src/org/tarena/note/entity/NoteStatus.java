package org.tarena.note.entity;

import java.io.Serializable;

public class NoteStatus implements Serializable{
	private String noteStatusId;
	private String noteStatusCode;
	private String noteStatusName;
	public String getNoteStatusId() {
		return noteStatusId;
	}
	public void setNoteStatusId(String noteStatusId) {
		this.noteStatusId = noteStatusId;
	}
	public String getNoteStatusCode() {
		return noteStatusCode;
	}
	public void setNoteStatusCode(String noteStatusCode) {
		this.noteStatusCode = noteStatusCode;
	}
	public String getNoteStatusName() {
		return noteStatusName;
	}
	public void setNoteStatusName(String noteStatusName) {
		this.noteStatusName = noteStatusName;
	}
	
}
