package com.mphasis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mphasis.config.AppConfig;
import com.mphasis.entities.Order;
import com.mphasis.entities.Payment;
import com.mphasis.service.OrderService;

public class App {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        OrderService service=(OrderService) context.getBean("orderService");
        Order order=new Order("Mobile",5,50000);
        Payment payment = new Payment(null,50000,"gpay","pending");
        service.placeOrder(order, payment);
    }
}
