package org.spring.SampleAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("org/spring/SampleAnnotations/ApplicationContext.xml");
    	Student student = context.getBean("student" ,Student.class);
    	student.display();
    	
    }
}
