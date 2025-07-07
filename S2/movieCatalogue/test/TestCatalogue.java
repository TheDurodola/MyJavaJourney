import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestCatalogue {
    Catalogue movieCollection;

    @BeforeEach
    void setUp() {
        movieCollection = new Catalogue();
    }

    @Test
    public void testAddMovieToCatalogue() {
        movieCollection.addMovie("Sandman");
    }

    @Test
    public void testThatWhiteSpacesAsMovieTitleAreRejected() {
        assertThrows(InvalidMovieTitleException.class, ()->movieCollection.addMovie(" "));
    }

    @Test
    public void testThatEmptyStringInputAsTitleAreRejected(){
        assertThrows(InvalidMovieTitleException.class, ()->movieCollection.addMovie(""));
    }

    @Test
    public void testThatMovieCanBeRated(){
        movieCollection.addMovie("The Batman");
        movieCollection.rateMovie("The Batman", 5);
    }

    @Test
    public void testThatMovieCanBeRateAndTheAverageRatingsIsRetrieved(){
        movieCollection.addMovie("The Batman");
        movieCollection.rateMovie("The Batman", 5);
        assertEquals(5, movieCollection.getMovieRating("The Batman"));
        movieCollection.addMovie("The Accountant");
        movieCollection.rateMovie("The Accountant",3);
        assertEquals(3, movieCollection.getMovieRating("The Accountant"));
        movieCollection.rateMovie("The Accountant",2);
        assertEquals(2.5, movieCollection.getMovieRating("The Accountant"));
    }

    @Test
    public void testThatMovieCanBeRatedDespiteTitleCase(){
        movieCollection.addMovie("The Batman");
        movieCollection.rateMovie("The batman", 5);
    }

    @Test
    public void AndTheAverageRatingsAreRetrieved(){
        movieCollection.addMovie("The Batman");
        movieCollection.rateMovie("The batman", 5);
        assertEquals(5, movieCollection.getMovieRating("The batMan"));
    }

    @Test
    public void testIfInvalidMovieTitleIsEnterToBeRatedExceptionIsThrown(){
        assertThrows(InvalidMovieTitleException.class, ()->movieCollection.rateMovie("The Batman", 2));
    }

    @Test
    public void testExceptionIsThrownWhenRetrievingNonexistentMovieTitle(){
        assertThrows(InvalidMovieTitleException.class, ()->movieCollection.getMovieRating("The Batman"));
    }

    @Test
    public void testThatTheSameMovieCantBeAddedTwiceExceptionIsThrown(){
        movieCollection.addMovie("The Batman");
        assertThrows(InvalidMovieTitleException.class, ()->movieCollection.addMovie("The Batman"));
    }

    @Test
    public void testThatSameMovieCantBeAddedDespiteIrregularityInMovieTitleCase(){
        movieCollection.addMovie("The Batman");
        assertThrows(InvalidMovieTitleException.class, ()->movieCollection.addMovie("the batman"));
    }

    @Test
    public void testThatRetrieveAllMovieRatingReturnsArrayListOfAllAverageRatings(){
        movieCollection.addMovie("The Batman");
        movieCollection.addMovie("Sandman");
        movieCollection.rateMovie("The Batman", 5);
        movieCollection.rateMovie("Sandman", 2);
        double[] expected =  {5,2};
        assertArrayEquals(expected , movieCollection.retrieveAllRatings());
    }

    @Test
    public void TestCatalogueIsEmptyExceptionIsThrownWhenRetrievingAllMovieRatings(){
        assertThrows(CatalogueEmptyException.class, ()-> movieCollection.retrieveAllRatings());
    }

}
