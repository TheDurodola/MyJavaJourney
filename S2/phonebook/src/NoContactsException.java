public class NoContactsException extends NullPointerException {

    NoContactsException(){
        super();
    }

    NoContactsException(String message){
        super(message);
    }
}
