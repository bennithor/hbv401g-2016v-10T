package trips01;
import hotelSearch.*;
import dayTourSearch.*;

public class TripData {

	private String startDate;
	private String endDate;
	private String toIceland;  //Flight
	private String fromIceland; //Flight
	private float totalPrice;
	private Hotel[] hotelsToStay; //Hotels
	private DayTours[] tours; //Daytours
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
	
	public Hotel[] getHotelsToStay() {
		return hotelsToStay;
	}
	
	public void setHotelsToStay(Hotel[] hotels) {
		hotelsToStay = hotels;
	}
	
	public DayTours[] getTours() {
		return tours;
	}
	
	public void setTours(DayTours[] dayTours) {
		tours = dayTours;
	}
	
	public TripData() {
		
	}
	
}
