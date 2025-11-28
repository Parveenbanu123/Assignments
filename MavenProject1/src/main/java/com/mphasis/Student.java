package com.mphasis;

import java.util.Objects;

public class Student {
	private int studid;
	private String name;
	private double marks;
	private int age;
	static String clgName="ABC College";
	
	public Student() {
		super();
	}

	public Student(int studid, String name, double marks, int age) {
		super();
		this.studid = studid;
		this.name = name;
		this.marks = marks;
		this.age = age;
	}

	public int getStudid() {
		return studid;
	}

	public void setStudid(int studid) {
		this.studid = studid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [studid=" + studid + ", name=" + name + ", marks=" + marks + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, marks, name, studid);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Double.doubleToLongBits(marks) == Double.doubleToLongBits(other.marks)
				&& Objects.equals(name, other.name) && studid == other.studid;
	}
	static class College{
		private String cname;
		private String location;
		private long colCode;
		public College(String cname, String location, long colCode) {
			super();
			this.cname = cname;
			this.location = location;
			this.colCode = colCode;
		}
		public College() {
			super();
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public long getColCode() {
			return colCode;
		}
		public void setColCode(long colCode) {
			this.colCode = colCode;
		}
		@Override
		public String toString() {
			return "College [cname=" + cname + ", location=" + location + ", colCode=" + colCode + "]";
		}
	}
	
	
	
}
