package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\tjomka777tjomka777\\IdeaProjects\\HPotterArrays\\" +
                "Harry_Potter_and_the_Goblet_of_Fire_Joanne_Kathleen_Rowling.txt";
        String myString = Files.readString(Paths.get(path));
        String myString2 = myString.toLowerCase().replaceAll("[^A-Za-zА-Яа-я ]", "");

        final String[] array = myString2.split(" ");

        List<String> arrayDistinct = new ArrayList<String>();

        for (String word:array) {
            if(arrayDistinct != null)
            {
                if(arrayDistinct.contains(word) == false)
                    arrayDistinct.add(word);
            }
            else
            {
                arrayDistinct.add(word);
            }
        }

        System.out.println(arrayDistinct.size());
    }
}
