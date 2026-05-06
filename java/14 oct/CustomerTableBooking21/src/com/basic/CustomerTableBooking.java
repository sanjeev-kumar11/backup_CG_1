package com.basic;

import java.util.Date;

public class CustomerTableBooking {

	private Long id;
	private String name,mobileNumber;
	private String birthDate,dateEnrolled;
	private Double averageSpendAmount,totalAmount,rating;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public String setBirthDate(String birthDate) {
		this.birthDate = birthDate;
		return this.birthDate;
	}
	public int getDateEnrolled() {
		return dateEnrolled;
	}
	public String setDateEnrolled(String dateEnrolled) {
		this.dateEnrolled = dateEnrolled;
		return this.birthDate;
	}
	public Double getAverageSpendAmount() {
		return averageSpendAmount;
	}
	public void setAverageSpendAmount(Double averageSpendAmount) {
		this.averageSpendAmount = averageSpendAmount;
	}
	public Double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Double getRating() {
		return rating;
	}
	public void setRating(Double rating) {
		this.rating = rating;
	}
	
	public CustomerTableBooking(Long id, String name, String mobileNumber, String birthDate, 
			Double averageSpendAmount, Double totalAmount,String dateEnrolled, Double rating) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.birthDate = birthDate;
		this.dateEnrolled = dateEnrolled;
		this.averageSpendAmount = averageSpendAmount;
		this.totalAmount = totalAmount;
		this.rating = rating;
	}
	
	public CustomerTableBooking() {
		//default constructor
		System.out.println(id,name,mobileNumber,birthDate,averageSpendAmount,totalAmount,dateEnrolled,rating);
	}
	
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", birthDate=" + birthDate
				+  ", averageSpendAmount="+  averageSpendAmount + ", totalAmount="
				+ totalAmount +", dateEnrolled=" + dateEnrolled + ", rating=" + rating + "]";
	}
	
	public boolean Equals(String name,String mobileNumber,String dateOfBirth) {
		if(this.name==name && this.mobileNumber==mobileNumber && this.birthDate==dateOfBirth) {
			return true;
		}
		else {
			return false;
		}
	}
	

	
}
