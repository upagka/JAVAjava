package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Homework3 {

    public static void main(String[] args) {

//        int[][] arr = new int[8][8]; // [строки][столбцы]
//        ex1(arr);
//        print2dArray(arr);

//        ex2();

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
