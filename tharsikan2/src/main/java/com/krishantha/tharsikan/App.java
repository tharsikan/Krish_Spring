package com.krishantha.tharsikan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.krishantha.tharsikan.model.Bike;
import com.krishantha.tharsikan.model.Vehicle;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Vehicle v = (Vehicle) applicationContext.getBean(Bike.class);
        v.drive();
        v.tyre();
        
    }
}