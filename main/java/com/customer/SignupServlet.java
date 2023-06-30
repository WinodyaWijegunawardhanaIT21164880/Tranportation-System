package com.customer;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nic =request.getParameter("nic");
		String name =request.getParameter("name");
		String email =request.getParameter("email");
		String phone =request.getParameter("phone");
		String username =request.getParameter("username");
		String password=request.getParameter("password");
	
		
		boolean isTrue;
		
		isTrue= customerDBUtil.SignupServlet( nic,name , email , phone , username , password);
		
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
