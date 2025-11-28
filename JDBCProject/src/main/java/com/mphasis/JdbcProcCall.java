package com.mphasis;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class JdbcProcCall {

	public static void main(String[] args) throws ClassNotFoundException {
		 Class.forName("com.mysql.cj.jdbc.Driver");
	        System.out.println("Driver Loaded");
	        
	        String uname="root";
	        String pwd="root@39";
	        String url="jdbc:mysql://localhost:3306/mysql_proj";
	        try( Connection con=DriverManager.getConnection(url,uname,pwd);
	        		Statement st=con.createStatement();
	        		
	        		
	        	){
	        	
	        	CallableStatement cs=con.prepareCall("{call retrieve_emp()}");
	        	ResultSet rs=cs.executeQuery();
	        	ResultSetMetaData rsmd=rs.getMetaData();
	        	int colCount=rsmd.getColumnCount();
	        	while(rs.next()) {
	        		for(int i=1;i<=colCount;i++)
	        			System.out.println(rsmd.getColumnName(i)+" : "+rs.getString(rsmd.getColumnName(i)));
	        		System.out.println("-------------------------------------------");
	        	}
	        }catch(Exception e) {
	        	System.out.println(e);
	        }

	}

}
