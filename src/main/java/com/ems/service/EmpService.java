package com.ems.service;

import java.util.List;
import java.util.Optional;

import com.ems.model.Employee;

public interface EmpService {
	
	public Employee addEmployee(Employee employee);
	
	public String removeEmployee(int id);
	
	public Optional<Employee> findEmployeeById(int id);
	
	public List<Employee> getAllEmployee();
	
	public String updateEmployee(int id);
	
}
