package com.company.sapriko;

import java.util.ArrayList;
import java.util.List;

class Author {

    String name;
    int age;
    private List<Book> bookList;

    Author() {
        bookList = new ArrayList<>();
    }

    Author(String name, int age) {
        this.name = name;
        this.age = age;
        bookList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Book> getBooks() {
        return bookList;
    }

    void addBook(Book book) {
        bookList.add(book);
    }
}