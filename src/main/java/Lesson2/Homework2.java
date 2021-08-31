package Lesson2;

public class Homework2 {
    static public void main(String[] args) {

 //       ex1();

//       ex2();


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
