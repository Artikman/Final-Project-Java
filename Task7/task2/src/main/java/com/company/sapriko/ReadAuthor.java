package com.company.sapriko;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class ReadAuthor {

    List<Author> massAuthor = new ArrayList<>();

    void reader() {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("task2/src/main/resources/Author"));
            String line;
            while((line = bufferedReader.readLine()) != null) {

                String[] words = line.split(";");

                Author newAuthor = new Author();

                newAuthor.name = words[0];
                newAuthor.age = Integer.parseInt(words[1]);

                massAuthor.add(newAuthor);
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