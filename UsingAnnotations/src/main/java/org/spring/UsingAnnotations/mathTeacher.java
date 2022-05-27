package org.spring.UsingAnnotations;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class mathTeacher implements Teacher {

	public void teach() {
		System.out.println("this is math teacher");
	}

}
