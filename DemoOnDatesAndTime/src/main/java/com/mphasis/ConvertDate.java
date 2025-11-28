package com.mphasis;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//import java.sql.Date;

public class ConvertDate {

	public static void main(String[] args) throws ParseException {
		
//		Date date=new Date(2025-1900,10,24);
//		System.out.println(date);
//		System.out.println(new java.util.Date());
//		java.util.Date utildate=new java.util.Date();
		
		Date today=new Date();
		java.sql.Date sqldate=new java.sql.Date(today.getTime());
		System.out.println(today);
		System.out.println(sqldate);
		
		//util to sql using SDF
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		String formatDate=sdf.format(today);
		sqldate=java.sql.Date.valueOf(formatDate);
		System.out.println(sqldate);
		
		//converting str to util date then to sql date
		String s="15-08-2025";
		sdf=new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date uDate=sdf.parse(s);
		java.sql.Date sdate=new java.sql.Date(uDate.getTime());
		System.out.println(uDate);
		System.out.println(sdate);
		
		//convert sql to util
		java.sql.Date d1=java.sql.Date.valueOf("2025-11-24");
		java.util.Date u1=new java.util.Date(d1.getTime());
		java.util.Date u2=d1;
		System.out.println(d1);
		System.out.println(u1);
		System.out.println(u2);
		
		//using SDF to convert util to sql
		java.sql.Date d2=java.sql.Date.valueOf("2025-10-02");
		String str=d2.toString();
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf2.parseObject(str));
		
		
		//convert str to sql then to util
		
		String mydate="2023-06-26";
		d2=java.sql.Date.valueOf(mydate);
		System.out.println(d2);
		u1=new java.util.Date(d2.getTime());
		System.out.println(u1);
		
		
		

	}

}
