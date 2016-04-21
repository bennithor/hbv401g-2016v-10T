package trips01;
import java.io.IOException;
import hotelSearch.*;
import dayTourSearch.*;
import java.text.ParseException;

import hotelSearch.*;

public class TripLogic {
	
	private HotelsData hotelsData;
	private DayToursData toursData;
	private FlightsData flightData;
	
	
	public TripLogic() {
		toursData = new DayToursData();
	}
	
	public void HotelSearch(String _loc, String _date, String _hotelName, int _nrOfNights, int _minStars, int _MaxPrice, int[] _arr ) throws ParseException, IOException {
		hotelsData = new HotelsData(_loc, _date, _hotelName, _nrOfNights, _minStars, _MaxPrice, _arr);
		hotelsData.search();
	}
	
	public void FlightSearch(double minPrice, double maxPrice, String date, String dest) {
		flightData = new FlightsData(minPrice, maxPrice, date, dest);
		flightData.search();
	}
	
	public void DayTourSearch () {
		toursData.search();
	}
	
	public HotelsData GetHotelData() {
		return hotelsData;
	}
	
	
	public DayToursData GetDayToursData() {
		return toursData;
	}
	
	public FlightsData GetFlightData() {
		return flightData;
	}
	
	
	public void BookHotel(String bookingName, int i) throws ParseException {
		hotelsData.book(hotelsData.getHotels()[i], bookingName);
	}
	
	public void BookDayTour(int adults, int children, String bookingName, int i) {
		toursData.book(toursData.getTours()[i], adults, children, bookingName);
	}

}
