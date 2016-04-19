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
	
	
	public void disp() {
		session.displayResult(hotel);
	}
	
	
	public void search() throws ParseException, IOException {
		hotel = session.searchHotel(date, nrOfNights, hotelLocation, hotelName,minStars,MaxPrice,arr);
	}
	
	public Hotel[] getHotels() {
		return hotel;
	}
	
	public void setDate(String _date) {
		date = _date;
	}
	
	public void book(Hotel hotel, String bookingName) throws ParseException {
		session.bookHotel(hotel, date, nrOfNights, bookingName, arr);
	}
	
	
	
	public HotelsData(String _loc, String _date, String _hotelName, int _nrOfNights, int _minStars, int _MaxPrice, int[] _arr ) {
		date = _date;
		nrOfNights = _nrOfNights;
		hotelLocation = _loc;
		hotelName = _hotelName;
		minStars = _minStars;
		MaxPrice = _MaxPrice;
		arr = _arr;
		
	}
}
