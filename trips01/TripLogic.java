package trips01;
import java.io.IOException;
import hotelSearch.*;
import dayTourSearch.*;
import java.text.ParseException;

import hotelSearch.*;

public class TripLogic {
	
	private HotelsData hotelsData;
	private DayToursData toursData;
	private TripData tripData;
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
	
	
	public void SetSelectedHotel(int i) {
		System.out.println(hotelsData.getHotels()[i]);
		
	}
	
	public void SetSelectedTours(int i) {
		tripData.setTours(toursData.getTours()[i]);
	}
	
	
	public void BookHotel(String bookingName, int i) throws ParseException {
		hotelsData.book(hotelsData.getHotels()[i], bookingName);
	}
	
	public void BookDayTour(int adults, int children, String bookingName, int i) {
		toursData.book(toursData.getTours()[i], adults, children, bookingName);
	}

	public TripData getTripData() {
		return tripData;
	}
/*
	private String startDate;
	private String endDate;
	private String location;
	private String destination;
	private FlightsData flightSearch;
	private HotelsData hotelSearch;
	private DayToursData dayTourSearch;
	private TripData[] trips = new TripData[1];
	private int numberOfPeople;
	private hotelSearch.UserInterface hotelSession;

	
	public void generateTrips() {
		trips[0] = new TripData();
		trips[0].setStartDate(startDate);
		trips[0].setEndDate(endDate);
		trips[0].setToIceland(flightSearch.findFlights());
		flightSearch.setDate(endDate);
		trips[0].setFromIceland(flightSearch.findFlights());
		String[] hotels  = new String[2];
		//hotels[0] = hotelSearch.findHotels();
		hotelSearch.setDate(endDate);
		//hotels[1] = hotelSearch.findHotels();
		trips[0].setHotelsToStay(hotels);
		String[] tours = new String[2];
		//tours[0] = dayTourSearch.findDayTours();
		dayTourSearch.setDate(endDate);
		//tours[1] = dayTourSearch.findDayTours();
		trips[0].setTours(tours);
	}
	
	public TripData[] getTripData() {
		return trips;
	}
	
	public TripLogic(String StartDate, String EndDate, String loc, String dest, int number) {
		startDate = StartDate;
		endDate = EndDate;
		location = loc;
		destination = dest;
		numberOfPeople = number;
		
		flightSearch = new FlightsData(StartDate, location, destination);
	//	hotelSearch = new HotelsData(StartDate, destination);
	//	dayTourSearch = new DayToursData(StartDate, destination);
		trips = new TripData[1];
		
		generateTrips();
	}
	*/
}
