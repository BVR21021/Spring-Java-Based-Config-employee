package com.venky;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(EmployeeConfig.class);
        EmployeeBean ab=(EmployeeBean)ctx.getBean("pb");
         System.out.println( ab.toString());
    }
}
