package com.company;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {

        //String myString = "asd, as,da. asda \" dsad asddaa ! ? asda sd? asd" ;
//        String myString ="Хорошо, когда ты можешь полностью отвлечься от окружающего мира и наслаждаться увлекательными приключениями. Это дарит незабываемые эмоции и массу новых впечатлений. Для этого отлично подходит серия книг о Гарри Поттере, написанная Джоан Роулинг. Она включает в себя 7 романов фэнтези, заставляющих забыть о реальности. История о необычном мальчике восхищает многих читателей. Книги открыли новый волшебный мир, который смог переплестись с настоящей действительностью – во многих странах проводятся тематические мероприятия, открыты фан-клубы, пишутся произведения по мотивам романов серии. Особого внимания заслуживают фильмы о Гарри Поттере, и в этом издании читатели смогут увидеть уже знакомые изображения школы волшебников Хогвартс и красочных пейзажей ее окрестностей. Здесь представлена полная коллекция книг, выполненная в стиле магического мира Гарри Поттера, что создает необычайную атмосферу во время чтения.\n" +
//                "\n" +
//                "Мальчик, который долгое время считал себя вполне обычным. Мальчик, которому было отказано в родительской любви и крепкой семье. И однажды он узнал, что он вовсе не такой обычный, как ему казалось. С поступлением в магическую школу Хогвартс все изменилось. Здесь он обрел друзей, мудрых наставников и множество полезных знаний. Он стал совсем другим. Теперь его имя известно всем – Гарри Поттер. Тот самый мальчик, который выжил после столкновения с великим злом. В волшебном мире он не только обрел друзей, он узнал, что у него есть враги. А самый главный враг – непобедимый и настолько ужасный, что люди вздрагивают при упоминании о нем и боятся вслух произносить его имя. И именно Гарри Поттеру придется встретиться с ним лицом к лицу.\n" +
//                "\n" +
//                "Произведение было опубликовано в 1997 году издательством Росмэн-Пресс. На нашем сайте можно скачать книгу \"Гарри Поттер. Полная коллекция\" в формате fb2, rtf, epub, pdf, txt или читать онлайн. Рейтинг книги составляет 4.78 из 5. Здесь так же можно перед прочтением обратиться к отзывам читателей, уже знакомых с книгой, и узнать их мнение. В интернет-магазине нашего партнера вы можете купить и прочитать книгу в бумажном варианте.";
        String path = "C:\\Users\\tjomka777tjomka777\\IdeaProjects\\HPotter\\" +
                "Harry_Potter_and_the_Goblet_of_Fire_Joanne_Kathleen_Rowling.txt";
        String myString = Files.readString(Paths.get(path));
        String myString2 = myString.toLowerCase().replaceAll("[^A-Za-zА-Яа-я ]", "");
                /*
                .replaceAll(",", "")
                .replaceAll("\\.", "")
                .replaceAll("!", "")
                .replaceAll("\\?", "")
                .replaceAll("\"", "");
                */
        final String[] array = myString2.split(" ");

        //массив уникальных слов
        String[] arrayDistinct = null;
/*
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
*/
        List<String> words = Arrays.asList(array);
        System.out.println(words.size());

        Map<String, Integer> glossary = new HashMap<>();
        for(String word:words)
        {
            if(glossary.containsKey(word))
            {
                Integer value = glossary.get(word);
                value++;
                glossary.put(word, value);
            }
            else
            {
                glossary.put(word, 1);
            }
        }

        System.out.println(glossary);
        final Map<String, Integer> sortedByCount = glossary.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue().reversed()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedByCount);

    }
}
