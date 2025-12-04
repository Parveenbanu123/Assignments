package com.mphasis;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
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
			//Updating Data
			String phone=request.getParameter("phone");
			int id=Integer.parseInt(request.getParameter("id"));
			 PreparedStatement st=con.prepareStatement("update customer set phoneNumber=? where customerId=?");
			 st.setString(1,phone );
			 st.setInt(2, id);
			 int ans=st.executeUpdate();
			 
            out.println("<br>"+ans+" updated Successfully");
            }
		 catch (ClassNotFoundException e) {
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
