package com.krishantha.tharsikan.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	
	@Autowired
	@Qualifier("mrf")
	private Tyre tyre;
	
	public void drive() {
		System.out.println("jaali");
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	
	public void tyre() {
		System.out.println(this.tyre.getName());
	}
}
