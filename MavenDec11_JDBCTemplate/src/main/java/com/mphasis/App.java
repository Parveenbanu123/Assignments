package com.mphasis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mphasis.beans.Movie;
import com.mphasis.config.JdbcConfig;
import com.mphasis.dao.MovieDao;

public class App {
    public static void main(String[] args) {
       
    	ApplicationContext context=new AnnotationConfigApplicationContext(JdbcConfig.class);
    	MovieDao dao=(MovieDao) context.getBean(MovieDao.class);
    	Movie m=new Movie(123,"Coolie","Tamil",2.4);
    	dao.save(m);
    	
    	//dao.findAll().forEach(System.out::println);
    	//System.out.println(dao.findById(123));
    	
    	//dao.update(m);
    	//System.out.println(dao.findById(123));
    	//dao.findAll().forEach(System.out::println);
    	
    	//dao.delete(m);
    	dao.findAll().forEach(System.out::println);
    }
}
