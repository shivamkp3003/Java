package com.cloudthat.librarymanagement;

import com.cloudthat.librarymanagement.exceptions.BookAlreadyExistsException;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Library Management");
        Library library = new Library();

        // Create Physical & ebook
        try {
            PhysicalBook physicalBook = new PhysicalBook("Introduction to Java", new Author(123456L, "Vishwas K Singh", "vishwas@cloudthat.com"), "1234567L", 345);
            PhysicalBook physicalBook1 = new PhysicalBook("Introduction to Java", new Author(123456L, "Vishwas K Singh", "vishwas@cloudthat.com"), "1234567L", 345);
            library.addBook(physicalBook);
            library.addBook(physicalBook1);
        } catch (BookAlreadyExistsException e) {
            System.out.println("Book Exists");
        }

        library.displayAllBooks();

        // To find a book
        library.findByIsbn("1234567L");
        library.findByIsbn("123L");

        library.findByTitle("Introduction to Java");
        library.findByTitle("Introduction to JS");

        // Implement code to remove a book
        // Implement code to remove a book that does not exist & handle that


    }
}