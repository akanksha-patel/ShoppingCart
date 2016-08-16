package main.java.com.bitwise.shoppingcart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akankshap on 8/16/2016.
 */
public class Cart {
    private List<Product> cartItems = new ArrayList<Product>();

    public void addProduct(int pid, List<Product> products) {
        System.out.println(products);
        cartItems.add(Utility.getProductByPID(pid, products));
    }

    public void removeProduct(int pid, List<Product> products) {
        cartItems.remove(Utility.getProductByPID(pid, products));
    }

    public void displayItems() {
        Utility.displayItems(cartItems);
    }
}
