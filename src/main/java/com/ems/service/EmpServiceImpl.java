package com.ems.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ems.model.Employee;
import com.ems.repository.EmpRepo;

@Service
public class EmpServiceImpl implements EmpService{

	@Autowired
	private EmpRepo empRepo;
	
	@Override
	public Employee addEmployee(Employee employee) {
		Employee emp = empRepo.save(employee);  
		return emp;
	}
	
	@Override
	public String removeEmployee(int id) {
		empRepo.deleteById(id);
		return "Employee Removed Successfully...";
	}

	@Override
	public Optional<Employee> findEmployeeById(int id) {
		Optional<Employee> emp = empRepo.findById(id);
		if(emp.isPresent()) {
			return emp;
		}else {
			return null;
		}
		
	}
	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> empList = empRepo.findAll();
		
		return empList;
	}

	@Override
	public String updateEmployee(int id) {
		Optional<Employee> emp = empRepo.findById(id);
		if(emp.isPresent()) {
			Employee emps = new Employee();
			empRepo.save(emps);
			return "Details Updated Successfully...";
		}else {
			return "Error While Updating, Try Again...";
		}
	}

}
