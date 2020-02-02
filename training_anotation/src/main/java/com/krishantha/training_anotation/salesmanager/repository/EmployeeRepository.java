package com.krishantha.training_anotation.salesmanager.repository;

import java.util.List;

import com.krishantha.training_anotation.salesmanager.model.Employee;

public interface EmployeeRepository {

	List<Employee> getAllEmployees();

}