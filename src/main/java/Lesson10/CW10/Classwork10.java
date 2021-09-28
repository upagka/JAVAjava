package Lesson10.CW10;

import java.util.*;
import java.util.function.Predicate;

public class Classwork10 {

    public static void main(String[] args) {
//      rawUse();
        ListExapmple();
    }

    private static void ListExapmple() {
        List<String> list = new ArrayList<>(); // в списках сохраняется порядок добавления элементов
        list.add("June");                      //можно хранить дубликаты
        list.add("Jule");
        list.add("August");
        list.add("December");
        list.add(0,"December");
        //      list.remove(0); // удаление по индексу
        //       list.remove("December"); // удаление по объекту, удалет первый попавшийся
        list.removeIf(new Predicate<String>() {             //на вход ждет предикат
            @Override                                   // Проходит весь список
            public boolean test(String s) {
                return s.startsWith("D");
            }
        });

        list.removeIf(s -> s.contains("ece"));
        list.addAll(List.of("April", "May", "November"));
        list.set(0, "February");

//        list.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return 0;
//            }
//        });

        list.sort((s1, s2) -> s1.length() - s2.length());

        System.out.println(list.get(4));
        System.out.println(list.contains("May")); // есть ли такой элемент в списке
        System.out.println(list.indexOf("May"));
        System.out.println(list);
        //       System.out.println(list.set());
        list.add(null);
        //       System.out.println(list.set());


        //обойти коллекцию   После моздания не смотрит ни на что, чтобы посмотрел надо вызвать next
//        Iterator<String> iterator = list.iterator();
//
//        while (iterator.hasNext()){
//            System.out.println( iterator.next());
//                iterator.remove();
//
//        }

//        for (String s : list) {
//            System.out.println("s");
//        }

        //       list.forEach(System.out::println);

        ArrayList<String> arrayList = (ArrayList<String>) list;
        LinkedList<String> linkedList = new LinkedList<>(); // знает только первый и последний элемент массива
           }


}
