package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        // Dev obj = (Dev)context.getBean("dev");
        Dev obj = context.getBean(Dev.class);
        
      // obj.setAge(18);
      // System.out.println(obj.getAge());
    obj.build();
    // obj.compile();

        }
}
