package org.spring.ExampleForProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    
    ApplicationContext context =  new ClassPathXmlApplicationContext("org/spring/ExampleForProperties/beans.xml");
    Student st = context.getBean("student",Student.class);
    System.out.println(st);
    }
}
