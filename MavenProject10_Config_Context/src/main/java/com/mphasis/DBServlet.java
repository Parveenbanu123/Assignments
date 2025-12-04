package com.mphasis;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class DBServlet
 */
//@WebServlet("/DBServlet")
public class DBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * Default constructor. 
     */
    public DBServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//ServletConfig config=getServletConfig();
		response.setContentType("text/html; charset=UTF-8");
		ServletContext context=getServletContext();
		PrintWriter out=response.getWriter();
		String url=context.getInitParameter("url");
		String uname=context.getInitParameter("uname");
		String pwd=context.getInitParameter("pwd");
		String driver=context.getInitParameter("driver");
		
		int id=Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
        String email = request.getParameter("email");
		try {
			Class.forName(driver);
			Connection con=DriverManager.getConnection(url,uname,pwd);
			if(con!=null) {
				System.out.println("Connected Successfully");
			}
			//Inserting Data
			PreparedStatement ps = con.prepareStatement("INSERT INTO customer(customerId,customerName,address,phoneNumber,email) VALUES (?,?,?,?, ?)");
				
				ps.setInt(1, id);
               ps.setString(2, name.trim());
               ps.setString(3, address.trim());
               ps.setString(4, phone.trim());
               ps.setString(5, email.trim());
               int rows = ps.executeUpdate();

               if (rows > 0) {
                   out.println("<h3>User inserted successfully!</h3>");
               } else {
                   out.println("<h3>Insertion failed!</h3>");
               }
               
               response.sendRedirect("display.jsp");
               
               Statement st=con.createStatement();
               
               
               
               //Deleting Data
               int a=st.executeUpdate("delete from customer where customerId=1035");
               out.print("<br>"+a+" row deleted successfully");
               
               
               
              
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		


	}
        


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
