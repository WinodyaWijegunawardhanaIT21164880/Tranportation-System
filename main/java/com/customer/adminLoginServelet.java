package com.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/adminLoginServlet")
public class adminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		String username =request.getParameter("email");
		String password =request.getParameter("password");
		
		
		try {
			
		
			List<customer> cusDetails = customerDBUtil.validate(username,password);
			
			request.setAttribute("cusDtails",cusDetails);
		}
		
		catch (Exception e) {
			
			e.printStackTrace();
			}
	
		
		RequestDispatcher dis =request.getRequestDispatcher("UserAccount.jsp");
		dis.forward(request, response);
		
		
		
	}

}
 