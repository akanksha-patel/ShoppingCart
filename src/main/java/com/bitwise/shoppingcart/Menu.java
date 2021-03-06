package main.java.com.bitwise.shoppingcart;

import java.util.List;
import java.util.Scanner;

/**
 * Created by akankshap on 8/16/2016.
 */
public class Menu {
    List<Product> products = new Products().getProducts();
    Cart cart = new Cart();
    private int ch;

    public void mainScreen() {
        System.out.println("1. Display Store Products");
        System.out.println("2. Show Cart");
        System.out.println("0. Exit");
    }

    public void cartMenu() {
        System.out.println("1. Remove From Cart");
        System.out.println("2. Empty Cart");
    }

    public void initMenu() {
        int pid;
        do {

            mainScreen();
            getUserInput();
            switch (ch) {
                case 1:
                    displayProducts();
                    System.out.println("Enter product ID to add");
                    pid = getUserInput();
//                    System.out.println(pid + " " + this.products);
                    addProductToCart(pid);
                    break;
                case 2:
                    displayCartItems();
                    cartMenu();
                    getUserInput();
                    switch (ch) {
                        case 1:
                            pid = getUserInput();
                            removeProductFromCart(pid, products);
                            break;
                        case 2:
                            emptyCart();
                            break;
                        default:

                            break;
                    }
                    break;
                case 0:

                    break;
            }
        } while (this.ch != 0);
    }

    private void emptyCart() {
        cart.empty();
    }

    private void removeProductFromCart(int pid, List<Product> products) {
        Product prod = Utility.getProductByPID(pid, products);
        cart.removeProduct(prod);
    }

    private void displayCartItems() {
        cart.displayItems();
    }

    private void addProductToCart(int pid) {
        Product prod = Utility.getProductByPID(pid, products);
        sellItem(prod);
        cart.addProduct(prod);
    }

    private void sellItem(Product prod) {
        if (prod.getStock() < 0)
            throw new OutOfStockException("Product is Out OF Stock");
        prod.setStock(prod.getStock()-1);
    }

    private int getUserInput() {
        Scanner in = new Scanner (System.in);
        ch = Integer.parseInt(in.nextLine());
        return ch;
    }

    private void displayProducts() {
        new Products().displayProducts();
    }
}
