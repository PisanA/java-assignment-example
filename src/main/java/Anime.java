import java.util.*;

public class Anime {
	private String title;
	private int year;
	private double score;
	private ArrayList<String> reviews;
	
	public Anime(String title, int year) {
		this.title = title;
		this.year = year;
		this.score = 0;
		this.reviews = new ArrayList<String>();
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setScore(double score) {
		this.score = score;
	}
	
	public double getScore() {
		return this.score;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public ArrayList<String> getReviews() {
		return this.reviews;
	}
	
	public void addReview(String review) {
		reviews.add(review);
	}
	
	public boolean isGoodAnime() {
		return score >= 7;
	}
}
