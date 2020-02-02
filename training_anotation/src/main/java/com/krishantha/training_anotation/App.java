package com.krishantha.training_anotation;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.krishantha.training_anotation.salesmanager.model.Employee;
import com.krishantha.training_anotation.salesmanager.service.EmployeeService;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
    	EmployeeService employeeService = (EmployeeService) applicationContext.getBean("employeeService",EmployeeService.class);
   	 
    	List<Employee> employees = employeeService.getAllEmployee();
        for(Employee employee: employees) {
        	System.out.println(employee.getEmployeeName()+" at "+employee.getEmployeeLocation());
        }
    }
}
