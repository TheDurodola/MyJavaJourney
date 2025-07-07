import java.util.ArrayList;

public class Catalogue {
    private ArrayList<Movie> collection;

    Catalogue() {
        this.collection = new ArrayList<>();
    }

    public void addMovie(String title) {
        for (Movie movie : this.collection) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                throw new InvalidMovieTitleException("Title already exists");
            }
        }
        Movie movie = new Movie(title);
        collection.add(movie);
    }

    public void rateMovie(String title, int rate) {
        for (Movie movie : collection) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                movie.addRating(rate);
                return;
            }
        }
        throw new InvalidMovieTitleException("Movie doesn't exist");
    }

    public double getMovieRating(String title) {
        for (Movie movie : collection) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie.getAverageRating();
            }
        }
        throw new InvalidMovieTitleException("No movie with the title " + title);
    }


    public double[] retrieveAllRatings() {
        validateCatalogue();
        int arraySize = collection.size();
        double [] allRatings = new double[arraySize];
        for (int index = 0; index < arraySize; index++) {
            double movieRating = collection.get(index).getAverageRating();
            allRatings[index] = movieRating;
        }
        return allRatings;
    }

    private void validateCatalogue(){
        if (this.collection.size() == 0) {
            throw new CatalogueEmptyException("Catalogue is Empty. Add a Movie and Try Again Later");
        }
    }
}
