package trips01;
import flightSearch.*;

public class FlightsData {
	
	private String destination;
	private String date;
	private double minPrice;
	private double maxPrice;
	private FlightSearch session = new FlightSearch();
	private Flight[] flights;
	
	public Flight[] getFlight() {
		return flights;
	}
	
	public void search() {
		session.setDate(date);
		session.setDestination(destination);
		session.setPriceRange(minPrice, maxPrice);
		flights = session.search();
	}
	
	
	public FlightsData(double _minPrice, double _maxPrice, String _date, String _destination) {
		destination = _destination;
		date = _date;
		minPrice = _minPrice;
		maxPrice = _maxPrice;
	}
	

}
