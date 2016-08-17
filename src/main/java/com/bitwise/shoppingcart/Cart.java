package main.java.com.bitwise.shoppingcart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akankshap on 8/16/2016.
 */
public class Cart {
    private List<Product> cartItems = new ArrayList<Product>();

    public void addProduct(Product product) {
        cartItems.add(product);
    }

    public void removeProduct(Product product) {
        cartItems.remove(product);
    }

    public void displayItems() {
        Utility.displayItems(cartItems);
    }

    public void empty() {
        this.cartItems.clear();
    }
}
