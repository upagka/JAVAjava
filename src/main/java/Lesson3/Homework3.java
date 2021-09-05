package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

       int[][] arr = new int[8][8]; // [строки][столбцы]
       ex1(arr);
       print2dArray(arr);

        ex2();

        ex3();


    }

    private static void ex3() {
        String[] words = {"apple", "orange", "lemon", "banana",
                "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango",
                "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        Scanner myScan = new Scanner(System.in);
        Random myRan = new Random();
        boolean done = false;
        String theWord = new String();
        String myWord = new String();
        theWord = words[myRan.nextInt(25)];
        // System.out.println(theWord);
        do {
            System.out.println("Введите слово:");
            myWord = myScan.next();
            if (theWord.equals(myWord)) {
                System.out.println("Вы выиграли! ");
                done = true;
            } else {
                for (int i = 0; i < 15; i++) {
                    if (i < theWord.length() && i < myWord.length()) {
                        if (theWord.charAt(i) == myWord.charAt(i)) {
                            System.out.print(theWord.charAt(i));
                        } else {
                            System.out.print("#");
                        }
                    } else {
                        System.out.print("#");
                    }
                }
            }
            System.out.println();
        } while (!done);
    }

    private static void ex2() {
        Scanner myScan = new Scanner(System.in);
        Random myRan = new Random();

        int ranx = myRan.nextInt(10);
        int tryn = 0;
        boolean done = false;
        int play = 0;
        int x = 0;
        do {
            ranx = myRan.nextInt(10);
            done = false;
            tryn = 0;
            do {

                System.out.println("Введите Ваше число в интервале от 0 до 9:");
                x = myScan.nextInt();

                if (ranx > x) {
                    System.out.println("Секретное число больше");
                    tryn++;
                }
                if (ranx < x) {
                    System.out.println("Секретное число меньше");
                    tryn++;
                }
                if (ranx == x) {
                    done = true;
                }
            } while (tryn < 3 && done == false);

            if (done == false) {
                System.out.println("Вы не угадали. Секретное число: " + ranx);
            } else {
                System.out.println("Вы угадали!");
            }
            System.out.println("Хотите сыграть еще? 1 - да, 0 - нет");

            play = myScan.nextInt();

        } while (play == 1);
    }


    private static void ex1(int[][] arr) {
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                if (x == y) {
                    arr[y][x] = 1;
                }
                if (x == arr.length - y - 1) {
                    arr[y][x] = 1;
                }

            }
        }
    }


    static void print2dArray(int[][] arr){
        for (int y = 0; y < arr.length; y++){
            for (int x = 0; x < arr[y].length; x++){
                System.out.print(arr[y][x] + "  ");
            }
            System.out.println();
        }


    }


}
