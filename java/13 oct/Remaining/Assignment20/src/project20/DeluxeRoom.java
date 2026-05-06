package project20;

public class DeluxeRoom extends HotelRoom
{
	
	protected int ratePerSqFeet;

	public DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi)
	{
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		
	}
	public DeluxeRoom() {
		super();
		this.ratePerSqFeet = 10;
	}
	public void HotelRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi) {
		
	}
	public int getRatePerSqFeet(boolean hasWifi)
	{
		if (hasWifi == true) 
		{
			return ratePerSqFeet + 2;
		}
		return ratePerSqFeet;
		}
	
}