package com.krishantha.training_anotation.salesmanager.repository;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.krishantha.training_anotation.salesmanager.model.Employee;

@Repository("setter_injection_useType")
@Scope("singleton")
public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	public HibernateEmployeeRepositoryImpl() {
		System.out.println(" HibernateEmployeeRepositoryImpl()");
	}

	@Value("${name}")
	private String employeeName;
	
	@Value("${city}")
	private String employeeCity;
	
	@Override
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		Employee employee1 = new Employee();
		employee1.setEmployeeName(employeeName);
		employee1.setEmployeeLocation(employeeCity);
		employees.add(employee1);
		Employee employee2 = new Employee();
		employee2.setEmployeeName("Tharsikan");
		employee2.setEmployeeLocation("Vavuniya");
		employees.add(employee2);
		return employees;
	}
}
