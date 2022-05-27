package org.springdi.UsingConstructorsExampleTwo;

public class Student {
	
	private int id;
	private String name;
	
	public Student() {
		System.out.println("object is Created");
	}

	public Student(int id) {
		this.id = id;
	}

	public Student(String name) {
		this.name = name;
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
}
