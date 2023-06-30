package com.customer;

public class customer {

	private String customerName;
	private String email;
	private String phone;
	private String nicNumber;
	private String userName;
	private String password;
	public customer(String customerName, String email, String phone, String nicNumber, String userName,
			String password) {
		
		this.customerName = customerName;
		this.email = email;
		this.phone = phone;
		this.nicNumber = nicNumber;
		this.userName = userName;
		this.password = password;
	}
	public String getCustomerName() {
		return customerName;
	}

	public String getEmail() {
		return email;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getNicNumber() {
		return nicNumber;
	}
	
	public String getUserName() {
		return userName;
	
	}
	public String getPassword() {
		return password;
	}
	
	
	
	
	
}
