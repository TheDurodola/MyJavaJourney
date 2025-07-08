import java.util.ArrayList;

public class Customer extends User{
    private ArrayList<BillingInfo> billingInfoList = new ArrayList<>();
    private ShoppingCart shoppingCart;

    public Customer(int age, String firstName, String lastName, String email, String password, String phoneNumber, Addresses homeAddress) {
        super(age, firstName, lastName, email, password, phoneNumber, homeAddress);
    }
}
