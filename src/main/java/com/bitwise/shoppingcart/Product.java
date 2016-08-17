package main.java.com.bitwise.shoppingcart;

/**
 * Created by akankshap on 8/16/2016.
 */
public class Product {
    private Integer pid;
    private String name;
    private Integer stock;
    private Double price;

    public Product(){

    }

    public Product (Integer pid, String name, Integer stock, Double price) {
        this.pid = pid;
        this.name = name;
        this.stock = stock;
        this.price = price;
    }

    @Override
    public String toString() {
        return "product id- "+pid+"  product name- "+name+"  quantity- "+stock+"  price- "+price;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
