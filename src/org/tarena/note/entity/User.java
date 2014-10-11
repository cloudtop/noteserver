package org.tarena.note.entity;

import java.io.Serializable;

public class User implements Serializable{
	private String userId;
	private String userName;
	private String userPassword;
	private String userToken;
	private String userDescr;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public String getUserToken() {
		return userToken;
	}
	public void setUserToken(String userToken) {
		this.userToken = userToken;
	}
	public String getUserDescr() {
		return userDescr;
	}
	public void setUserDescr(String userDescr) {
		this.userDescr = userDescr;
	}
	
}
