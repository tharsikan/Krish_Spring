package com.krishantha.tharsikan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.krishantha.tharsikan.model")   // @Bean ====> @ComponentScan + @Component
public class AppConfig {
	
//	@Bean
//	public Bike setBike() {
//		return new Bike();
//	}
//	
//	@Bean
//	public Tyre setTyre() {
//		Tyre x = new Tyre();
//		x.setName("tharsikan");
//		return x;
//	}
//	
//	@Bean
//	public Car setCar() {
//		return new Car();
//	}
}
