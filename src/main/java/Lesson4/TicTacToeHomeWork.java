package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToeHomeWork {
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_AI = '0';
    private static final char DOT_EMPTY = '.';
    private static final int QTY_WIN = 4;
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    private static char[][] field;

    private static int fieldSizeX;
    private static int fieldSizeY;
    private static int scoreHuman;
    private static int scoreAI;
    private static int roundCounter = 1;

    public static void main(String[] args) {
        play();
    }

    private static void play() {
        while (true) {
            playRound();
            System.out.printf("SCORE: HUMAN    AI\n" +
                    "         %d      %d\n", scoreHuman, scoreAI);
            System.out.print("Wanna play again? Y or N >>>> ");
            if (!SCANNER.next().toLowerCase().equals("y")) {
                System.out.println("Good bye!");
                break;
            }
        }

    }

    private static void playRound() {
        System.out.printf("ROUND %d\n", roundCounter++);
        initField(5, 5);
        printField();

        while (true) {
            humanTurn();
            printField();
            if (checkGame(DOT_HUMAN)) break;
            aiTurn();
            printField();
            if (checkGame(DOT_AI)) break;
        }
    }

    private static boolean checkGame(char dot) {
        if (checkDraw()) return true;
        if (checkWin(dot)) {
            if (dot == DOT_HUMAN) {
                System.out.println("YOU ARE THE CHAMPION!!!");
                scoreHuman++;
            } else {
                System.out.println("YOU LOST!!! DON'T CRY =)");
                scoreAI++;
            }
            return true;
        }
        return false;
    }

    private static void humanTurn() {
        int x, y;

        do {
            System.out.print("Please enter coordinates of your turn x & y split by whitespace >>>> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isCellValid(y, x) || !isCellEmpty(y, x));

        field[y][x] = DOT_HUMAN;
    }

    //***** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.
    private static void aiTurn() {
        int x, y;
        int checkX, checkY;
        boolean isTurn = false;

        for (x = 0; x < fieldSizeX; x++) {
            for (y = 0; y < fieldSizeY; y++) {
                if (field[y][x] == DOT_HUMAN) {
                    for (int i = -1; i <= 1; i++) {
                        for (int j = -1; j <= 1; j++) {
                            checkX = x + i;
                            checkY = y + j;
                            if (isCellValid(checkY, checkX)) {
                                if (field[checkY][checkX] == DOT_HUMAN) {
                                    if (isCellValid(y - j, x - i)) {
                                        if (isCellEmpty(y - j, x - i)) {
                                            field[y - j][x - i] = DOT_AI;
                                            isTurn = true;
                                        }
                                    }
                                }

                            }
                            if (isTurn) break;
                        }
                        if (isTurn) break;
                    }
                }
                if (isTurn) break;
            }
            if (isTurn) break;
        }
        if (!isTurn) {
            do {
                x = RANDOM.nextInt(fieldSizeX);
                y = RANDOM.nextInt(fieldSizeY);
            } while (!isCellEmpty(y, x));
            field[y][x] = DOT_AI;
        }
    }

    private static boolean checkDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (isCellEmpty(y, x)) return false;
            }
        }
        System.out.println("DRAW!!!");
        return true;
    }

    //Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
    //*Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
    //*** Попробовать сделать универсальную проверку, для произвольной длины последовательности
    // и произвольного размера поля
    private static boolean checkWin(char dot) {
        int scoreX = 0;
        int scoreY = 0;
        int scoreZ = 0;
        int scoreW = 0;

        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if(field[y][x] == dot){
                    scoreX++;
                    if (scoreX == QTY_WIN){
                        return true;
                    }
                } else {
                    scoreX = 0;
                }
                if(field[x][y] == dot){
                    scoreY++;
                    if (scoreY == QTY_WIN){
                        return true;
                    }
                } else {
                    scoreY = 0;
                }
                
            }
            scoreX = 0;
            scoreY = 0;

        }
        scoreX = 0;
        scoreY = 0;

        for (int y = fieldSizeY - QTY_WIN; y >= 0; y--) {
            for (int i = 0; i < fieldSizeY - y; i++) {
                if(field[y + i][i] == dot){
                    scoreY++;
                    if (scoreY == QTY_WIN){
                        return true;
                    }
                } else {
                    scoreY = 0;
                }
                if(field[i][i + y] == dot){
                    scoreX++;
                    if (scoreX == QTY_WIN){
                        return true;
                    }
                } else {
                    scoreX = 0;
                }
                if(field[y + i][fieldSizeY - i - 1] == dot){
                    scoreZ++;
                    if (scoreZ == QTY_WIN){
                        return true;
                    }
                } else {
                    scoreZ = 0;
                }
                if(field[i][fieldSizeX - y - i - 1] == dot){
                    scoreW++;
                    if (scoreW == QTY_WIN){
                        return true;
                    }
                } else {
                    scoreW = 0;
                }



            }
            scoreY = 0;
            scoreX = 0;
            scoreZ = 0;
            scoreW = 0;

        }

        
        
        
        
        
        return false;
        











//        //hor
//        if (field[0][0] == dot && field[0][1] == dot && field[0][2] == dot) return true;
//        if (field[1][0] == dot && field[1][1] == dot && field[1][2] == dot) return true;
//        if (field[2][0] == dot && field[2][1] == dot && field[2][2] == dot) return true;
//
//        //ver
//        if (field[0][0] == dot && field[1][0] == dot && field[2][0] == dot) return true;
//        if (field[0][1] == dot && field[1][1] == dot && field[2][1] == dot) return true;
//        if (field[0][2] == dot && field[1][2] == dot && field[2][2] == dot) return true;
//
//        //diag
//        if (field[0][0] == dot && field[1][1] == dot && field[2][2] == dot) return true;
//        if (field[0][2] == dot && field[1][1] == dot && field[2][0] == dot) return true;
//        return false;
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
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
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
        for (int i = 0; i <= fieldSizeX * 2 + 1; i++) {
            System.out.print("_");
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