package com.mphasis;

import com.mphasis.dao.DepartmentDao;
import com.mphasis.dao.EmployeeDao;
import com.mphasis.entities.Department;
import com.mphasis.entities.Employee;

public class App {
    public static void main(String[] args) {
        DepartmentDao deptDao=new DepartmentDao();
        EmployeeDao empDao=new EmployeeDao();
        //Department dept=new Department("Development");
        //Department dept1=new Department("Testing");
        
//        Employee e1=new Employee("SathisR");
//        Employee e2=new Employee("PraveenKumar");
//        Employee e3=new Employee("PraveenNayagam");
//        
//        
//        dept1.addEmployee(e1);
//        dept1.addEmployee(e2);
//        dept1.addEmployee(e3);
        
       // deptDao.addDepartment(dept1);
        //deptDao.delete(1);
        deptDao.findAll().forEach(System.out::println);
        //empDao.findAll().forEach(System.out::println);
    }
}
