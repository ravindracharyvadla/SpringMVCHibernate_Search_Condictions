package com.companyname.dao;

import java.util.List;

import com.companyname.entity.Employee;

public interface EmployeeDao {

	public List<Employee> searchById(int employeeId);
	
}
