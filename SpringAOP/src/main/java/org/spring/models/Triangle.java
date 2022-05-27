package org.spring.models;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Triangle {
	
	@Value("tri")
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void triangle() {
		System.out.println("this is triangle");
	}
}
