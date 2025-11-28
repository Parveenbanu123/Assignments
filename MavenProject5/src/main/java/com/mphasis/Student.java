package com.mphasis;


public class Student implements Comparable<Student>{
	
	private int id;
	private String name;
	private int age;
	private String city;
	private double marks;
	
	public Student() {
		super();
	}

	public Student(int id, String name, int age, String city, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.city = city;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", city=" + city + ", marks=" + marks + "]";
	}



	@Override
	public int compareTo(Student s) {
		
		//return this.id-s.id;
		//return this.age-s.age;
		return this.name.compareTo(s.name);
		//return s.name.compareTo(this.name);//descending order
		//return (int) (this.marks-s.marks); //double member used in sorting
	}
	
	
	
}
