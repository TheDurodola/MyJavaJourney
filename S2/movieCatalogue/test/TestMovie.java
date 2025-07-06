
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class TestMovie {
    Movie movie;

    @BeforeEach
    public void setup(){
        movie = new Movie("The Batman");
    }
    @Test
    public void TestThatDateAddedIsAccurate() {
        assertEquals(LocalDate.of(2025,7,6), movie.getDateAdded());
    }

    @Test
    public void TestThatRatingAreBetweenTheRangesOf1To5OtherwiseInvalidRatingExceptionIsThrown() {
        movie.addRating(5);
        assertThrows(InvalidRatingException.class, ()-> movie.addRating(6));
        assertThrows(InvalidRatingException.class, ()-> movie.addRating(0));
        assertThrows(InvalidRatingException.class, ()-> movie.addRating(-5));
    }

    @Test
    public void TestThatGetAverageRatingWorksPerfectly() {
        movie.addRating(5);
        movie.addRating(4);
        assertEquals(4.5, movie.getAverageRating());
        movie.addRating(5);
        assertEquals(4.7, movie.getAverageRating());
    }

    @Test
    public void testThatMovieTitleCantConsistOfOnlyWhiteSpaces(){
        AtomicReference<Movie> testMovie = null;
        assertThrows(InvalidMovieTitleException.class, ()-> testMovie.set(new Movie(" ")));
    }




}
