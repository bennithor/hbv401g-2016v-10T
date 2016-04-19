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
		System.out.println(date + " " + destination);
		System.out.println(minPrice);
		System.out.println(maxPrice);
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
	
	
	
	
	
	
/*	public String findFlights() {
		if(location.equalsIgnoreCase("Rome") && destination.equalsIgnoreCase("Iceland")) {
			if(date.equalsIgnoreCase("14.03.16")) {
				return "Flight A732";
			}
			else if(date.equalsIgnoreCase("15.03.16")) {
				return "Flight B221";
			}
			else return "No flights for that date";
		}
		else if (location.equalsIgnoreCase("Iceland") && destination.equalsIgnoreCase("Rome")) {
			if(date.equalsIgnoreCase("14.03.16")) {
				return "Flight A732";
			}
			else if(date.equalsIgnoreCase("15.03.16")) {
				return "Flight B221";
			}
			else return "No flights for that date";
		}
		else return "No flights to that place";
	}
	
	*/

}
