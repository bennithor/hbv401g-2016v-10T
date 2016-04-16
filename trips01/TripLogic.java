package trips01;

public class TripLogic {

	private String startDate;
	private String endDate;
	private String location;
	private String destination;
	private FlightsData flightSearch;
	private HotelsData hotelSearch;
	private DayToursData dayTourSearch;
	private TripData[] trips = new TripData[1];
	private int numberOfPeople;

	
	public void generateTrips() {
		trips[0] = new TripData();
		trips[0].setStartDate(startDate);
		trips[0].setEndDate(endDate);
		trips[0].setToIceland(flightSearch.findFlights());
		flightSearch.setDate(endDate);
		trips[0].setFromIceland(flightSearch.findFlights());
		String[] hotels  = new String[2];
		hotels[0] = hotelSearch.findHotels();
		hotelSearch.setDate(endDate);
		hotels[1] = hotelSearch.findHotels();
		trips[0].setHotelsToStay(hotels);
		String[] tours = new String[2];
		tours[0] = dayTourSearch.findDayTours();
		dayTourSearch.setDate(endDate);
		tours[1] = dayTourSearch.findDayTours();
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
		hotelSearch = new HotelsData(StartDate, destination);
		dayTourSearch = new DayToursData(StartDate, destination);
		trips = new TripData[1];
		
		generateTrips();
	}
	
}
