package Lesson11.Homework;

import java.util.ArrayList;

public class Homework11 {

    public static void main(String[] args) {
        String[] strings = new String[]{
                "Vasya", "Petr", "Yura", "Katya", "Olya"
        };

        change(strings, 1, 3);
        printArr(strings);

        Integer[] ints = new Integer[] {
          23, 32, 43, 83, 11, 1, 4, 8
        };
        change(ints, 2, 7);
        printArr(ints);

        System.out.println(toArrayList(strings).toString());
        System.out.println(toArrayList(ints).toString());
    }

    private static <T> void printArr(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public static <T> ArrayList<T> toArrayList (T[] array){
        ArrayList<T> newArrayList = new ArrayList<>();
        for (T t : array) {
            newArrayList.add(t);
        }
        return newArrayList;
    }


    public static <T> boolean change( T[] array, int a, int b) {
        if (a >= array.length || b >= array.length) {
            System.out.println("Невозможно обработать массив");
            return false;
        }
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
        return true;
    }
}
