package flightSearch;

public class Flight {
	private String flightNr;
	private String from;
	private String to;
	private Seat[][] seats;
	private String date;
	private double price;
	
	public Flight(String flightNr, String from, String to, String date, double price) {
		this.flightNr = flightNr;
		this.from = from;
		this.to = to;
		this.date = date;
		this.price = price;
		seats = new Seat[30][6];
		for (int i = 0; i < seats.length; i++) {
			for (int j = 0; j < seats[i].length; j++)
				seats[i][j] = new Seat(i*6+j);
		}
	}
	
	public String getFlightNr() {
		return flightNr;
	}
	
	public String getDestination() {
		return to;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this. date = date;
	}
	
	public double getPrice() {
		return price;
	}
	
	public Seat getSeat(int seatNr) {
		return seats[seatNr/6][seatNr%6];
	}
}