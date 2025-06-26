import java.util.List;

public class Customer {
    private List<BillingInfo> billingInfoList;
    private ShoppingCart shoppingCart;

    public Customer(List<BillingInfo> billingInfoList, ShoppingCart shoppingCart) {
        this.billingInfoList = billingInfoList;
        this.shoppingCart = shoppingCart;
    }
}
