package Lesson2;

public class Homework2 {
    static public void main(String[] args) {

        ex1();
        System.out.println();
        ex2();
        System.out.println();
        ex3();
        System.out.println();
        ex4();
        System.out.println();
//        exercise5
        int[] bal = {2, 13, 2, 1, 2, 2, 10, 1, 4};
        System.out.println(ex5(bal));

    }

    public static boolean ex5(int[] balance) {

        int leftSide = balance[0];
        int rightSide = balance[balance.length - 1];
        int rightPosition = balance.length - 2;
        int leftPosition = 1;

        do {
            if (leftSide > rightSide) {
                rightSide += balance[rightPosition--];
            }
            else {
                leftSide += balance[leftPosition++];
            }
        } while (leftPosition != rightPosition + 1);

        if (leftSide == rightSide) {
            return true;
        }
        else {
            return false;
        }
    }

    private static void ex4() {
        int[] minMax = {6, 15, 3, 2, 11, -4, 5, 2, 78, 8, 9, 1};
        int minDigit = minMax[0];
        int maxDigit = minMax[0];

        for (int element : minMax) {
            if (minDigit > element) {
                minDigit = element;
            }
            if (maxDigit < element) {
               maxDigit = element;
            }
        }

        System.out.println("Min: " + minDigit + "; " + "Max: " + maxDigit);
    }

    private static void ex3() {
        int[] lessSix = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int element : lessSix) {
            if (element < 6) {
                element *= 2;
            }
            System.out.print(element + " ");
        }
    }

    private static void ex2() {
        int[] plus3 = new int[8];
        for (int i = 0, j = 0; i < plus3.length; i++, j += 3) {
            plus3[i] = j;
            System.out.print(plus3[i] + " ");
        }
    }

    private static void ex1() {
        int[] zeroOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int element : zeroOne) {
            if (element == 1){
                element = 0;
            }
            else {
                element = 1;
            }
            System.out.print(element + " ");
        }
    }






}
