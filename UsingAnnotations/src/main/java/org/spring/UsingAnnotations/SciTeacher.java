package org.spring.UsingAnnotations;

import org.springframework.stereotype.Component;

@Component
public class SciTeacher implements Teacher {

	public void teach() {
		System.out.println("this is Science teacher");
	}

}
