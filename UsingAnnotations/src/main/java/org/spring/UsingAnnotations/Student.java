package org.spring.UsingAnnotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	
	@Value(value = "${student.name}")
	private String studentName;
	
	@Autowired
	private Subject subject;

	@Autowired // autowired do not need setters
	@Qualifier("sciTeacher")
	private Teacher teacher;
	
//	@Autowired
//	private Teacher sciTeacher;

//	public Student(Subject subject) {
//		this.subject = subject;
//	}

//	public void setSubject(Subject subject) {
//		this.subject = subject;
//	}
//
//	public void setTeacher(Teacher teacher) {
//		this.teacher = teacher;
//		System.out.println("this is setter Teacher");
//	}

	public void subjectInfo() {
		System.out.println("The Student name is "+studentName);
		teacher.teach();
		subject.subName();
	}

}
