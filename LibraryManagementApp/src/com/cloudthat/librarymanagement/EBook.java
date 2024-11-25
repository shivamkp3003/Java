package com.cloudthat.librarymanagement;

public class EBook extends Book{
    private String downloadLink;

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }

    public EBook(String name, Author author) {
        super(name,author);
    }

    @Override
    public void borrow() {
        System.out.println("EBook borrowed");
    }

    @Override
    public void returnBook() {
        System.out.println("Ebook Returned");
    }
}
