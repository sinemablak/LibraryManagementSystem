package com.personel.model;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private String memberShipId;
    private List<Book> borrowedBooks=new ArrayList<>();

    public Member(String name,String memberShipId){
        this.name=name;
        this.memberShipId=memberShipId;
    }
    public void barrowBook(Book book){
        if(book.barrowBook()){
            borrowedBooks.add(book);
            System.out.println(name + "barrowed" + book);
        }else {
            System.out.println(book + "is not available.");
        }
    }
    public void returnBook(Book book){
        if(borrowedBooks.remove(book)){
            book.returnBook();
            System.out.println(name + "returned" + book);
        }else{
            System.out.println(name + "did not barrow" + book);
        }
    }

    public void borrowBook(Book book) {
    }
    //
}
