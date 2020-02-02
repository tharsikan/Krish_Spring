package com.krishantha.training_anotation.salesmanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.krishantha.training_anotation.salesmanager.model.Employee;
import com.krishantha.training_anotation.salesmanager.repository.EmployeeRepository;


public class EmployeeServiceImpl implements EmployeeService{
	// EmployeeRepository employeeRepository = new HibernateEmployeeRepositoryImpl();   tight cuple
	
	//@Autowired
	private EmployeeRepository employeeRepositoryy;
	
	public EmployeeServiceImpl() {
		System.out.println(" EmployeeServiceImpl() ");
	}
	//@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepositoryy,int s) {
		this.employeeRepositoryy = employeeRepositoryy;
	}
	
	//@Autowired
	public EmployeeServiceImpl(EmployeeRepository employeeRepositoryy) {
		System.out.println("  EmployeeServiceImpl(EmployeeRepository employeeRepositoryy)");
		this.employeeRepositoryy = employeeRepositoryy;
	}


	@Autowired
	public void setEmployeeRepository(EmployeeRepository employeeRepositoryy) {
		System.out.println(" setEmployeeRepository(EmployeeRepository employeeRepositoryy)");
		this.employeeRepositoryy = employeeRepositoryy;
	}



	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepositoryy.getAllEmployees();
	
	}
	
}
