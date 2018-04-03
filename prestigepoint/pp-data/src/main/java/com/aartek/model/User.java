package com.aartek.model;

import java.io.Serializable;

public class User implements Serializable {
	
	
	private Integer userId;
	private String  email;
	private Integer password;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;

		
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getPassword() {
		return password;
	}
	public void setPassword(Integer password) {
		this.password = password;
	}
	

}
