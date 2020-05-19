package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        LocalDateTime startTimer = LocalDateTime.now();

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


        Set<String> set = new LinkedHashSet<>();

        Arrays.stream(array).forEach(el -> {
            set.add(el);
        });

        System.out.println(set.size());

        final Object[] uniqueWords = set.toArray();

//        for (int i =0; i<10; i++) {
//            System.out.println(uniqueWords[i]);
//
//        }


        //создаем массив - частота встречаний слов
        int[] counts = new int[uniqueWords.length];

        for (int i = 0; i < uniqueWords.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(uniqueWords[i].equals(array[j]))
                {
                    counts[i]++;
                }
            }
        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println(uniqueWords[i] + " " + counts[i]);
//        }

        List<GlossaryItem> words = new ArrayList<>();

        for (int i = 0; i < uniqueWords.length; i++) {
            words.add(new GlossaryItem(uniqueWords[i].toString(), counts[i]));
        }

        List<GlossaryItem> sorted = words.stream()
                .sorted(Comparator.comparing(GlossaryItem::getCount).reversed())
                .collect(Collectors.toList());

        for (int i = 0; i < 10 ; i++) {
            System.out.println(sorted.get(i));
        }

        sorted.stream().forEach(el -> {
            System.out.println(el.toString());
        });

        String word = sorted.stream().filter(el -> el.getCount() == 2570)
                .collect(Collectors.toList()).get(0)
                .getWord();
        System.out.println(word);

        LocalDateTime stopTimer = LocalDateTime.now();


        System.out.println(ChronoUnit.SECONDS.between(startTimer, stopTimer));
    }
}
