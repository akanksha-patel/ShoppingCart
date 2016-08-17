package main.java.com.bitwise.shoppingcart;

/**
 * Created by akankshap on 8/17/2016.
 */
public class OutOfStockException extends RuntimeException {
    public OutOfStockException (String message) {
        super (message);
    }

    public OutOfStockException() {

    }
}
