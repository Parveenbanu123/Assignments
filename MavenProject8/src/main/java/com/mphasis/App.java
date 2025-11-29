package com.mphasis;


public class App {
	
	public String sayHello() {
		return "Hello";
	}
	
	public String checkText() {
		String str=null;
		return "Parveen";
		//return str;
		
	}
	
    public static void main(String[] args) {
  
        App a=new App();
        System.out.println(a.sayHello());
        System.out.println(a.checkText());
    }
}
