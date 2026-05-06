package com.basic;

import java.util.Scanner;

public class TestCustomerTableBooking {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		boolean sameStatus;
		
		System.out.println("Enter the deatils of Customer 1: ");
		String c1Details=sc.next();
		String []c1arr= c1Details.split(",");
		CustomerTableBooking customer1=new CustomerTableBooking(Long.parseLong(c1arr[0]),c1arr[1],c1arr[2],c1arr[3],Double.parseDouble(c1arr[4]),Double.parseDouble(c1arr[5]),c1arr[6],Double.parseDouble(c1arr[7]));
		//System.out.println(c1Details);
		
		System.out.println("Enter the Details of customer 2: ");
		String c2Details=sc.next();
		String []c2arr= c2Details.split(",");
		CustomerTableBooking customer2=new CustomerTableBooking(Long.parseLong(c2arr[0]),c2arr[1],c2arr[2],c2arr[3],Double.parseDouble(c2arr[4]),Double.parseDouble(c2arr[5]),c2arr[6],Double.parseDouble(c2arr[7]));
		
		
		sameStatus=customer2.Equals(customer1.getName(), customer1.getMobileNumber(), customer1.getBirthDate());
		if(sameStatus==true) {
			System.out.println("You have Entered the Same Details!!");
		}
		else {
			System.out.println(customer1);
			System.out.println(customer2);
		}
		
		
	}

}
