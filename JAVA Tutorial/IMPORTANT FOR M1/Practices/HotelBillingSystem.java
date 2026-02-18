interface Room{
	public double calculateTotalBill(int nightsStayed, int joiningYear);
	public int calculateMembershipYears(int joiningYear);
}
class HotelRoom implements Room{
	String roomType;
	double ratePerNight;
	String guestName;
	public HotelRoom(String roomType, double ratePerNight, String guestName) {
		super();
		this.roomType = roomType;
		this.ratePerNight = ratePerNight;
		this.guestName = guestName;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public double getRatePerNight() {
		return ratePerNight;
	}
	public void setRatePerNight(double ratePerNight) {
		this.ratePerNight = ratePerNight;
	}
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	@Override
	public double calculateTotalBill(int nightsStayed, int joiningYear) {
	}
	@Override
	public int calculateMembershipYears(int joiningYear) {
	}
	
	
}
public class HotelBillingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
