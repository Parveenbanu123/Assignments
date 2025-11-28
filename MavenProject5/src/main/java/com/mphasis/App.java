package com.mphasis;


public class App {
    public static void main(String[] args) {
    	
    	System.out.println("Immutable Class Creation");
    	System.out.println("1.Class need to be final"+ 
    	"\n2.Properties need to be private final\n"+
    	"3.Properties need to get values through constructor only\n"+
    	"4.No Setters to modify data");
        Person p1=new Person("Parveen banu", 12345);
        System.out.println(p1);
        
       
    }
}
