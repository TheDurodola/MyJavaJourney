public class CreditCardInfo {
    private String cardCVV;
    private String cardNumber;
    private String expirationMonth;
    private String expirationYear;
    private String nameOnCard;
    private CardType cardType;

    public CreditCardInfo(String cardCVV, String cardNumber, String expirationMonth, String expirationYear, String nameOnCard, CardType cardType) {
        this.cardCVV = cardCVV;
        this.cardNumber = cardNumber;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.nameOnCard = nameOnCard;
        this.cardType = cardType;
    }
}
