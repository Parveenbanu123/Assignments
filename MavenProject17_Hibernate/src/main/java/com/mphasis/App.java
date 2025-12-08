package com.mphasis;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mphasis.model.Student;
import com.mphasis.util.HibernateUtil;

public class App {
    public static void main(String[] args) {
       SessionFactory factory=HibernateUtil.getSessionFactory();
       Session session=factory.openSession();
       Transaction txn=session.beginTransaction();
//       Student s=new Student(125,"Banu","Python");
//       session.save(s);
//       System.out.println("Record inserted successfully");
       
     //Updating data
//       Student s2=session.get(Student.class, 125);
//     if(s2!=null) {
//  	   s2.setSname("Saranya");
//  	   s2.setCourse("Spring");
//     	   session.update(s2);
//     	   System.out.println("Updated Successfully");
//     }
//     else {
//  	   System.out.println("No student found");
//     }
       
     //delete student
//     Student s3=session.get(Student.class, 123);
//     if(s3!=null) {
//  	   session.delete(s3);
//  	   System.out.println("Deleted successfully");
//     }
//     else {
//  	   System.out.println("No student found");
//     }
       
       //Retrieving data
       List<Student> studList=session.createQuery("From Student",Student.class).list();
       for(Student s1:studList) {
    	   System.out.println(s1);
       }
       
       
     txn.commit();
       session.close();
       factory.close();
       
    }
}
