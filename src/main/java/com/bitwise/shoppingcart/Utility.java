package main.java.com.bitwise.shoppingcart;

import java.util.List;

/**
 * Created by akankshap on 8/16/2016.
 */
public class Utility {
    public static void displayItems(List<Product> products) {
        for (Product prod: products) {
            System.out.println(prod.getPid());
            System.out.println(prod.getName());
            System.out.println(prod.getStock());
            System.out.println(prod.getPrice());
        }
        System.out.println();
        System.out.println();
    }

    public static Product getProductByPID(int pid, List<Product> products) {
        System.out.println(products);
        Product product = null;
        for (Product prod: products) {
            if (prod.getPid() == pid) {
                product = prod;
            }
        }
        return product;

    }
}
