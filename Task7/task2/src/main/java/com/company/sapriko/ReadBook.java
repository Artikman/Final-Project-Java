package com.company.sapriko;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class ReadBook {

    List<Book> massBook = new ArrayList<>();

    void reader() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("task2/src/main/resources/Book"));
            String line;
            while((line = bufferedReader.readLine()) != null) {

                String[] words = line.split(";");

                Book newBook = new Book();

                newBook.nameBook = words[0];
                newBook.numberPages = Integer.parseInt(words[1]);

                massBook.add(newBook);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(bufferedReader != null)
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }
}