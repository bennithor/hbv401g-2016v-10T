package trips01;

public class HotelsData {

	private String location;
	private String date;
	
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
	}
	
	
	public void setDate(String _date) {
		date = _date;
	}
	
	
	public HotelsData(String _date, String loc) {
		date = _date;
		location = loc;
	}
}
