package org.springdi.object;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context =  new ClassPathXmlApplicationContext("org/springdi/object/bean.xml");
		Employee emp = context.getBean("emp",Employee.class);
//		System.out.println("this is emp id : "+emp.getId());
//		System.out.println("this is emp name : "+emp.getName());
//		System.out.println("this is emp Address : "+emp.getAddress());
		System.out.println(emp);

		
	}

}
