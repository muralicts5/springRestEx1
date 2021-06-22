package com.example.springRestDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springRestDemo.entity.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@GetMapping("/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		Employee obj=new Employee();
		obj.setId(id);
		obj.setFirstName("ramesh");
		obj.setEmail("murali.prakash@cts.com");
		obj.setLastName("sdfsd");
		return obj;
	}
	
	@GetMapping
	public List<Employee> getEmployees() {
		Employee obj=new Employee();
		obj.setFirstName("ramesh");
		obj.setEmail("murali.prakash@cts.com");
		obj.setLastName("sdfsd");
		Employee obj1=new Employee();
		obj1.setFirstName("suresh");
		obj1.setEmail("murali.prakash@cts.com");
		obj1.setLastName("sdfsd");
		List<Employee> employees=new ArrayList<Employee>();
		employees.add(obj);
		employees.add(obj1);

		return employees;
	}
	
	@PostMapping
	public Employee insertEmployee(Employee obj) {
		obj.setFirstName("sursh");
		obj.setEmail("new.prakash@cts.com");
		obj.setLastName("sdfsd");
		return obj;
	}
	
	@PutMapping
	public Employee updateEmployee(Employee obj) {
		obj.setFirstName("sursh");
		obj.setEmail("new.prakash@cts.com");
		obj.setLastName("sdfsd");
		return obj;
	}
	
	@DeleteMapping
	public Employee deleteEmployee(Employee obj) {
		obj.setFirstName("sursh");
		obj.setEmail("new.prakash@cts.com");
		obj.setLastName("sdfsd");
		return obj;
	}
	
	
	
	
	
}
