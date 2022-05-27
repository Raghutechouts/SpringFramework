package org.spring.UsingAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "org.spring.UsingAnnotations")
@PropertySource(value = {"student.properties"})
public class Config {
	
//	
//	@Bean
//	public Subject subjectBean() {
//		return new Subject();
//	}
//	
//	@Bean
//	public Teacher getTeacher() {
//		return new mathTeacher();
//		
//	}
//	
//	@Bean
//	 public Student studentBean() {
//		Student student = new Student();
//		student.setSubject(subjectBean());
//		student.setTeacher(getTeacher());
//		return student;
//		
//	}
}
