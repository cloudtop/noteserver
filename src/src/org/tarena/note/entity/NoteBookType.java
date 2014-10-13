package org.tarena.note.entity;

import java.io.Serializable;

public class NoteBookType implements Serializable{
	private String notebookTypeId;
	private String notebookTypeCode;
	private String notebookTypeName;
	private String notebookTypeDesc;
	public String getNotebookTypeId() {
		return notebookTypeId;
	}
	public void setNotebookTypeId(String notebookTypeId) {
		this.notebookTypeId = notebookTypeId;
	}
	public String getNotebookTypeCode() {
		return notebookTypeCode;
	}
	public void setNotebookTypeCode(String notebookTypeCode) {
		this.notebookTypeCode = notebookTypeCode;
	}
	public String getNotebookTypeName() {
		return notebookTypeName;
	}
	public void setNotebookTypeName(String notebookTypeName) {
		this.notebookTypeName = notebookTypeName;
	}
	public String getNotebookTypeDesc() {
		return notebookTypeDesc;
	}
	public void setNotebookTypeDesc(String notebookTypeDesc) {
		this.notebookTypeDesc = notebookTypeDesc;
	}
	
}
