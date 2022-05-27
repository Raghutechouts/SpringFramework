package org.spring.model;


import org.hibernate.validator.constraints.NotEmpty;

public class Student {
	
	@NotEmpty
	private String name;
	
	private String branch;
	
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
