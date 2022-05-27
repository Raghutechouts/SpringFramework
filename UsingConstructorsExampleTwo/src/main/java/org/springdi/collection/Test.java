package org.springdi.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/springdi/collection/bean.xml");
		Employee e = context.getBean("emp2",Employee.class);
		System.out.println(e);
	}

}
