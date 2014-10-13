package org.tarena.note.entity;

import java.io.Serializable;
import java.sql.Timestamp;

public class NoteBook implements Serializable{
	private String notebookId;
	private String userId;
	private String notebookTypeId;
	private String notebookName;
	private String notebookDesc;
	private Timestamp notebookCreatetime;
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
	public String getNotebookTypeId() {
		return notebookTypeId;
	}
	public void setNotebookTypeId(String notebookTypeId) {
		this.notebookTypeId = notebookTypeId;
	}
	public String getNotebookName() {
		return notebookName;
	}
	public void setNotebookName(String notebookName) {
		this.notebookName = notebookName;
	}
	public String getNotebookDesc() {
		return notebookDesc;
	}
	public void setNotebookDesc(String notebookDesc) {
		this.notebookDesc = notebookDesc;
	}
	public Timestamp getNotebookCreatetime() {
		return notebookCreatetime;
	}
	public void setNotebookCreatetime(Timestamp notebookCreatetime) {
		this.notebookCreatetime = notebookCreatetime;
	}
	
}
