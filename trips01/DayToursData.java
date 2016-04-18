package trips01;
import dayTourSearch.*;

public class DayToursData {

	private int minPrice;
	private int maxPrice;
	private int ageRestriction;
	private String location;
	private double stars;
	private String departureTime;
	private int seatsAvailable;
	private boolean[] daysOfWeek;
	private int searchBy;
	dayTourSearch.DayTourSearch session = new dayTourSearch.DayTourSearch();
	dayTourSearch.DayTours[] tours;
	
	
	public void search() {
		if (searchBy == 0) {
			tours = session.search(minPrice, maxPrice);
		}
		else if (searchBy == 1) {
			tours = session.search("filler", ageRestriction);
		}
		else if (searchBy == 2) {
			tours = session.search("filler", location);
		}
		else if (searchBy == 3) {
			tours = session.search(stars);
		}
		else if (searchBy == 4) {
			tours = session.search(departureTime);
		}
		else if (searchBy == 5) {
			tours = session.search(seatsAvailable);
		}
		else if (searchBy == 6) {
			tours = session.search(daysOfWeek);
		}
		else if (searchBy == 7) {
			tours = session.search(minPrice,maxPrice,ageRestriction);
		}
	}
	
	
	/*
	public String findDayTours() {
		if(location.equalsIgnoreCase("Iceland")) {
			if(date.equalsIgnoreCase("14.03.16")) {
				return "Hiking trip";
			}
			else if(date.equalsIgnoreCase("15.03.16")) {
				return "Snowmobile trip";
			}
			else return "No trips for that date";
		}
		else return "No trips for that location";
	}
	*/
	
	
	public DayToursData(int _minPrice, int _maxPrice, int _ageRestriction, String _loc, double _stars, String _departureTime, int _seatsAvailable, boolean[] _daysOfWeek, int _searchBy) {
		minPrice = _minPrice;
		maxPrice = _maxPrice;
		ageRestriction = _ageRestriction;
		location = _loc;
		departureTime = _departureTime;
		seatsAvailable = _seatsAvailable;
		daysOfWeek = _daysOfWeek;
		searchBy = _searchBy;
	}
	
}
