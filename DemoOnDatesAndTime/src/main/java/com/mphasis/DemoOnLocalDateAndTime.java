package com.mphasis;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DemoOnLocalDateAndTime {

	public static void main(String[] args) {
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println(dateTime);
		
		//LocalDateTime to given pattern
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime lt=LocalDateTime.of(2024,11,22,15,45,40);
		String formattedTime=dtf.format(lt);
		System.out.println(formattedTime);
		
		String s1="2024-11-22 15:45:40";
		LocalDateTime parsed=LocalDateTime.parse(s1,dtf);
		System.out.println(parsed);
		
		

	}

}
