package com.company.sapriko;

import java.util.*;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Runner
{
    private final static Logger logger = Logger.getLogger(Runner.class.getName());

    public static void main( String[] args ) {

        ReadAuthor testAuthor = new ReadAuthor();
        testAuthor.reader();
        for(Author newAuthor : testAuthor.massAuthor)
            System.out.println(newAuthor.name + ";" + newAuthor.age);

        System.out.println("\n");

        ReadBook testBook = new ReadBook();
        testBook.reader();
        for(Book newBook : testBook.massBook)
            System.out.println(newBook.nameBook + ";" + newBook.numberPages);

        for (Author author : testAuthor.massAuthor) {
            Random r = new Random();
            int maxBookId = testBook.massBook.size() - 1;
            int booksAmount = r.nextInt(maxBookId) + 1;
            List<Integer> ids = IntStream.rangeClosed(0, maxBookId).boxed().collect(Collectors.toList());
            Collections.shuffle(ids);

            List<Integer> selectedIds = ids.subList(0, booksAmount);

            for(Integer id : selectedIds) {
                author.addBook(testBook.massBook.get(id));
                testBook.massBook.get(id).addAuthor(author);
            }
        }

        //1.
        List<Book> bookList = testBook.massBook.stream().filter((p)->p.getNumberPages() > 200).collect(Collectors.toList());
        bookList.forEach(book-> logger.info("This book is " + book.getNameBook() + ", number pages " + book.getNumberPages()));

        logger.info("\n");

        //2.
        long countBook = testBook.massBook.stream().filter((p)->p.getNumberPages() > 200).count();
        logger.info(" " + countBook);

        logger.info("\n");

        //3.
        Book maxPages = testBook.massBook.stream().max(Comparator.comparing(Book::getNumberPages)).get();
        testBook.massBook.stream().filter(book -> book.getNumberPages() == maxPages.getNumberPages())
        .forEach(x -> logger.info("This book is " + maxPages.getNameBook() + ", number pages " + maxPages.getNumberPages()));

        Book minPages = testBook.massBook.stream().min(Comparator.comparing(Book::getNumberPages)).get();
        testBook.massBook.stream().filter(book -> book.getNumberPages() == minPages.getNumberPages())
                .forEach(x -> logger.info("This book is " + minPages.getNameBook() + ", number pages " + minPages.getNumberPages()));

        logger.info("\n");

        //4.
        Set<Book> bookSet = new HashSet<>();
        testAuthor.massAuthor.stream()
                .flatMap(b->b.getBooks().stream())
                .filter(a->!bookSet.add(a))
                .collect(Collectors.toSet())
                .forEach(book -> logger.info("This book is " + book.getNameBook() + ", number pages " + book.getNumberPages()));

        logger.info("\n");

        //5.
        testBook.massBook.stream()
                .sorted(Comparator.comparingInt(Book::getNumberPages))
                .peek(book -> logger.info("This book is " + book.getNameBook() + ", number pages " + book.getNumberPages()))
                .sorted(
                        (b1, b2) -> b1.getNameBook().compareToIgnoreCase(b2.getNameBook())
                ).forEach(book -> logger.info("This book is " + book.getNameBook() + ", number pages " + book.getNumberPages()));

        logger.info("\n");

        //6.
        testBook.massBook.stream()
                .map(Book::getNameBook)
                .distinct()
                .forEach(logger::info);

        logger.info("\n");

        //7.
        testBook.massBook.stream()
                .filter(book -> book.getNumberPages() < 200)
                .map(Book::getAuthors)
                .distinct()
                .forEach(authors -> logger.info(authors.toString()));
    }
}