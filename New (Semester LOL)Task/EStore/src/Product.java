public class Product {
    private String productID;
    private String productName;
    private int productPrice;
    private String productDescription;
    private ProductCategory productCategory;

    public Product(String productID, String productName, int productPrice, String productDescription, ProductCategory productCategory) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
    }
}
