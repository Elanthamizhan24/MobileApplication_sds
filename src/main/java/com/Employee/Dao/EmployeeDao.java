package com.Employee.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Employee.Entity.Employee;
import com.Employee.Repository.EmployeeRepository;

@Repository

public class EmployeeDao {
	
	@Autowired
	
	EmployeeRepository er;
	
	public List<Employee>postObject(List<Employee> e) {
		er.saveAll(e);
		return e;
	}
	
	public Employee getSingleObject(int a) {
		return er.findById(a).get();
	}

	public List<Employee> getEmpd() {
		return er.findAll();
	}
	public String update(int n,Employee x) {
		Employee e1=er.findById(n).get();
		e1.setName(x.getName());
		e1.setSalary(x.getSalary()); 
		e1.setExp(x.getExp());
		e1.setGender(x.getGender());
		
		er.save(e1);
		return "update Successfully";
	}
	public String updateName(int n1,Employee name) {
		Employee e2=er.findById(n1).get();
		e2.setName(name.getName());
		er.save(e2);
		
		return "update Successfully";
	}
	
	public List<Employee>getBetween(int n2,int n3){
		return er.getBetween(n2,n3);
	}
	
	public List<Employee>getJpa(int o1,int o2){
		return er.getJpa(o1, o2);
	}
	public List<Employee>getSecMax(){
		return er.getSecMax();
	}
	public List<Employee>getMax(){
		return er.getMax();
	}
	public List<Object>getGroup(){
		return er.getGroup();
	}
	public List<Object>getSum(){
		return er.getSum();
	}
	public List<Employee>getStartsChar(String a){
		return er.getStartsChar(a);
	}
}
