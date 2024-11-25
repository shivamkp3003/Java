package com.cloudthat.librarymanagement;

public class PhysicalBook extends Book{
    private int numberOfPages;

    public PhysicalBook(String name, Author author) {
        super(name, author);
    }

    public PhysicalBook(String name, Author author, String ISBN, int numberOfPages) {
        super(name, author, ISBN);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void borrow() {
        System.out.println("Physical book borrowed");
    }

    @Override
    public void returnBook() {
        System.out.println("Physical book returned");
    }

    @Override
    public String toString() {
        return super.toString()+
                " PhysicalBook " +
                "numberOfPages=" + numberOfPages +
                '}';
    }
}
