package com.mphasis;

import java.io.File;
//import java.io.BufferedReader;
//
//import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class DemoOnIOStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//Character Stream reading & writing
		
//		BufferedReader br=new BufferedReader(new FileReader("assets/data.txt"));
//		String data;
//		while((data=br.readLine())!=null) {
//			System.out.println(data);
//		}
//		BufferedWriter bw=new BufferedWriter(new FileWriter("assets/data.txt",true));
//		bw.newLine();
//		bw.write("My name is Parveen banu");
//		bw.close();

//		while((data=br.readLine())!=null) {
//			System.out.println(data);
//		}
		
		
		//Byte Stream reading & writing
		
//		FileOutputStream fos=new FileOutputStream("assets/info.txt");
//		String text="Parveen banu";
//		fos.write(text.getBytes());
//		fos.close();
//		
//		FileInputStream fis=new FileInputStream("assets/info.txt");
//		int b;
//		while((b=fis.read())!=-1) {
//			System.out.print((char)b);
//		}
//		fis.close();		
		
//		byte[] arr=new byte[(int)new File("assets/info.txt").length()];
//		fis.read(arr);
//		fis.close();
//		System.out.println(new String(arr));
		
		
		//Object Stream reading & writing
		
//		Bottle b1=new Bottle(1,"Cello",700,"blue");
//		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("assets/bottleInfo.txt"));
//		oos.writeObject(b1);
//		oos.close();
		
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("assets/bottleInfo.txt"));
		Bottle b1=(Bottle)ois.readObject();
		ois.close();
		System.out.println(b1);
		
		
	}
}
