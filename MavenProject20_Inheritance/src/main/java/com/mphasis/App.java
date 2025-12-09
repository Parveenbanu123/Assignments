package com.mphasis;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.mphasis.entities.IndianFood;
import com.mphasis.util.HibernateUtil;

public class App {
	
	private static final Logger logger=LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
    	logger.info("Application Started...");
    	Session session=HibernateUtil.buildSessionFactory().openSession();
    	logger.info("Session created...");
    	Transaction txn=session.beginTransaction();
    	logger.info("Transaction Started...");
//        Product p=new Product(130,"Laptop");
//        session.save(p);
//    	Vehicle v=new Vehicle("veh123","4 wheeler");
//    	session.save(v);
    	IndianFood f=new IndianFood("Veg");
    	session.save(f);
        logger.info("Persistent object inserted");
        txn.commit();
        logger.info("Transaction Committed");
        session.close();
        logger.info("Session Closed!!!");
        
    }
}
