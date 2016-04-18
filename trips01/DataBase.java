package trips01;

import java.sql.*;
import java.util.Random;

public class DataBase {
	
	public static void createDb() {
		Connection c = null;
	    Statement stmt = null;
	    try{
	    	Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:Booking.db");
			stmt = c.createStatement();
			stmt = c.createStatement();
	        String sql = "CREATE TABLE IF NOT EXISTS TRIPS " +
	                      "(BookingID  INT PRIMARY KEY NOT NULL," +
	                      " Hotel      TEXT, " +
	                      " FlightTo   TEXT, " +
	                      " FlightFrom TEXT," +
	                      " DayTour    TEXT, " +
	                      " Price      INT 	NOT NULL)";
	        stmt.executeUpdate(sql);
	        stmt.close();
	        c.commit();
	        c.close();
	    } catch(Exception e){
	    	System.err.println( e.getClass().getName()+": "+ e.getMessage() );
	        System.exit(0);
	    }
	}

	public static void saveBooking(String hotel, String flightTo, String flightFrom, String dayTour, int price) {
		Connection c = null;
		Statement stmt = null;
		String bookingId = getBookingId();

		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:Booking.db");
			stmt = c.createStatement();

			String sql = "INSERT INTO TRIPS (BookingID, Hotel," +
					 	 " FlightTo, FlightFrom, DayTour, Price)" +
						 "VALUES("+bookingId+", "+hotel+", "+flightTo+", " +
						 flightFrom+", "+dayTour+", "+Integer.toString(price)+");";

			stmt.executeUpdate(sql);
			
			stmt.close();
			c.commit();
			c.close();

		}

		catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
			System.exit(0);
		}

	}

	
	public static String getBookingId() {
  		StringBuilder randomString = new StringBuilder();
  		Random random = new Random();

		String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		for(int i = 0; i < 6; i++) {
			randomString.append(alphabet.charAt(random.nextInt(alphabet.length())));
		}

		return randomString.toString();
	}
	
	public boolean bookingExists(String bookingId) {
		Connection c = null;
		Statement stmt = null;
		try{
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:Booking.db");
			c.setAutoCommit(false);
			stmt = c.createStatement();
			
			ResultSet rs = stmt.executeQuery("SELECT bookingId FROM TRIPS;");
			while(rs.next()){
				if(bookingId == rs.getString("bookingId")) return true;
			}
			
		}
		catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		    System.exit(0);
		}
		
		return false;
	}
	
	public static void getDb() {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.sqlite.JDBC");
		    c = DriverManager.getConnection("jdbc:sqlite:Booking.db");
			c.setAutoCommit(false);
			
			stmt = c.createStatement();
	        ResultSet rs = stmt.executeQuery("SELECT * FROM TRIPS WHERE bookingId = eitthvað;");
	        while(rs.next()){
	        	//gera eitthvað til að sýna
	        	//t.d. String e-ð = rs.getString("");
	        }
	        rs.close();
	        stmt.close();
	        c.close();
		} catch ( Exception e ) {
			System.err.println( e.getClass().getName() + ": " + e.getMessage() );
		    System.exit(0);
	    }
	}

	
}
