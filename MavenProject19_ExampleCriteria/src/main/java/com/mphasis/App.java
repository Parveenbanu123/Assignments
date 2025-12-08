package com.mphasis;

import java.time.LocalDate;
import java.util.Arrays;

import com.mphasis.dao.OrderDao;
import com.mphasis.model.Order;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        OrderDao dao=new OrderDao();
        //dao.addOrder(new Order(2,LocalDate.now(),2500.0,Arrays.asList("Laptop,Mobile")));
        dao.findAll().forEach(System.out::println);
        
    }
}
