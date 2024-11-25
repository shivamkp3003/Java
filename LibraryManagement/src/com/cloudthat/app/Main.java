package com.cloudthat.app;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to library management");

        Book b1 = new Book();

        Book b2 = new Book("Introduction to Java", new Author("James Gosling", "james@gmail.com"));

        System.out.println("Book b1 is: "+ b1);
        System.out.println("Book b2 is: "+ b2);
    }
}