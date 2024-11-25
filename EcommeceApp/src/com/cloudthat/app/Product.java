package com.cloudthat.app;

public class Product {
    private String productName;
    private String color;
    private double price;
    private int quantity;
    private Dimension dimension;

    public Product(String productName, int quantity, String color, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.color = color;
        this.price = price;
    }

    public Product() {
        this("Unknown", 0.0);
    }

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public Product(String color, int quantity) {
        this.color = color;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", dimension=" + dimension +
                '}';
    }
}
