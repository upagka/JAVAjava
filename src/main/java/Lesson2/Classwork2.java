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



