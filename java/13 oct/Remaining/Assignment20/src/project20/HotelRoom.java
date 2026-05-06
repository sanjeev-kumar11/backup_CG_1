package project20;
public class HotelRoom {
	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	int ratePerSqFeet;
	int res;

	public HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	public HotelRoom() {
		
	}
	public int calculateTariff(int ratePerSqFeet, int numberOfSqFeet) 
	{
		res = ratePerSqFeet/numberOfSqFeet;
		return res;
	}
	public int getRatePerSqFeet() {
		
		return 0;
	}
}
