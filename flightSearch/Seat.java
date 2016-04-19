package flightSearch;

public class Seat {
	private int seatNr;
	private boolean reserved;
	
	public Seat(int seatNr) {
		this.seatNr = seatNr;
	}
	
	public int getSeatNr() {
		return seatNr;
	}
	
	public void setReservation(boolean reserved) {
		this.reserved = reserved;
	}

	public boolean isReserved() {
		return reserved;
	}
}