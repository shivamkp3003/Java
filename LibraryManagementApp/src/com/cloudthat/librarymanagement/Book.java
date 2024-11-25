package com.cloudthat.librarymanagement;

import java.util.UUID;

public abstract class Book implements Borrowable {

    private UUID id;
    private String name;
    private Author author;
    private String genre;
    private String ISBN;

    public abstract void borrow();
    public abstract void returnBook();

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Book(String name, Author author) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.author = author;
    }

    public Book(String name, Author author, String ISBN) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author=" + author +
                ", genre='" + genre + '\'' +
                ", ISBN='" + ISBN + '\'' +
                '}';
    }
}
