package com.mphasis;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DemoOnZonedDateAndTime {

	public static void main(String[] args) {
		ZonedDateTime dateTime=ZonedDateTime.now();
		System.out.println(dateTime);
		
		System.out.println(dateTime.getZone());
		System.out.println(dateTime.getOffset());
		System.out.println(dateTime.getChronology());
		//all get methods
		System.out.println(dateTime.getDayOfMonth());
		System.out.println(dateTime.getDayOfYear());
		System.out.println(dateTime.getHour());
		System.out.println(dateTime.getMinute());
		System.out.println(dateTime.getMonthValue());
		System.out.println(dateTime.getSecond());
		System.out.println(dateTime.getYear());
		System.out.println(dateTime.getDayOfWeek());
		System.out.println(dateTime.getMonth());

		
		ZonedDateTime regionDateTime=ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(regionDateTime);
		System.out.println(dateTime);
		
		
		//Duration diff=Duration.between(dateTime.toInstant(), regionDateTime.toInstant());
		
		int diffSeconds=dateTime.getOffset().getTotalSeconds()-regionDateTime.getOffset().getTotalSeconds();
		int hours=diffSeconds/3600;
		int mins=(diffSeconds%3600)/60;
		System.out.println("Difference is :"+hours+" hours "+mins+" minutes");
		
		//convert localdatetime to zoneddatetime
		LocalDateTime ldt=LocalDateTime.now();
		ZonedDateTime zdt=ldt.atZone(ZoneId.of("Asia/Kolkata"));
		System.out.println(zdt);
		System.out.println(zdt.toLocalDateTime());//zoneddatetime tp localdatetime
		
		//convert indian time to US time
		ZonedDateTime india=ZonedDateTime.now();
		ZonedDateTime us=india.withZoneSameInstant(ZoneId.of("America/New_York"));
		System.out.println(india);
		System.out.println(us);
		
		//formatting zoneddatetime to our pattern
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a z");
		String formattedZonedDateTime=india.format(dtf);
		System.out.println(formattedZonedDateTime);
		System.out.println(regionDateTime.format(dtf));
		
		
		
		

	}

}
