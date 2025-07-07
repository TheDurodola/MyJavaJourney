public class InvalidMovieTitleException extends IllegalArgumentException {
    public InvalidMovieTitleException() {}
    public InvalidMovieTitleException(String message) {
        super(message);
    }
}
