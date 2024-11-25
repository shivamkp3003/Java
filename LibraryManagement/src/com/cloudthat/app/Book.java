package com.cloudthat.app;

public class Book {
    private String bookName;
    private String isbn;
    private Author author;

    public Book() {
//        this("Unknown", "UNKNOWN");
        this.bookName = "UNKNOWN";
        this.author = new Author("UNKNOWN","UNKNOWN");
    }

    public Book(String bookName, Author author) {
        this.bookName = bookName;
        this.author = author;
        this.setIsbn("UNKOWN");
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", isbn='" + isbn + '\'' +
                ", author=" + author +
                '}';
    }
}
