package com.mphasis;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.swing.text.DateFormatter;

public class DemoOnLocalDates {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		System.out.println(today);
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue());
		System.out.println(today.getYear());
		System.out.println(today.getDayOfWeek());
		
		LocalDate mydate=LocalDate.of(2025, 10, 02);
		System.out.println(mydate);
		
		System.out.println("3 days ahead date is : "+today.plusDays(3));
		System.out.println("3 days before date is :"+today.minusDays(3));
		
		
		LocalDate d1=LocalDate.of(2003, 10, 02);
		LocalDate d2=LocalDate.of(2003, 11, 07);
		System.out.println(d1+" "+d2);
		System.out.println(d1.isBefore(d2));
		
		//converting str to localdate
		String s="2024-04-19";
		LocalDate ldate=LocalDate.parse(s);
		System.out.println(ldate);
		
		//converting localdate to sql date
		Date sqldate=java.sql.Date.valueOf(ldate);
		System.out.println(sqldate);
		//convert local to util date
		
		//converting local date to a given format
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd:MM:yyyy");
		String formatted=today.format(df);
		System.out.println(formatted);
		
		today=LocalDate.now();
		LocalDate dob=LocalDate.of(2003, 10, 02);
		Period p=Period.between(dob, today);
		System.out.println("My age is "+p.getYears()+" years "+p.getMonths()+" months "+p.getDays()+" days");
		
	}

}
