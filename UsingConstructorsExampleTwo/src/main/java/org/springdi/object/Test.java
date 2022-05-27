package org.springdi.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/springdi/object/bean.xml");
		Student st = context.getBean("student",Student.class);
		System.out.println(st);
	}

}
