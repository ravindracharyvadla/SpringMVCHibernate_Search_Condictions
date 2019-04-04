package com.companyname.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.companyname.entity.Employee;
import com.companyname.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/searchLink", method = RequestMethod.GET)
	public ModelAndView homePage()
	{
		ModelAndView mav=new ModelAndView("searchPage");
		
		return mav;
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public ModelAndView selectEmployees(@RequestParam("employeeId") int employeeId) {
		
		List<Employee> listEmployees=employeeService.searchById(employeeId);
		
		ModelAndView mav=new ModelAndView("searchResultPage");
		mav.addObject("listEmps", listEmployees);
		
		return mav;
				
	}
}
