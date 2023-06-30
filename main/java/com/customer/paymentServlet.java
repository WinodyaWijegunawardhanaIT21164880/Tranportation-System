package com.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class paymentServlet
 */
@WebServlet("/paymentServlet")
public class paymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String cname =request.getParameter("cname");
		String cardnumber =request.getParameter("cardnumber");
		String cvv =request.getParameter("cvv");
		String expiremonth =request.getParameter("month");
		String expireyear =request.getParameter("year");
		
		
		
		boolean isTrue;
		
		isTrue= customerDBUtil.payment( cname , cardnumber , cvv ,  expiremonth , expireyear );
		
		if(isTrue == true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			
			dis.forward(request, response);
			
			
		}
			
			else {
				
				RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
				
				dis2.forward(request, response);
				
				
			
		

			
		}
		
		
		
	}

}
