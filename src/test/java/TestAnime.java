import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Tests object oriented class.
 */
public class TestAnime {

	@Test
	public void testTitle() {
		Anime anime = new Anime("Konosuba", 2016);
		assertEquals("Title is set correctly", "Konosuba", anime.getTitle());
	}
	
	@Test
	public void testYear() {
		Anime anime = new Anime("Non Non Biyori", 2013);
		assertEquals("Year is set correctly", 2013, anime.getYear());
	}
	
	@Test
	public void testScore() {
		Anime anime = new Anime("No Game No Life", 2014);
		anime.setScore(8.13);
		assertEquals("Score is set correctly", 8.13, anime.getScore(), 0.001);
	}
	
	@Test
	public void testReviews() {
		Anime anime = new Anime("Lucky☆Star", 2007);
		anime.addReview("Funny");
		anime.addReview("Good anime");
		anime.addReview("Lucky channel lol");
		
		assertEquals("Review length correct", 3, anime.getReviews().size());
		assertEquals("First review is correct", "Funny", anime.getReviews().get(0));
		assertEquals("Second review is correct", "Good anime", anime.getReviews().get(1));
		assertEquals("Third review is correct", "Lucky channel lol", anime.getReviews().get(2));
	}
	
	@Test
	public void testIsGoodAnime() {
		Anime goodAnime = new Anime("Hitoribocchi no Marumaru Seikatsu", 2019);
		goodAnime.setScore(7.5);
		assertTrue("Scores 7 and above are good anime", goodAnime.isGoodAnime(7));
		
		Anime badAnime = new Anime("Hachi-nan tte Sore wa Nai deshou", 2020);
		badAnime.setScore(6.22);
		assertFalse("Scores lower than 7 are bad anime", badAnime.isGoodAnime(7));
	}

}
