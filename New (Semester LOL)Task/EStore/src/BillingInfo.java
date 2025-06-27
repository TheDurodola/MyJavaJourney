public class BillingInfo {
    private String receiverPhoneNumber;
    private String receiverName;
    private Addresses deliveryAddress;

    public BillingInfo(String receiverPhoneNumber, String receiverName, Addresses deliveryAddress) {
        this.receiverPhoneNumber = receiverPhoneNumber;
        this.receiverName = receiverName;
        this.deliveryAddress = deliveryAddress;
    }
}
