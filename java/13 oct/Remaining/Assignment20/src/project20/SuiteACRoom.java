package project20;

public class SuiteACRoom extends HotelRoom{

	private int ratePerSqFeet;
	public SuiteACRoom() {
		this.ratePerSqFeet = 15;
	}
	public void HotelRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi) {
		
	}
	public int getRatePerSqFeet(boolean hasWifi) {
		if (hasWifi == true) {
			return ratePerSqFeet + 2;
		}
		return ratePerSqFeet;
		}
}
