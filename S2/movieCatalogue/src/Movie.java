import java.time.LocalDate;
import java.util.ArrayList;

public class Movie {
    private String title;
    private LocalDate dateAdded;
    private ArrayList<Integer> rating;

    public Movie(String movieTitle) {
        validateMovieTitle(movieTitle);
        this.title = movieTitle;
        this.dateAdded = LocalDate.now();
        this.rating = new ArrayList();
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void addRating(int inputtedRatings){
       validateRating(inputtedRatings);
        rating.add(inputtedRatings);
    }

    public String getTitle() {
        return title;
    }

    public double getAverageRating() {
        double sum = addMovieRating();
        return Math.round(sum/rating.size() * 10)/10.0;
    }

    private void validateRating(int inputtedRatings){
        if(inputtedRatings>5 || inputtedRatings<=0){
            throw new InvalidRatingException();
        }
    }

    private double addMovieRating(){
        double sum = 0;
        for (Integer integer : rating) {
            sum += integer;
        }
        return sum;
    }
    private void validateMovieTitle(String movieTitle){
        if(movieTitle.isBlank()) throw new InvalidMovieTitleException();
    }

}
