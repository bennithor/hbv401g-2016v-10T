package trips01;

public class DayToursData {

	private String date;
	private String location;
	
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
	
	
	public void setDate(String _date) {
		date = _date;
	}
	
	public DayToursData(String _date, String loc) {
		date = _date;
		location = loc;
	}
	
}
