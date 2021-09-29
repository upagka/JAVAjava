package Lesson11.Classwork;

import Lesson11.Classwork.Box;
import Lesson11.Classwork.BoxGeneric;
import Lesson11.Classwork.BoxWithNumbers;

public class GenericsExample {

    public static void main(String[] args) {
//        SimpleBoxExample();

//        rawUse();


//        geneticBoxExample();

        BoxWithNumbers<Integer> boxWithNumbers = new BoxWithNumbers<>(1, 2, 3, 4, 5, 6);
        BoxWithNumbers<Integer> boxWithNumbers2 = new BoxWithNumbers<>(1, 2, 3, 4, 5, 6);
        BoxWithNumbers<Double> boxWithNumbersD = new BoxWithNumbers<>(1.0, 2.0, 3.0, 4.0, 5.0, 6.0);
        System.out.println(boxWithNumbers.sum());
        System.out.println(boxWithNumbers.equalsByAvg(boxWithNumbers2));
        System.out.println(boxWithNumbers.equalsByAvg(boxWithNumbersD));
    }

    private static void geneticBoxExample() {
        BoxGeneric<Integer> boxInt1 = new BoxGeneric<>(43);
        BoxGeneric<Integer> boxInt2 = new BoxGeneric<>(12);

        //......a lot string of code
        //boxInt1.setObj("JAVA");
        //......a lot string of code


        int sum = boxInt1.getObj() + boxInt2.getObj();

        System.out.println(sum);

        BoxGeneric<String> boxS1 = new BoxGeneric<>("Hello ");
        BoxGeneric<String> boxS2 = new BoxGeneric<>("world!");

        System.out.println(boxS1.getObj() + boxS2.getObj());
    }

    private static void rawUse() {
        BoxGeneric boxInt1 = new BoxGeneric(43);
        BoxGeneric boxInt2 = new BoxGeneric(12);

        //......a lot string of code
        //  boxInt1.setObj("JAVA");
        //......a lot string of code

        int sum = 0;

        if (boxInt1.getObj() instanceof Integer && boxInt2.getObj() instanceof  Integer) {
            sum = (Integer) boxInt1.getObj() + (Integer) boxInt2.getObj();
            System.out.println(sum);
        } else {
            System.out.println("Not a number");
        }
    }

    private static void SimpleBoxExample() {
        Box boxInt1 = new Box(43);
        Box boxInt2 = new Box(12);
        Box boxString1 = new Box("Hello");
        Box boxString2 = new Box("world!");

        //......a lot string of code
        //  boxInt1.setObj("JAVA");
        //......a lot string of code


        int sum = 0;

        if (boxInt1.getObj() instanceof Integer && boxInt2.getObj() instanceof  Integer) {
            sum = (Integer) boxInt1.getObj() + (Integer) boxInt2.getObj();
            System.out.println(sum);
        } else {
            System.out.println("Not a number");
        }
    }
}
