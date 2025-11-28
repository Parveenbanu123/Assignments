package com.mphasis;


import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DemoOnLocalTime {

	public static void main(String[] args) {
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		
		LocalTime t1=LocalTime.of(22, 30);
		System.out.println(t1);
		
		LocalTime t2=LocalTime.of(12,30, 50);
		System.out.println(t2);
		
		
		System.out.println(time.getHour());
		System.out.println(time.getMinute());
		System.out.println(time.getSecond());
		System.out.println(time.toString());
		
		
		//use isBefore,isAfter
		LocalTime t3=LocalTime.of(11, 11);
		LocalTime t4=LocalTime.of(14, 35);
		System.out.println(t3.isBefore(t4));
		System.out.println(t3.isAfter(t4));
		
		//comparing two times
		System.out.println(t3.compareTo(t4));
		
		//convert str to local time
		String str="11:35:20";
		LocalTime convertedTime=LocalTime.parse(str);
		System.out.println(convertedTime);
		
		//convert to specific format
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("hh:mm:ss a");
		String formattedTime=time.format(dtf);
		System.out.println(formattedTime);
		System.out.println(LocalTime.MIN);
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.NOON);
	}

}
