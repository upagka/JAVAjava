package Lesson2;

public class Classwork2 {
    public static void main(String[] args) {
        int choice = 1;
// vendingIf(choice);
// vendingSwitch(choice);
// vendingSwitchNew(choice);


// System.out.println(choice);
// vendingWhile(choice);
// postWhile(choice);
// forLoop(choice);

        int a1 = 155;
        int a2 = 56;
        int a3 = 625;
        int a4 = -254;
        int a5 = 36;
        int a6 = 1274;
        int a7 = 98;
        int a8 = 76;

    int[] intArray = new int[8];
    intArray[0] = a1;
    intArray[1] = a2;
    intArray[2] = a3;
    intArray[3] = a4;
    intArray[4] = a5;
    intArray[5] = a6;
    intArray[6] = a7;
    intArray[7] = a8;
//    intArray[8] = a1;

    System.out.println(intArray[3]);
    intArray[0] = intArray[5] + intArray[6];
    System.out.println(intArray[0]);

    String[] strings = new String[3];
    strings[0] = "Hello ";
    strings[1] = "world ";
    strings[2] = "!";

    for (int i = 0; i < strings.length; i++) {
      System.out.print(strings[i]);
    }
//      Обратный порядок
    for (int i = intArray.length - 1; i >=0; i--) {
        System.out.print(intArray[i] + " ");
    }






    } //end of main

    private static void forLoop(int choice) {
        // инициализация;       условие;       итерация
        for (int i = 0, j = 10; i < 11 && j > 0; i++, j -= 2) {
            System.out.printf("I = %d, J = %d\n", i, j);
            //printf - форматированный вывод. Внутри метод String.format()
            //%d - int
            //%c - character
            //%f - floating
            //%s - string
            //%b - boolean
//System.out.println("I = " + i + ", J = " + j);
        }
    }

    private static void postWhile(int choice) {
        do {
            choice++;
            if (choice % 2 != 0) continue;
            System.out.println(choice);
            if (choice > 15) break;
        } while (choice < 0);
    }

    private static void vendingWhile(int choice) {
        while (true) {
            choice++;
            if (choice % 2 != 0) continue;
            System.out.println(choice);
            if (choice > 15) break;
        }//end of while
    }

    public static void vendingSwitchNew(int choice){
        switch (choice) {
            case 1 -> System.out.println("Gives Snickers");

            case 2 -> System.out.println("Gives COca Cola");

            case 3 -> System.out.println("Gives Bounty");

        }
    } // end of vendingSwitchNew

    public static void vendingIf(int choice) {
        if (choice == 1) {
            System.out.println("Gives Snickers");
        } else if (choice == 2) {
            System.out.println("Gives Coca Cola");
        }
    } //end of vendingIf
    public static void vendingSwitch(int choice){
        switch (choice) {
            case 1:
                System.out.println("Gives Snickers");
                break;
            case 2:
                System.out.println("Gives COca Cola");
                break;
            case 3:
                System.out.println("Gives Bounty");
                break;
        }
    } // end of vendingSwitch
} // end of class



