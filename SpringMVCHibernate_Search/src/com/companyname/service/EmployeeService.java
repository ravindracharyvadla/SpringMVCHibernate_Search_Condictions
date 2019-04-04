package com.companyname.service;

import java.util.List;

import com.companyname.entity.Employee;


public interface EmployeeService {

	public List<Employee> searchById(int employeeId);
	
}
