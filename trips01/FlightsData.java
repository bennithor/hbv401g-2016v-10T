package trips01;

public class FlightsData {
	
	private String location;
	private String destination;
	private String date;
	
	public String findFlights() {
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
	
	
	
	public void setDate(String _date) {
		date = _date;
	}
	
	public FlightsData(String _date, String loc, String dest) {
		date = _date;
		location = loc;
		destination = dest;
	}

}
