package com.mphasis.entities;

import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema.RequiredMode;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="user_table")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	@Size(min=3,message="name must be minimum of 3 chars")
	@NotBlank(message = "Username is mandatory")
	@Schema(description = "UserName",example = "Parveen",requiredMode = RequiredMode.REQUIRED)
	private String userName;
	@NotBlank(message = "Password is mandatory")
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\\\d)(?=.*[@#$%^&+=]).{8,}$",message = "Have eight characters or more\r\n"
			+ "Include a capital letter\r\n"
			+ "Use at least one lowercase letter\r\n"
			+ "Consists of at least one digit\r\n"
			+ "Need to have one special symbol (i.e., @, #, $, %, etc.)\r\n"
			+ "Doesn’t contain space, tab, etc.")
	@Schema(description = "Password",example = "Parveen@123",requiredMode = RequiredMode.REQUIRED)
	private String password;
	@Pattern(regexp = "[6789][0-9]{9}",message = "Starts with 6,7,8,9 and must be 10 chars")
	@Schema(description = "Mobile Number",example = "9988776655")
	private String mobile;
	@Pattern(regexp = "^(.+)@(\\\\S+)$",message = "Enter valid email")
	@Schema(description = "Email",example = "parveen@gmail.com")
	private String email;
	public User() {
		super();
	}
	public User(String userName, String password, String mobile, String email) {
		super();
		this.userName = userName;
		this.password = password;
		this.mobile = mobile;
		this.email = email;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
		return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", mobile=" + mobile
				+ ", email=" + email + "]";
	}
	
}
