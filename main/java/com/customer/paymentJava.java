package com.customer;

public class paymentJava {
	
	

	private String cname;
	private String cardnumber;
	private String cvv;
	private String month;
	private String year;
	
	
	
	public paymentJava(String cname, String cardnumber , String cvv, String month, String year)
			 {
		
		this.cname = cname;
		this.cardnumber = cardnumber;
		this.cvv = cvv;
		this.month = month;
		this.year= year;

	}
	public String getCustomerName() {
		return cname;
	}

	public String getEmail() {
		return cardnumber;
	}
	
	public String getPhone() {
		return cvv;
	}
	
	public String getNicNumber() {
		return month;
	}
	
	public String getUserName() {
		return year;
	
	}
	
	
	
}



