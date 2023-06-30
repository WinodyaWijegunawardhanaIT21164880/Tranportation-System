package com.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
public class customerDBUtil {

	public static List<customer> validate (String userName,String password ){
		
		
		ArrayList<customer> cus= new ArrayList<> ();
		
		//Create Database Connection 
		
		
		 String url ="jdbc:mysql//localhost:3306/DropMe";
		 String user ="root ";
		 String pass ="Chamod210804#";
		 
		 
		 
		 
		//Validate 
		
		try {
			
			Class.forName("com.jdbc.Driver");
			
			Connection con = DriverManager.getConnection(url, user, pass);
			
			Statement stmt = con.createStatement();
			
			String sql ="select * from customer where userName ='"+userName+"'and pssword = '"+password+"'";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			
			if (rs.next()) {
				String nicNumber =rs.getString(1);
				String customerName =rs.getString(2);
				String email =rs.getString(3);
				String phone =rs.getString(4);
				String UserN =rs.getString(5);
				String Pass =rs.getString(6);
				
				customer c = new customer(customerName,email,phone,nicNumber,userName,password);
				cus.add(c);
				
			}
		}
		 
		catch (Exception e) {
			e.printStackTrace();
		}
		 
		
		return cus;
	}
	
	public static boolean SignupServlet(String nic, String name,String email,String phone,String username,String password) {
		boolean isSuccess = false;
		
		
		// Create Database Connection 
		
		
		 String url ="jdbc:mysql//localhost:3306/DropMe";
		 String user ="root";
		 String pass ="Chamod210804#";
		
		
		 try {
			 
			 Class.forName("com.jdbc.Driver");
				
				Connection con = DriverManager.getConnection(url,user,pass);
				
				Statement stmt = con.createStatement();
				
				String sql = "insert into customer values('"+nic+"','"+name+"','"+email+"','"+phone+"','"+username+"','"+password+"')";	
			
				int rs = stmt.executeUpdate(sql);
				
				if (rs > 0) {
					isSuccess =true;
					
				}
				
				
				else {
					
					isSuccess =false;
				}
			 
		 }
		 
		 catch (Exception e) {
				e.printStackTrace();
			}
		 
		 
		
		return isSuccess;
		
	}
	
	
	public static boolean payment(String cname,String cardnumber,String cvv,String month,String year) {
		boolean isSuccess = false;
	
	// Create Payment Database Connection 
	
	
			 String url ="jdbc:mysql//localhost:3306/DropMe";
			 String user ="root ";
			 String pass ="Chamod210804#";
			
			
			 try {
				 
				 Class.forName("com.jdbc.Driver");
					
					Connection con = DriverManager.getConnection(url, user, pass);
					
					Statement stmt = con.createStatement();
					
					String sql = "insert into payment values('"+cname+"','"+cardnumber+"','"+cvv+"','"+month+"','"+year+"')";	
				
					int rs = stmt.executeUpdate(sql);
					
					if (rs > 0) {
						isSuccess =true;
						
					}
					
					
					else {
						
						isSuccess =false;
					}
				 
			 }
			 
			 catch (Exception e) {
					e.printStackTrace();
				}
			 
			 
			
			return isSuccess;
			
		}
	
	public static boolean contactus(String name,String email,String phone,String messege) {
		boolean isSuccess = false;
	
	// Create  Contact Us Database Connection 
	
	
			 String url ="jdbc:mysql//localhost:3306/DropMe";
			 String user ="root ";
			 String pass ="Chamod210804#";
			
			
			 try {
				 
				 Class.forName("com.jdbc.Driver");
					
					Connection con = DriverManager.getConnection(url, user, pass);
					
					Statement stmt = con.createStatement();
					
					String sql = "insert into contactus values('"+name+"','"+email+"','"+phone+"','"+messege+"')";	
				
					int rs = stmt.executeUpdate(sql);
					
					if (rs > 0) {
						isSuccess =true;
						
					}
					
					
					else {
						
						isSuccess =false;
					}
				 
			 }
			 
			 catch (Exception e) {
					e.printStackTrace();
				}
			 
			 
			
			return isSuccess;
			
		}
	
} 


