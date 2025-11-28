package com.mphasis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcCrudApp {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");
        
        String uname="root";
        String pwd="root@39";
        String url="jdbc:mysql://localhost:3306/mysql_proj";
        try (Connection con=DriverManager.getConnection(url,uname,pwd);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select * from customer");){
			
				
				//Insert record
//        	String query="insert into customer values(?,?,?,?,?)";
//        	PreparedStatement ps=con.prepareStatement(query);
//        	ps.setInt(1, 1016);
//        	ps.setString(2, "Parveen banu");
//        	ps.setString(3, "Coimbatore, TamilNadu");
//        	ps.setString(4, "9876543210");
//        	ps.setString(5, "parveen.banu@example.com");
//        	
//        	ps.executeUpdate();
//			System.out.println("Row inserted successfully");
				
				
				
				//Update Record
        	String query="update  customer set phoneNumber=? where customerId=?";
        	PreparedStatement ps=con.prepareStatement(query);
        	ps.setString(1,"9234567890");
        	ps.setInt(2, 1006);
        	ps.executeUpdate();
        	System.out.println("Row updated successfully");
        	
        	//delete record
        	
        	String s="delete from customer where customerId=?";
        	PreparedStatement ps1=con.prepareStatement(s);
        	ps1.setInt(1, 1001);
        	ps1.executeUpdate();
        	System.out.println("Row deleted");

        	ResultSet rs1=st.executeQuery("Select * from customer");
        	ResultSetMetaData rsmd=rs1.getMetaData();
        	int colCount=rsmd.getColumnCount();
        	//System.out.println(colCount);
        	while(rs1.next()) {
        		for(int i=1;i<=colCount;i++)
        			System.out.println(rsmd.getColumnName(i)+" : "+rs1.getString(rsmd.getColumnName(i)));
        		System.out.println("-------------------------------------------");
        	}
        }	
	}

}
