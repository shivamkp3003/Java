package com.cloudthat.app;

public class NewBook extends Book {
    private String genre;

    public NewBook(String bookName, Author author) {
        super(bookName, author);
    }

    public NewBook(String bookName, Author author, String genre) {
        super(bookName, author);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
