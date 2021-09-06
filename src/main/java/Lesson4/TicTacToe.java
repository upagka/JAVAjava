package Lesson4;



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
        humanTurn();
        printField();
        aiTurn();
        printField();
    }

    private static void humanTurn() {
        int x, y;

    do {
        System.out.print("Please enter coodinates of ypur turn x & y spit by whitespace >>>>>");
        x = SCANNER.nextInt() - 1;
        y = SCANNER.nextInt() - 1;
    } while (!isCellValid(y, x) || !isCellEmpty(y, x));
        field[y][x] = DOT_HUMAN;
    }

    private static void aiTurn() {
        int x, y;

    do {
        x = RANDOM.nextInt(fieldSizeX);
        y = RANDOM.nextInt(fieldSizeY);

        } while (!isCellEmpty(y, x));
        field[y][x] = DOT_AI;
    }


    private static boolean isCellValid(int y, int x) {
        return x >= 0 && y >= 0 && x < fieldSizeX && y < fieldSizeY;
    }
    private static boolean isCellEmpty(int y, int x) {
        return field[y][x] == DOT_EMPTY;
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
