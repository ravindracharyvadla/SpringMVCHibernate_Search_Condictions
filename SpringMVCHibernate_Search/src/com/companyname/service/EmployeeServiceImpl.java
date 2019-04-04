package com.companyname.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyname.dao.EmployeeDao;
import com.companyname.entity.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeDao employeeDao;

	@Override
	public List<Employee> searchById(int employeeId) {
		
		return employeeDao.searchById(employeeId);
	}

	

	
}
