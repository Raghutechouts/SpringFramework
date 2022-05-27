package org.springdi.UsingSettersExampleOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("org/springdi/UsingSettersExampleOne/bean.xml");
    	
    	Student st = context.getBean("student",Student.class);
    	System.out.println("id: "+st.getId()+" name is : "+st.getStudentName());
    	
    }
    
}
