package com.personel.model;

public class Book {
    private String title; //kitap basligi
    private String author; //yazar
    private String isbn; //isbn no
    private int availableCopies; //kullanabilir kopya sayisi

    public Book(String title, String author, String isbn, int availableCopies) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.availableCopies = availableCopies;
    }

    //kitabi ödünc al
    public boolean barrowBook() {
        if (availableCopies > 0) {
            availableCopies--;
            return true;
        } else {
            return false;
        }
    }

    //kitabi iade et
    public void returnBook() {
        availableCopies++;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }


}
