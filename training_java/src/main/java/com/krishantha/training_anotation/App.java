package com.krishantha.training_anotation;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.krishantha.training_anotation.salesmanager.config.ApplicationConfig;
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
    	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
    	EmployeeService employeeService1 = (EmployeeService) applicationContext.getBean("employeeService",EmployeeService.class);
    	EmployeeService employeeService2 = (EmployeeService) applicationContext.getBean("employeeService",EmployeeService.class);
   	 	System.out.println(employeeService1.toString());
   	 	System.out.println(employeeService2.toString());
    	List<Employee> employees = employeeService1.getAllEmployee();
        for(Employee employee: employees) {
        	System.out.println(employee.getEmployeeName()+" at "+employee.getEmployeeLocation());
        }
    }
}