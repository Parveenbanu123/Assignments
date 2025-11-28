package com.mphasis;

public class Person {
	private String name;
	private int id;
	private int age;
	public Person(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public Person() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
	public void checkEligibility() throws AgeNotSufficientException{
		if(this.age>18) {
			System.out.println("Person is eligible to Vote");
		}
		else {
			throw new AgeNotSufficientException("Person age is less than 18");
		}
	}
}
