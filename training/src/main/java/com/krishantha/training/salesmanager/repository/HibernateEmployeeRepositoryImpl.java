package com.krishantha.training.salesmanager.repository;



import java.util.ArrayList;
import java.util.List;

import com.krishantha.training.salesmanager.model.Employee;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {
	@Override
	public List<Employee> getAllEmployees(){
		List<Employee> employees = new ArrayList<>();
		Employee employee1 = new Employee();
		employee1.setEmployeeName("Krishantha");
		employee1.setEmployeeLocation("kadawatha");
		employees.add(employee1);
		Employee employee2 = new Employee();
		employee2.setEmployeeName("Tharsikan");
		employee2.setEmployeeLocation("Vavuniya");
		employees.add(employee2);
		return employees;
	}
}
