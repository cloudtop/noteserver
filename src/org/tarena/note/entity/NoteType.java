package org.tarena.note.entity;

import java.io.Serializable;

public class NoteType implements Serializable{
	private String noteTypeId;
	private String noteTypeCode;
	private String noteTypeName;
	private String noteTypeDesc;
	public String getNoteTypeId() {
		return noteTypeId;
	}
	public void setNoteTypeId(String noteTypeId) {
		this.noteTypeId = noteTypeId;
	}
	public String getNoteTypeCode() {
		return noteTypeCode;
	}
	public void setNoteTypeCode(String noteTypeCode) {
		this.noteTypeCode = noteTypeCode;
	}
	public String getNoteTypeName() {
		return noteTypeName;
	}
	public void setNoteTypeName(String noteTypeName) {
		this.noteTypeName = noteTypeName;
	}
	public String getNoteTypeDesc() {
		return noteTypeDesc;
	}
	public void setNoteTypeDesc(String noteTypeDesc) {
		this.noteTypeDesc = noteTypeDesc;
	}
	
}
