package com.Employee.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Employee.Dao.EmployeeDao;
import com.Employee.Entity.Employee;

@Service

public class EmployeeService {
	
	@Autowired
	
	EmployeeDao ed;
	
	public List<Employee> postObject(List<Employee> e) {
		return ed.postObject(e);
	}
	
	public Employee getSingleObject(int a) {
		return ed.getSingleObject(a);
	}

	public List<Employee> getEmpd() {
		return ed.getEmpd();
	}
	
	public String update(int n,Employee x) {
		return ed.update(n,x);
	}
	public String updateName(int n1,Employee name) {
		return ed.updateName(n1, name);
	}
	public List<Employee>getBetween(int n2,int n3){
		return ed.getBetween(n2,n3);
	}
	public List<Employee>getJpa(int o1,int o2){
		return ed.getJpa(o1, o2);
	}
	public List<Employee>getSecMax(){
		return ed.getSecMax();
	}
	public List<Employee>getMax(){
		return ed.getMax();
	}
	public List<Object>getGroup(){
		return ed.getGroup();
	}
	public List<Object>getSum(){
		return ed.getSum();
	}
	public List<Employee>getStartsChar(String a){
		return ed.getStartsChar(a);
	}
}
