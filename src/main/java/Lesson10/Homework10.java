package Lesson10;

import java.util.HashMap;
import java.util.List;


public class Homework10 {
    public static void main(String[] args) {
        String[] words = {
                "bike",         //2
                "car",          //1
                "gold",         //3
                "asus",         //1
                "beer",         //3
                "translator",   //1
                "Java",         //2
                "dog",          //1
                "cat",          //1
                "bird",         //1
                "java",         //2
                "GOLD",         //3
                "bike",         //2
                "love",         //1
                "BEER",         //3
                "mobile",       //1
                "GREEN",        //1
                "gold",         //3
                "nature",       //1
                "beer",         //3
        };


        MyHashMap<String, List<String>> contacts = new MyHashMap<>();

        contacts.add("Иванов", "+7 701 358 15 55");
        contacts.add("Иванов", "+7 778 885 97 61");
        contacts.add("Петров", "+7 702 997 12 12");
        contacts.add("Сидоров", "+7 705 555 65 65");
        contacts.add("Дубынин", "+7 778 979 91 91");
        contacts.add("Петров", "+7 777 972 25 25");
        contacts.add("Никольская", "+7 701 694 18 13");
        contacts.add("Петров", "+7 708 979 37 37");

        printContacts(contacts);


        countWords(words);
    }

    private static void printContacts(MyHashMap<String, List<String>> contacts) {
        for (String s : contacts.keySet()) {
            System.out.println(s + ": " + contacts.get(s));
        }
    }


    private static void countWords(String[] words) {
        HashMap<String, Integer> wordsCounter = new HashMap<>();

        for (String word : words) {
            word = word.toLowerCase();
            if(wordsCounter.containsKey(word)) {
                wordsCounter.put(word, wordsCounter.get(word)+1);
            } else {
                wordsCounter.put(word, 1);
            }
        }
        System.out.println("Уникальные слова:");
        for (String s : wordsCounter.keySet()) {
            if(wordsCounter.get(s) == 1) System.out.println(s);
        }
        System.out.println("Количество слов:");
        for (String s : wordsCounter.keySet()) {
            System.out.println(s + ": " + wordsCounter.get(s));
        }
    }
}
