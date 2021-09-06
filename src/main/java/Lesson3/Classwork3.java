package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Classwork3 {
    public static void main(String[] args) {
//        int[][] arr = new int[4][3]; // [строки][столбцы]
//        arr[3][1] = 10;
//
//        print2dArray(arr);
//        System.out.println(Arrays.deepToString(arr));
//
//        int[][] arrNonRegular = new int[4][];
//
//        arrNonRegular[0] = new int[] {1, 2, 3, 4, 5};
//        arrNonRegular[1] = new int[] {90, -15};
//        arrNonRegular[2] = new int[4];
//        arrNonRegular[3] = new int[] {0, 526, -41};
//
//        print2dArray(arrNonRegular);
//
//
//        int[][] arr2d = {
//                {1, 6, 90},
//                {-1, 256, 90,-14},
//                {36500, 69, 90, 13, 75, 3650},
//                {-385, 146},
//                {1, 6, 190}
//        };
//        print2dArray(arr2d);


        Scanner myScan = new Scanner(System.in);

        //myScan.useDelimiter("abc"); //разделитель "abc". По умолчанию действует пробел или пренос строки
        //String enter = myScan.next(); //печатает до разделитедя
        //String enter = myScan.nextLine(); // печатает троку до конца (разделительне работает)

//        myScan.useLocale(Locale.ENGLISH);
//        float f = myScan.nextFloat();
//
//
//        System.out.println(f);

        Random myRan = new Random();


        System.out.println(myRan.nextInt(400) - 200);




    }
    public static void print2dArray(int[][] arr){
       for (int y = 0; y < arr.length; y++){
           for (int x = 0; x < arr[y].length; x++){
               System.out.print(arr[y][x] + "  ");
           }
           System.out.println();
       }


    }

}
