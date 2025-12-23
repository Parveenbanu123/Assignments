package com.mphasis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mphasis.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Employee findByEname(String name);

	List<Employee> findBySalary(double salary);
	
	
	@Query(value="select * from employee where salary=?1 and ename like ?2",nativeQuery=true)
	List<Employee> findEmployeesBySalaryAndNameStartsWithS(@Param("salary")double salary,@Param("name") String name);

	
	@Query("select e from Employee e where e.salary=:salary and e.ename like :name")
	List<Employee> findEmployeesBySalaryAndNameStartsWithSUsingJPQL(@Param("salary")double salary,@Param("name") String name);

	
	@Query(name="findByEmpname")
	Employee findByEmpname(@Param("name")String name);
}
