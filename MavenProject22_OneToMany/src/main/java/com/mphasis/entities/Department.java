package com.mphasis.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="dept_table")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int did;
	private String dname;
	@OneToMany(mappedBy = "dept",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Employee> empList=new ArrayList<Employee>();
	public Department() {
		super();
	}
	 
	public Department(String dname) {
		super();
		this.dname = dname;
	}

	public Department(int did, String dname, List<Employee> empList) {
		super();
		this.did = did;
		this.dname = dname;
		this.empList = empList;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	public void addEmployee(Employee e) {
		empList.add(e);
		e.setDept(this);
	}
//	public void removeEmployee(Employee e) {
//		empList.remove(e);
//		e.setDept(null);
//	}
	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", empList=" + empList + "]";
	}
	
	
}
