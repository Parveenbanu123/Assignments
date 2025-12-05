package com.mphasis.model;

public class Student {
	private int studId;
	private String studName;
	private String course;
	private String mobile;
	private String email;
	
	public Student() {
		super();
	}
	public Student(int studId, String studName, String course, String mobile, String email) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.course = course;
		this.mobile = mobile;
		this.email = email;
	}
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
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
		return "Student [studId=" + studId + ", studName=" + studName + ", course=" + course + ", mobile=" + mobile
				+ ", email=" + email + "]";
	}
	
	
}
