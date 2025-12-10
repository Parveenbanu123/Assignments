package com.mphasis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mphasis.beans.Employee;


public class App {
    public static void main(String[] args) {
       ApplicationContext context=new ClassPathXmlApplicationContext("employee-bean.xml");
//       Hello h=(Hello)context.getBean("hello");
//       System.out.println(h.sayHello());
       
//       Person p=(Person) context.getBean("person");
//       System.out.println(p);
//       System.out.println(p.hashCode());
//       
//       Person p1=(Person) context.getBean("person");
//       System.out.println(p1);
//       System.out.println(p1.hashCode());
       
       Employee e=(Employee) context.getBean("emp");
       System.out.println(e);
       

    }
}
