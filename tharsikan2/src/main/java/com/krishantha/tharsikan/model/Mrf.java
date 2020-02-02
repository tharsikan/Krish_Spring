package com.krishantha.tharsikan.model;

import org.springframework.stereotype.Component;

@Component
public class Mrf implements Tyre {
	private String name="mrf";

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
