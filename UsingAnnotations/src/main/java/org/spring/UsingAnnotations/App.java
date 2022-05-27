package org.spring.UsingAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
       System.out.println("bean is loaded");
       Student st  = context.getBean("student",Student.class);
       st.subjectInfo();
       context.close();
    }
}
