package flightSearch;

public class User {
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String address;
	private String town;
	private String country;
	private int age;
	private String gender;
	private int postcode;
	private String email;
	private Review[] reviews;

	public User(String username) {
		this.username = username;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	public boolean loggedIn() {
		return true;
	}
	
	public Review makeReview(String reviewText) {
		return new Review(reviewText);
	}
}