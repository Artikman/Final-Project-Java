package com.company.sapriko;

import java.util.ArrayList;
import java.util.List;

class Book {

    String nameBook;
    int numberPages;
    private List<Author> authorList;

    Book() {
        authorList = new ArrayList<>();
    }

    Book(String nameBook, int numberPages) {
        this.nameBook = nameBook;
        this.numberPages = numberPages;
        authorList = new ArrayList<>();
    }

    String getNameBook() {
        return nameBook;
    }

    int getNumberPages() {
        return numberPages;
    }

    public List<Author> getAuthors() {
        return authorList;
    }

    void addAuthor(Author author) {
        authorList.add(author);
    }

    int getAuthorCount() {
        return authorList.size();
    }
}