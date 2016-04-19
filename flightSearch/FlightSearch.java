package flightSearch;

import java.util.Random;

public class FlightSearch {
	private String destination;
	private double minPrice = 0.0;
	private double maxPrice = -1.0;
	private String date;
	
	private Flight[] flights;
	
	public FlightSearch() {
		initFlights();
	}
	
	public Flight[] search() {
		Flight[] tmpFlights = new Flight[40];

		for (int i = 0; i < tmpFlights.length; i++)
			tmpFlights[i] = null;
		
		for (int i = 0; i < flights.length; i++) {
			tmpFlights[i] = flights[i];
		}
		
		if (date != null) {
			for (int i = 0; i < tmpFlights.length; i++) {
				if (tmpFlights[i] != null && !tmpFlights[i].getDate().equalsIgnoreCase(date))
					tmpFlights[i] = null;
			}
		}
		
		if (destination != null) {
			for (int i = 0; i < tmpFlights.length; i++) {
				if (tmpFlights[i] != null && !tmpFlights[i].getDestination().equalsIgnoreCase(destination))
					tmpFlights[i] = null;
			}
		}
		
		if (minPrice > 0.0) {
			for (int i = 0; i < tmpFlights.length; i++) {
				if (tmpFlights[i] != null && tmpFlights[i].getPrice() < minPrice)
					tmpFlights[i] = null;
			}
		}
		
		if (maxPrice > 0.0) {
			for (int i = 0; i < tmpFlights.length; i++) {
				if (tmpFlights[i] != null && tmpFlights[i].getPrice() > maxPrice)
					tmpFlights[i] = null;
			}
		}
		
		Flight[] returnFlights = trimArray(tmpFlights);
		return returnFlights;
	}
	
	// set search parameters
	public void setPriceRange(double minPrice, double maxPrice) { 
		this.minPrice = minPrice;
		this.maxPrice = maxPrice;
	}
	
	public void setDestination(String dest) {
		this.destination = dest;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	private Flight[] trimArray(Flight[] flights) {
		int count = 0;
		for (int i = 0; i < flights.length; i++) {
			if (flights[i] != null)
				count++;
		}
		Flight[] newFlights = new Flight[count];
		int j = 0;
		for (int i = 0; i < flights.length; i++) {
			if (flights[i] != null)
				newFlights[j++] = flights[i];
		}
		return newFlights;
	}
	public void initFlights() {
		Random rand = new Random();
		
		flights = new Flight[36];
		flights[0] = new Flight("WW404", "KEFLAVIK", "PARIS CDG", "19. april", rand.nextDouble()*100000.0);
		flights[1] = new Flight("WW720", "KEFLAVIK", "Berlin Schoenefeld", "19. april", rand.nextDouble()*100000.0);
		flights[2] = new Flight("WW810", "KEFLAVIK", "London Gatwick", "19. april", rand.nextDouble()*100000.0);
		flights[3] = new Flight("WW902", "KEFLAVIK", "Copenhagen", "19. april", rand.nextDouble()*100000.0);
		flights[4] = new Flight("FI532", "KEFLAVIK", "Munich", "19. april", rand.nextDouble()*100000.0);
		flights[5] = new Flight("FI568", "KEFLAVIK", "Zurich", "19. april", rand.nextDouble()*100000.0);
		flights[6] = new Flight("FI520", "KEFLAVIK", "Frankfurt", "19. april", rand.nextDouble()*100000.0);
		flights[7] = new Flight("FI342", "KEFLAVIK", "Helsinki", "19. april", rand.nextDouble()*100000.0);
		flights[8] = new Flight("FI430", "KEFLAVIK", "Glasgow", "19. april", rand.nextDouble()*100000.0);
		flights[9] = new Flight("FI306", "KEFLAVIK", "Stockholm", "19. april", rand.nextDouble()*100000.0);
		flights[10] = new Flight("FI450", "KEFLAVIK", "London Heathrow", "19. april", rand.nextDouble()*100000.0);
		flights[11] = new Flight("FI554", "KEFLAVIK", "Brussels", "19. april", rand.nextDouble()*100000.0);
		flights[12] = new Flight("FI542", "KEFLAVIK", "PARIS CDG", "19. april", rand.nextDouble()*100000.0);
		flights[13] = new Flight("FI500", "KEFLAVIK", "Amsterdam", "19. april", rand.nextDouble()*100000.0);
		flights[14] = new Flight("FI470", "KEFLAVIK", "London Gatwick", "19. april", rand.nextDouble()*100000.0);
		flights[15] = new Flight("FI204", "KEFLAVIK", "Copenhagen", "19. april", rand.nextDouble()*100000.0);
		flights[16] = new Flight("FI318", "KEFLAVIK", "Oslo", "19. april", rand.nextDouble()*100000.0);
		flights[17] = new Flight("6F107", "KEFLAVIK", "Alicante", "19. april", rand.nextDouble()*100000.0);
		flights[18] = new Flight("EZY2296", "KEFLAVIK", "London Luton", "19. april", rand.nextDouble()*100000.0);
		flights[19] = new Flight("EZS1246", "KEFLAVIK", "Basel Mulhouse", "19. april", rand.nextDouble()*100000.0);
		flights[20] = new Flight("WW614", "KEFLAVIK", "Alicante", "19. april", rand.nextDouble()*100000.0);
		flights[21] = new Flight("SK596", "KEFLAVIK", "Copenhagen", "19. april", rand.nextDouble()*100000.0);
		flights[22] = new Flight("SK4788", "KEFLAVIK", "Oslo", "19. april", rand.nextDouble()*100000.0);
		flights[23] = new Flight("DY1171", "KEFLAVIK", "Oslo", "19. april", rand.nextDouble()*100000.0);
		flights[24] = new Flight("FI212", "KEFLAVIK", "Copenhagen", "19. april", rand.nextDouble()*100000.0);
		flights[25] = new Flight("WW125", "KEFLAVIK", "Boston", "19. april", rand.nextDouble()*100000.0);
		flights[26] = new Flight("WW117", "KEFLAVIK", "Baltimore Washington", "19. april", rand.nextDouble()*100000.0);
		flights[27] = new Flight("FI454", "KEFLAVIK", "London Heathrow", "19. april", rand.nextDouble()*100000.0);
		flights[28] = new Flight("FI671", "KEFLAVIK", "Denver", "19. april", rand.nextDouble()*100000.0);
		flights[29] = new Flight("FI645", "KEFLAVIK", "Washington Dulles", "19. april", rand.nextDouble()*100000.0);
		flights[30] = new Flight("FI623", "KEFLAVIK", "New York Newark", "19. april", rand.nextDouble()*100000.0);
		flights[31] = new Flight("FI631", "KEFLAVIK", "Boston", "19. april", rand.nextDouble()*100000.0);
		flights[32] = new Flight("FI681", "KEFLAVIK", "Seattle", "19. april", rand.nextDouble()*100000.0);
		flights[33] = new Flight("FI615", "KEFLAVIK", "New York JFK", "19. april", rand.nextDouble()*100000.0);
		flights[34] = new Flight("FI689", "KEFLAVIK", "Orlando", "19. april", rand.nextDouble()*100000.0);
		flights[35] = new Flight("EZY6942", "KEFLAVIK", "Edinburgh", "19. april", rand.nextDouble()*100000.0);
	}
	
}