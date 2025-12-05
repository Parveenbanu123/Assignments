package com.mphasis;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.mphasis.model.Course;
import com.mphasis.model.Student;

public class Main {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction txn=session.beginTransaction();
		
//		Course c=new Course(1,"Java",25000);
//		session.save(c);
//		Student s=new Student(1,"Parveen",c,"9876543210","parveen@gmail.com");
//		session.save(s);
		
		Course s=session.get(Course.class, 1);
		if(s!=null)
			session.delete(s);
		txn.commit();
		System.out.println("Student Added successfully");
		session.close();
		factory.close();
		

	}

}
