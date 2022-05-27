package org.spring.SampleAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("${student.name}")
	private String name;
	
	@Autowired
	private Branch branch;
	
	@Autowired
	@Qualifier("mathsTeacher")
	private Teacher teacher;
	
	public void display() {
		System.out.println("Student name= "+name);
		branch.methodBranch();
		teacher.teach();
	}
}
