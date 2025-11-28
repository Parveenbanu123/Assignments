package com.mphasis;

/**
 * Hello world!
 *
 */
public class App 
{
	static {
		System.out.println("static block 1");
	}
	static {
		System.out.println("static block 2");
	}
	static {
		System.out.println("static block 5");
	}
	public static void main() {
		System.out.println("my main");
	}
    public static void main( String[] args )
    {
//        Employee emp=new Employee();
//        System.out.println(emp);
//        emp.setEmpId(123);
//        emp.setEmpName("Parveen");
//        emp.setDesg("Developer");
//        emp.setMobileNum("1234567890");
//        System.out.println(emp);
//        
//        Employee emp1=new Employee("Saranya",347,"Tester","9876543210");
//        System.out.println(emp1);
        
        Student s1=new Student(338,"Parveen",85,22);
        Student s2=new Student(338,"Parveen",85,22);
        
//        System.out.println(s1.hashCode());
//        System.out.println(s2.hashCode());
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));
        
        System.out.println(s1.clgName);
        System.out.println(s2.clgName);
        s1.clgName="KCE";
        System.out.println(s2.clgName);
        App.main();
        
    }
    static {
		System.out.println("static block 3");
	}
    static {
		System.out.println("static block 4");
	}
}
