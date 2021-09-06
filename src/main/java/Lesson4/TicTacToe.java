package Lesson4;

import Lesson3.Classwork3;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final char DOT_HUMAN = 'x';
    private static final char DOT_AI = '0';
    private static final char DOT_EMPTY = '.';

    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();
    public static char[][] field;

    private static int fieldSizeX;
    private static int fieldSizeY;
    private static int scoreHuman;
    private static int scoreAi;

    public static void main(String[] args) {

        initField(3, 3);
        printField();



    }

    private static void initField(int sizeX, int sizeY) {
        fieldSizeY = sizeY;
        fieldSizeX = sizeX;
        field = new char[sizeY][sizeX];
        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }

    }

    static void printField() {
        System.out.print(" ");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print(i % 2 == 0 ? "_" : i / 2 + 1);
        }
        System.out.println();
        for (int i = 0; i < fieldSizeY; i++) {
            System.out.print(i + 1 + "|");
            for (int j = 0; j < fieldSizeX; j++) {
                System.out.print(field[i][j] + "|");
            }
            System.out.println();
        }
        System.out.print(" ");
        for (int i = 0; i < fieldSizeX * 2 + 1; i++) {
            System.out.print('\u0305');
        }
        System.out.println();





//        for (int y = 0; y < fieldSizeY; y++) {
//            for (int x = 0; x < fieldSizeX; x++) {
//                System.out.print(field[y][x] + "  ");
//            }
//            System.out.println();
//        }
    }

}
