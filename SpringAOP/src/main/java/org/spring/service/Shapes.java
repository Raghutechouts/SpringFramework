package org.spring.service;

import org.spring.models.Circle;
import org.spring.models.Triangle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Shapes {
	
	
	private Circle circle;
	
	
	private Triangle triangle;
	
	@Autowired
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
	
	@Autowired
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	public Circle getCircle() {
		return circle;
	}
	public Triangle getTriangle() {
		return triangle;
	}
	
}
