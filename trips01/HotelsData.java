package trips01;
import java.io.IOException;
import java.text.ParseException;
import hotelSearch.*;
public class HotelsData {

	private String hotelLocation;
	private String date;
	private int nrOfNights;
	private String hotelName;
	private int minStars;
	private int MaxPrice;
	private int[] arr = new int[4];
	hotelSearch.UserInterface session = new hotelSearch.UserInterface();
	private Hotel[] hotel;
	
	
	
	public void search() throws ParseException, IOException {
		System.out.println(date);
		hotel = session.searchHotel(date, nrOfNights, hotelLocation, hotelName,minStars,MaxPrice,arr);
	}
	
	
	public void disp() {
		session.displayResult(hotel);
	}
	/*
	public String findHotels() {
		if(location.equalsIgnoreCase("Iceland")) {
			if(date.equalsIgnoreCase("14.03.16")) {
				return "Hotel Borg";
			}
			else if(date.equalsIgnoreCase("15.03.16")) {
				return "Hotel Saga";
			}
			else return "No hotels for that date";
		}
		else return "No hotels for that location";
	}*/
	
	
	public void setDate(String _date) {
		date = _date;
	}
	
	
	public HotelsData() {
		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 0;
		arr[3] = 0;
		date = "20160801";
		nrOfNights = 2;
		hotelLocation = "";
		hotelName = "Fo";
		minStars = 2;
		MaxPrice = -1;
		
		//date = _date;
		//location = loc;
	}
}
