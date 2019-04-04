package com.companyname.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.companyname.entity.Employee;

@Transactional
@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
    private SessionFactory sessionFactory;

	@Override
	public List<Employee> searchById(int employeeId) {
		
		Session session = this.sessionFactory.getCurrentSession();		
		
		
		//session.load(Employee.class, new Integer(employeeId));
		Query<Employee> searchQuery=session.createQuery("from Employee as e where e.employeeId=:employeeId");
		searchQuery.setParameter("employeeId", employeeId);
		List<Employee> listOfEmployees = searchQuery.list();
		
		//session.close();
		
		return listOfEmployees; 
		
	}
	
	
}
