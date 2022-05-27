package org.springIoc.ExampleOnIoc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("AplicationContext.xml");
       
       Sim s = context.getBean("sim", Sim.class);
       s.calling();
       s.data();
       
    }
}
