package com.krishantha.tharsikan.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Jpg implements Tyre{
	private String name="jpg";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Tyre [name=" + name + "]";
	}
	
}
