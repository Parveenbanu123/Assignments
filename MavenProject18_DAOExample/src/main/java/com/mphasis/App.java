package com.mphasis;

import java.util.List;

import com.mphasis.dao.EmployeeDao;
import com.mphasis.model.Employee;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       EmployeeDao dao=new EmployeeDao();
       Employee e=new Employee(123,"Parveen",30000,"IT","Developer");
       Employee e1=new Employee(125,"Saranya",50000,"IT","Tester");
       //dao.addEmployee(e);
       //dao.addEmployee(e1);
       //dao.findAll().forEach(System.out::println);
       //System.out.println(dao.findById(1));
      //dao.findByDept("IT").forEach(System.out::println);
       List<Employee> elist=dao.findByFilters(null, null, 50000);
       elist.forEach(System.out::println);
       
    }
}
