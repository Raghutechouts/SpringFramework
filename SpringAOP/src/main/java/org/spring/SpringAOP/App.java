package org.spring.SpringAOP;



import org.spring.service.Shapes;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       

        Shapes sh = context.getBean("shapes" ,org.spring.service.Shapes.class);
        sh.getCircle().circle();
        
    }
}
