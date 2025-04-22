 package com.Employee.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Employee.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
	
	
	@Query(value="select * from employee where id between ? and ?;",nativeQuery=true)
	
	public List<Employee>getBetween(int n2,int n3);
	
	@Query(value="select e from Employee e where e.salary between :o1 and :o2")
	
	public List<Employee>getJpa(@Param("o1")int o1,@Param("o2")int o2);

	@Query(value="Select e from Employee e where e.salary=(select max(e.salary)from Employee e)")
	
	public List<Employee>getSecMax();
	
	@Query(value = "select e from Employee e where e.salary =(select max(e.salary) from Employee e  where e.salary not in (select max(e.salary) from Employee e))")
	public List<Employee>getMax();
	
	@Query(value="select e.gender,count(e) from Employee e group by e.gender")
	public List<Object>getGroup();
	
	@Query(value="select e.gender,sum(e.salary)from Employee e group by e.gender")
	public List<Object>getSum();
	
	@Query(value="select e from Employee e  where e.name like concat(:a,'%')")
	public List<Employee>getStartsChar(@Param("a")String a);
}
