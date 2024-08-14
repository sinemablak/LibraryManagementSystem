package com.personel.model;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books=new ArrayList<>();
    private List<Member> members=new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }
    public void registerMember(Member member) {
        members.add(member);
    }

    public void processBorrowing(Member member, Book book) {
        member.borrowBook(book);
    }

    public void processReturn(Member member, Book book) {
        member.returnBook(book);
    }

}
