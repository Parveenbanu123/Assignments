package com.mphasis.beans;

import java.util.Arrays;
import java.util.List;

public class Person {
	private int id;
	private String name;
	private int age;
	private Address address;
	//private List<String> langs;
	private String[] langs;
	public Person() {
		super();
	}
	
	

	public Person(int id, String name, int age, Address address, String[] langs) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.langs = langs;
	}
	
//	public Person(int id, String name, int age, Address address) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.age = age;
//		this.address = address;
//	}


	public void setId(int id) {
		this.id = id;
	}
	



	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", langs="
				+ Arrays.toString(langs) + "]";
	}



//	@Override
//	public String toString() {
//		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + "]";
//	}



//	@Override
//	public String toString() {
//		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", langs=" + langs
//				+ "]";
//	}
	
	

	
	
	
	
}
