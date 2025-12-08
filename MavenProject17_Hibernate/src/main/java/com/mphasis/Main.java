package com.mphasis;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mphasis.model.Student;
import com.mphasis.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {

		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction txn=session.beginTransaction();

		
		
		//addStudent()
//		session.save(new Student(149,"Sathis","Java"));
//		session.save(new Student(150,"Praveen","Fullstack"));
//		session.save(new Student(151,"Arthika","C++"));
//		session.save(new Student(152,"Parveen","Java"));
//		session.save(new Student(153,"PraveenNayagam","SpringBoot"));
//		session.save(new Student(154,"Vidharsana","Python"));
//		txn.commit();
		

		//getAllStudents()
				List<Student> studList=session.createQuery("From Student",Student.class).list();
				studList.forEach(System.out::println);
				
		//getAllStudentByCourse()
				Query<Student> q1=session.createQuery("From Student where course=:x");
				q1.setParameter("x","Java");
				q1.list().forEach(System.out::println);
				
				
		//getAllStudents whose name starts with P
				Query<Student> q2=session.createQuery("From Student where sname like 'P%' ");
				q2.list().forEach(System.out::println);
		
				
		//Get only id and name --> Projection
				Query<Object[]> q=session.createQuery("select sid,sname from Student",Object[].class); 
				q.list().forEach(s->System.out.println(s[0]+" "+s[1]));
				
		//Count number of rows
				Query<Student> q3=session.createQuery("select count(*) from Student");
				System.out.println(q3.uniqueResult());
				
		//Count number of rows group by course
				Query<Object[]> q4=session.createQuery("select course,count(*) from Student group by course");
				q4.list().forEach(s->System.out.println(s[0]+" "+s[1]));
				
				
		//Using named Query
				Query<Student> q5=session.createNamedQuery("Student.findAll",Student.class);
				System.out.println("--------------------------------------------------");
				q5.list().forEach(System.out::println);
				
		//Using findByCourse NamedQuery	
				Query<Student> q6=session.createNamedQuery("Student.findByCourse",Student.class);
				q6.setParameter("course", "Java");
				System.out.println("--------------------------------------------------");
				q6.list().forEach(System.out::println);
				
		//count using NamedQuery
				Query<Long> q7=session.createNamedQuery("Student.count",Long.class);
				System.out.println("--------------------------------------------------");
				System.out.println(q7.uniqueResult());
				
		
		//GroupBy using NamedQuery
				Query<Object[]> q8=session.createNamedQuery("Student.groupbyCourse",Object[].class);
				System.out.println("--------------------------------------------------");
				q8.list().forEach(s->System.out.println(s[0]+" "+s[1]));
				
		//Start with NamedQuery
				Query<Student> q9=session.createNamedQuery("Student.startwith",Student.class);
				System.out.println("--------------------------------------------------");
				q9.list().forEach(System.out::println);
	
				
				txn.commit();
				session.close();

	}

}
