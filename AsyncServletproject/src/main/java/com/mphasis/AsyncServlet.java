package com.mphasis;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AsyncServlet
 */
@WebServlet(urlPatterns="/AsyncServlet",asyncSupported =true)
public class AsyncServlet extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	private static final ExecutorService executor=Executors.newSingleThreadExecutor();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AsyncServlet() {
        super();
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
		System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());
		AsyncContext ac=request.startAsync();
		executor.submit(()->{
			try {
				Thread.sleep(1000);
				
				String uname=request.getParameter("uname");
				String pwd=request.getParameter("pwd");
				if (uname.equals("Parveen") && pwd.equals("12345")) {
					response.getWriter().println("Authentication Successfull,Async OK");
				}
				else {
					response.getWriter().println("Authentication failed,Async login failed");
				}
				System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getState());

			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				ac.complete();
			}
		});
	}

}
