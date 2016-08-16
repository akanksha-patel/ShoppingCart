package main.java.com.bitwise.shoppingcart;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akankshap on 8/16/2016.
 */
public class Products {
    private final List<Product> products = new ArrayList<Product>();

    public Products () {
        this.initStoreItems();
    }

    private void initStoreItems() {
        String [] names = {"Lipstick", "Foundation", "Shoes", "Dress", "Eyeliner"};
        Integer [] stocks = {10, 2, 10, 5, 4};
        Double [] price = {500.00d, 600.00d, 10000.00d, 20000.00d, 15.00d};

        for (int i=0; i < names.length; i++) {
            this.products.add(new Product(i+1, names[i], stocks[i], price[i]));
        }

    }


    public List<Product> getProducts() {
        return products;
    }

    public void displayProducts() {
        Utility.displayItems(this.products);
    }
}
