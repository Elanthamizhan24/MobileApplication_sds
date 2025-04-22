package com.Employee.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.Entity.Employee;
import com.Employee.Service.EmployeeService;

@RestController

public class EmployeeController {
	
	@Autowired
	
	EmployeeService es;
	
	@PostMapping(value="/postEmp")
	
	public List<Employee> postObject(@RequestBody List<Employee> e) {
		return es.postObject(e);
		
	}
	
	@GetMapping(value="/postEmps/{a}")
	public Employee getSingleObject(@PathVariable int a) {
		return es.getSingleObject(a);
	}
	@GetMapping(value="/getEmps")
	public List<Employee> getEmpd() {
		return es.getEmpd();
	}
	@PutMapping(value="/updateObject/{n}")
	public String update(@PathVariable int n,@RequestBody Employee x) {
	return es.update(n,x);
	}
	@PatchMapping(value="/udpateName/{n1}")
	public String updateName(@PathVariable int n1,@RequestBody Employee name) {
		return es.updateName(n1,name);
	}
	
	@GetMapping(value="getBetween/{n2}/{n3}")
	public List<Employee>getBetween (@PathVariable int n2,@PathVariable int n3)
	{
		return es.getBetween(n2,n3);
	}
	
	@GetMapping(value="getJpa/{o1}/{o2}")
	public List<Employee>getJpa(@PathVariable int o1,@PathVariable int o2){
		return es.getJpa(o1,o2);
	}
	@GetMapping(value="/getSecMax")
     public List<Employee>getSecMax(){
		return es.getSecMax();
	}
	@GetMapping(value="/getMax")
	public List<Employee>getMax(){
		return es.getMax();
	}
	
	@GetMapping(value="/getGroup")
	public List<Object>getGroup(){
		return es.getGroup();
	}
	@GetMapping(value="/getSum")
	public List<Object>getSum(){
		return es.getSum();
	}
	@GetMapping(value="/getStartsChar/{a}")
	public List<Employee>getStartsChar(@PathVariable String a){
		return es.getStartsChar(a);
	}
}
