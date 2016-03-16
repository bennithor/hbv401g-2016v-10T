package trips01;
import java.util.Scanner;

public class UI {

	private String startDate;
	private String endDate;
	private String location;
	private String destination;
	private int numberOfPeople;
	private int[] ages;
	private TripLogic tripGeneration;
	private TripData[] trips;
	
	private Scanner userInput = new Scanner(System.in);
	
	public void setStartDate(String date) {
		startDate = date;
	}
	
	public void setEndDate(String date) {
		endDate = date;
	}
	
	public void setLocation(String loc) {
		location  = loc;
	}
	
	public void setDestination(String dest) {
		destination = dest;
	}
	
	public void setNumberOfPeople(int number) {
		numberOfPeople = number;
	}
	
	public void setAges(int[] ageList) {
		ages = ageList;
	}
	
	public void dispUI() {
		System.out.println("Welcome to Random Travels!");
		System.out.println("Please enter the day you want to start the trip on the form day.month.year" );
		setStartDate(userInput.nextLine());
		System.out.println("Please enter the day you want to end the trip on the form day.month.year");
		setEndDate(userInput.nextLine());
		System.out.println("input location");
		setLocation(userInput.nextLine());
		System.out.println("Input destination");
		setDestination(userInput.nextLine());
		System.out.println("input number of travellers");
		setNumberOfPeople(userInput.nextInt());
		System.out.println("One moment");
		tripGeneration = new TripLogic(startDate, endDate, location, destination, numberOfPeople);
		trips = tripGeneration.getTripData();
		System.out.println("Flight from " + location + ": " + trips[0].getToIceland());
		System.out.println("Flight to " + location + ": " + trips[0].getFromIceland());
		String[] hotels = trips[0].getHotelsToStay();
		System.out.println("Hotel on date " + startDate + ": " + hotels[0] );
		System.out.println("Hotel on date " + endDate + ": " + hotels[1]);
		String[] tours = trips[0].getTours();
		System.out.println("Day tour on date " + startDate + ": " + tours[0]);
		System.out.println("Day tour on date " + endDate + ": " + tours[1]);
		System.out.println("Thanks for your business");
	}
	
	public UI() {
		
	}
	
}
