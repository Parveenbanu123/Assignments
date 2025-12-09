package com.mphasis;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mphasis.dao.PassportDao;
import com.mphasis.dao.PersonDao;
import com.mphasis.entities.Passport;
import com.mphasis.entities.Person;



public class App {
	private static final Logger logger=LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
    	logger.info("App started");
        Passport pp=new Passport("India123");
        logger.info("Passport generated {}",pp);
        Person p1=new Person("Parveen","9384163925","parveen123@gmail.com");
        logger.info("Person object created successfull {}",p1);
        p1.setPassport(pp);
        PersonDao person=new PersonDao();
        person.addPerson(p1);
//        logger.info("Dao updated person status");
        System.out.println("---------------------------------");
       person.findAll().forEach(System.out::println);
//       System.out.println(person.findById(1l));
        PassportDao dao=new PassportDao();
        //System.out.println(dao.findAll());
        System.out.println(dao.findByPersonId(202l));
        logger.info("App closed!!!");
        
    }
}
