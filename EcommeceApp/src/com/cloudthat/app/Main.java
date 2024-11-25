package com.cloudthat.app;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
//        Product p1 = new Product();
//        Product p2 = new Product();
//
//        p1.productName = "Onion";
//        p1.price = 23.5;
//
//        p2.productName = "Wheat";
//        p2.price = 45;

        NewProduct p1 = new NewProduct("Onion", 45.6);
        Product p2 = new Product();
        NewProduct p3 = new NewProduct("Laptop", 25000, 1234);

//        System.out.println("Product P1 is: "+ p1.getProductName());
//        System.out.println("Product P2 is: "+ p2.getProductName());

        System.out.println("Product P1 is: "+ p1);
        System.out.println("Product P2 is: "+ p2);
    }
}