package com.mphasis;

import java.io.File;
import java.io.FileNotFoundException;

import javax.script.CompiledScript;

public class DemoOnException implements AutoCloseable{

	public static void main(String[] args) throws FileNotFoundException{
		int a=5,b[]= {1,2,3,5,5};
		String str=null;
		File f=new File("demo.txt");
		
		try {
			//System.out.println(f.getAbsolutePath());
			useFile(f);
			for(int i=0;i<b.length;i++)
				System.out.println(a/b[i]);
			//System.out.println(str.charAt(5));
			check(a,b);
			extractString(str);
			
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Application closed successfully");
		

	}
	private static void useFile(File f) throws FileNotFoundException{
		if(!f.exists()) {
			throw new FileNotFoundException();
		}
	}
	private static void check(int a, int[] b) {
		for(int i=0;i<=b.length;i++) {
			if(b[i]==0) {
				throw new ArithmeticException();
			}
			if(i>b.length) {
				throw new ArrayIndexOutOfBoundsException();
			}
		}
	}

	private static void extractString(String str) {
//		try {
//			System.out.println(str.charAt(5));
//		}catch(NullPointerException e) {
//			e.printStackTrace();
//		}
		if(str==null) {
			throw new NullPointerException();
		}
		else {
			System.out.println("No Exception");
		}
	}
	@Override
	public void close() throws Exception {
		System.out.println(" DemoOnException Closed");
		
	}

}
