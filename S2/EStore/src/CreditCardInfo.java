public class CreditCardInfo {
    private String cardCVV;
    private String cardNumber;
    private String expirationMonth;
    private String expirationYear;
    private String nameOnCard;
    private CardType cardType;

    public CreditCardInfo(int cardCVV, String cardNumber, String expirationMonth, String expirationYear, String nameOnCard, CardType cardType) {
        validateCVV(cardCVV);
        this.cardCVV = String.valueOf(cardCVV);
        this.cardNumber = cardNumber;
        this.expirationMonth = expirationMonth;
        this.expirationYear = expirationYear;
        this.nameOnCard = nameOnCard;
        this.cardType = cardType;
    }

    private void validateCVV(int cardCVV) {
        if (cardCVV < 100 || cardCVV >999) {
            throw new IllegalArgumentException("Invalid CVV");
        }
    }
}
