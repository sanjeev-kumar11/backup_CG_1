package project20;

import java.util.Scanner;

public class Test {

	//public static DeluxeRoom dr;1
	static int ratePerSqFeet;
	public boolean nextBoolean() {
		return false;
	}
	
	public static void main(String[] args) {
		
		DeluxeRoom dr = new DeluxeRoom();
		HotelRoom hr = new HotelRoom();
		System.out.println("Hotel Tariff Calculator");
		System.out.println();
		System.out.println("1.Deluxe Room");
		System.out.println("2. Deluxe AC Room");
		System.out.println("3. Suite AC Room");

		System.out.println("Select Room Type: ");
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();
		boolean hasTV,hasWifi;
		
		switch(ch) {
		case 1:
		System.out.println("Hotel Name:");
		String hotelName = sc.next();
		System.out.println("Room Square Feet Area:");
		int numberOfSqFeet = sc.nextInt();
		System.out.println("Room has TV (yes/no):");
		if ((sc.next()).equals("yes")){
			hasTV=true;
		}
		else {
			hasTV=false;
		}
		System.out.println("Room has Wifi (yes/no) :");
		if ((sc.next()).equals("yes")){
			hasWifi=true;
		}
		else {
			hasWifi=false;
		}
		ratePerSqFeet = dr.getRatePerSqFeet(hasWifi);
		System.out.println("Room Tariff per day is: "+hr.calculateTariff(ratePerSqFeet, numberOfSqFeet));
		break;
	}
	}
}