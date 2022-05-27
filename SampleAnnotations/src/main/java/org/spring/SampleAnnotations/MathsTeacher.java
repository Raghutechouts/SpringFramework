package org.spring.SampleAnnotations;

import org.springframework.stereotype.Component;

@Component
public class MathsTeacher implements Teacher {

	public void teach() {
		System.out.println("this is maths teacher");
	}

}
