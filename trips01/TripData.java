package trips01;

public class TripData {

	private String startDate;
	private String endDate;
	private String toIceland;  //Flight
	private String fromIceland; //Flight
	private float totalPrice;
	private String[] hotelsToStay; //Hotels
	private String[] tours; //Daytours
	private String location;
	private String destination;
	private int numberOfPeople;
	
	
	public String getStartDate() {
		return startDate;
	}
	
	public void setStartDate(String date) {
		startDate = date;
	}
	
	public String getEndDate() {
		return endDate;
	}
	
	public void setEndDate(String date) {
		endDate = date;
	}
	
	public String getToIceland() {
		return toIceland;
	}
	
	public void setToIceland(String flight) {
		toIceland = flight;
	}
	
	public String getFromIceland() {
		return fromIceland;
	}
	
	public void setFromIceland(String flight) {
		fromIceland = flight;
	}
	
	public float getTotalPrice() {
		return totalPrice;
	}
	
	public void addToTotalPrice(float price) {
		totalPrice += price;
	}
	
	public String[] getHotelsToStay() {
		return hotelsToStay;
	}
	
	public void setHotelsToStay(String[] hotels) {
		hotelsToStay = hotels;
	}
	
	public String[] getTours() {
		return tours;
	}
	
	public void setTours(String[] dayTours) {
		tours = dayTours;
	}
	
	public TripData() {
		
	}
	
}
