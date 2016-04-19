package flightSearch;

public class Review {
	
	private int reviewNr;
	private String reviewText;
	
	public Review(String reviewText) {
		this.reviewText = reviewText;
	}
	
	public int getReviewNr() {
		return reviewNr;
	}
	
	public String getReviewText() {
		return reviewText;
	}
	
	public void setReviewText(String text) {
		this.reviewText = text;
	}
}