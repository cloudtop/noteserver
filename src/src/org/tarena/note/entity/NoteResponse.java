package org.tarena.note.entity;

import java.io.Serializable;
//��Ϊͬһ����Ӧ���
public class NoteResponse implements Serializable{
	private String status;//״̬,0�ɹ�;1ʧ��;...
	private String message;//��Ϣ
	private Object data;//����
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
