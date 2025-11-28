package com.mphasis;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoOnDatesAndTime {

	public static void main(String[] args) throws ParseException {
		
		Date currentDate=new Date();
		System.out.println(currentDate);
		
		long ms=System.currentTimeMillis();
		System.out.println(ms);
		Date currDateOfMS=new Date(ms);
		System.out.println(currDateOfMS);
		
		long l=1234567890123l;
		Date myDate=new Date(l);
		System.out.println(myDate);
		
		Date newDate=new Date((2003-1900),9,2);
		System.out.println(newDate);
		
		Date date1=new Date(2003-1900,9,2);
		Date date2=new Date(2003-1900,10,7);
		System.out.println(date1+" "+date2);
		System.out.println(date1.before(date2));//true
		
		
		System.out.println(currentDate.getDate()+3);
		System.out.println(currentDate.getDay());
		System.out.println(currentDate.getYear()+1900);
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		System.out.println(sdf.format(currentDate));
		
		String s="02-10-2003";
		SimpleDateFormat sdf1=new SimpleDateFormat("dd-MM-yyyy");
		Date sdate=sdf1.parse(s);
		System.out.println(sdate);
		
		System.out.println(currentDate.getYear()-sdate.getYear());
		System.out.println(sdate.toString());
		
	}

}
