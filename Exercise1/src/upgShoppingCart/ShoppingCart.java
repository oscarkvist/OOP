package upgShoppingCart;

import upgShoppingCart.Product;

public class ShoppingCart {
    private Product[] products;
    private int[] quantities;

    private int numOfProducts;

     

    public ShoppingCart() {
        products = new Product[100];
        quantities = new int[100];
    }

    public void addProduct(Product product, int quantiti) {
        products[numOfProducts] = product;
        quantities[numOfProducts] = quantiti;
        numOfProducts++;
    }

    public void removeProduct(Product product) {
        int index = -1;
        for (int i = 0; i < products.length; i++) {
            if (products[i] == product) {
                index = i;
            }
        }
        for (int i = index; i < numOfProducts - 1; i++) {
            products[i] = products[i + 1];
            quantities[i] = quantities[i + 1];
        }
        numOfProducts--;
    }

    public Double calculateTotalCost() {
        double totalPrice = 0;
        for (int i = 0; i < numOfProducts; i++) {
            totalPrice += products[i].getPrice() * quantities[i];
        }
        return totalPrice;
    }

    public void displayCartContents() {
        System.out.println("Cart contains");
        for (int i = 0; i < numOfProducts ; i++) {
            System.out.println("-" + products[i].getProductName() +
                    "(" + quantities[i] + ")" + "- " +
                    products[i].getPrice() * quantities[i] + "kr");
        }
        System.out.println("Total Cost: " + calculateTotalCost() + "kr");
    }

}
