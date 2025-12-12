package com.mphasis;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mphasis.beans.Order;
import com.mphasis.beans.SpELDemoClass;
import com.mphasis.beans.SpELProgDemo;
import com.mphasis.config.ConfigClass;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigClass.class);
		Order o=(Order) context.getBean("order");
		System.out.println(o);
		//o.getItemList().forEach(System.out::println);
		o.getItems();
		
		
		SpELDemoClass spelBean=(SpELDemoClass) context.getBean("spELDemoClass");
		spelBean.printAll();
		
		
		SpELProgDemo spelProg=(SpELProgDemo) context.getBean("spELProgDemo");
		spelProg.runExpression();
		context.close();
    }
}
