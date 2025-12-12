package com.mphasis.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="users_table")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long uid;
	private String uname;
	private String password;
	private String role;
	private String mobile;
	private String email;
	public User() {
		super();
	}
	
	
	
	public User(String uname, String password, String role, String mobile, String email) {
		super();
		this.uname = uname;
		this.password = password;
		this.role = role;
		this.mobile = mobile;
		this.email = email;
	}



	public Long getUid() {
		return uid;
	}



	public void setUid(Long uid) {
		this.uid = uid;
	}



	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	

	public String getMobile() {
		return mobile;
	}



	public void setMobile(String mobile) {
		this.mobile = mobile;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", password=" + password + ", role=" + role + ", mobile="
				+ mobile + ", email=" + email + "]";
	}



	



	

	
	
	
}
