package com.mphasis;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Servlet implementation class DisplayServlet
 */
@WebServlet("/DisplayServlet")
public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");
		ServletContext context=getServletContext();
		PrintWriter out=response.getWriter();
		String url=context.getInitParameter("url");
		String uname=context.getInitParameter("uname");
		String pwd=context.getInitParameter("pwd");
		String driver=context.getInitParameter("driver");
		
		
		try {
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url,uname,pwd);
			if(con!=null) {
				System.out.println("Connected Successfully");
			}
			//Retrieving Data
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("Select * from customer");
            while(rs.next()) {
         	   out.println("----------------------------------------------<br>");
         	   out.println("Customer Id: "+rs.getInt(1)+"<br>");
         	   out.println("Customer Name:"+rs.getString(2)+"<br>");
         	   out.println("Address:"+rs.getString(3)+"<br>");
         	   out.println("Phone Number:"+rs.getString(4)+"<br>");
         	   out.println("Email:"+rs.getString(5)+"<br>");
         	   out.println("------------------------------------------------");
         	   
            }
            response.sendRedirect("update.jsp");
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
