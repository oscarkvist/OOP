package upgShoppingCart;

public class Product {





    private final String productName;
    private final double price;
    public Product(String productName, Double price){
        this.price = price;
        this.productName = productName;
    }

    public String getProductName(){
        return productName;
    }
    public double getPrice(){
        return price;
    }


}
