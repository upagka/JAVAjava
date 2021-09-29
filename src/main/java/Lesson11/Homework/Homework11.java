package Lesson11.Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework11 {

    public static void main(String[] args) {

        //Задание 1:
        String[] strings = new String[]{
                "Vasya", "Petr", "Yura", "Katya", "Olya"
        };

        change(strings, 1, 3);


        Integer[] ints = new Integer[] {
          23, 32, 43, 83, 11, 1, 4, 8
        };
        change(ints, 2, 7);

        //Задание 2:
        System.out.println(toArrayList(strings).toString());
        System.out.println(toArrayList(ints).toString());



        //Задание 3:
        Box<Fruit> box1 = new Box<>();
        Box<Fruit> box2 = new Box<>();
        Box<Fruit> box3 = new Box<>();

        Apple apple1 = new Apple(25);
        Apple apple2 = new Apple(15);
        Orange orange1 = new Orange(21.7f);
        Orange orange2 = new Orange(18.3f);
        Apple apple3 = new Apple(8);
        Apple apple4 = new Apple(29);

        box1.put(apple1);
        box1.put(apple2);
        box2.put(orange1);
        box2.put(orange2);
        box3.put(apple3);
        box3.put(apple4);

        System.out.println("Масса ящика с яблоками:" + box1.getMass());
        System.out.println("Масса ящика с апельсинами:" + box2.getMass());
        System.out.println("Масса еще одного ящика с яблоками:" + box3.getMass());
        System.out.println("Сравниваем первый и второй ящик:");
        System.out.println(box1.compare(box2));
        System.out.println("Сравниваем первый и третий ящик:");
        System.out.println(box1.compare(box3));
        System.out.println();

        System.out.println("Попытка засыпать яблоки в апельсины");
        box1.emptyInto(box2);
        System.out.println("Ящик номер 1: " + box1.getMass());
        System.out.println("Ящик номер 2: " + box2.getMass());
        System.out.println("Ящик номер 3: " + box3.getMass());

        System.out.println("Сыпем яблоки в яблоки");
        box1.emptyInto(box3);
        System.out.println("Ящик номер 1: " + box1.getMass());
        System.out.println("Ящик номер 2: " + box2.getMass());
        System.out.println("Ящик номер 3: " + box3.getMass());
    }

    private static <T> void printArr(T[] array) {
        for (T element : array) {
            System.out.print(element + ", ");
        }
    }

    public static <T> ArrayList<T> toArrayList (T[] array){
        return new ArrayList<>(Arrays.asList(array));
    }


    public static <T> void change(T[] array, int a, int b) {
        if (a >= array.length || b >= array.length) {
            System.out.println("Невозможно обработать массив");
            return;
        }
        T temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
