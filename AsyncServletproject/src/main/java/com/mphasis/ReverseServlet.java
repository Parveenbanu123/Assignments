package com.mphasis;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReverseServlet
 */
@WebServlet(urlPatterns = "/ReverseServlet",asyncSupported = true)
public class ReverseServlet extends HttpServlet {
	private static final ExecutorService executor=Executors.newFixedThreadPool(3);

	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ReverseServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState()+"\n");
		AsyncContext ac=request.startAsync();
		String str=request.getParameter("input");
		PrintWriter out=ac.getResponse().getWriter();
		Future<String> upper=executor.submit(()->{
			try {
				Thread.sleep(2000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			return "\nUpperCase:  "+str.toUpperCase()+"  (Thread: "+Thread.currentThread().getName()+" )";
		});
		
		Future<String> reverse=executor.submit(()->{
			try {
				Thread.sleep(4000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			return "\nReverse:  "+new StringBuilder(str).reverse()+"  (Thread: "+Thread.currentThread().getName()+" )";
		});
		
		Future<String> length=executor.submit(()->{
			try {
				Thread.sleep(6000);
			}catch(Exception e) {
				e.printStackTrace();
			}
			return "\nLength:  "+str.length()+"  (Thread: "+Thread.currentThread().getName()+" )";
		});
		
		executor.submit(()->{
			try {
				out.println(upper.get()+"<br><br>");
				out.println(reverse.get()+"<br><br>");
				out.println(length.get()+"<br><br>");
				out.println("Final worker Thread:   "+Thread.currentThread().getName());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			ac.complete();
		});
	}
	@Override
	public void destroy() {
		executor.shutdown();
	}

}
