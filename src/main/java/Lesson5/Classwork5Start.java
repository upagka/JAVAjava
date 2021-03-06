package Lesson5;

public class Classwork5Start {

    public static void main(String[] args) {
    //Тип   Имя переменной  команда выделения памяти    Вызов конструктора
    // Cat   cat1          = new                       Cat();

        Cat cat1 = new Cat();
        cat1.name = "Barsik";
        cat1.color = "black";
        cat1.age = 3;

        Cat cat2 = new Cat();
        cat2.name = "Murzik";
        cat2.color = "white";
        cat2.age = 2;


        Cat cat3 = new Cat("Vaska", "orange", 24);


        cat1.walk();
        cat1.voice();

        cat2.walk();
        cat2.voice();

        cat3.walk();
        cat3.voice();


        Cat[] cats = {
                new Cat("Marusya", "colorful", 4),
                new Cat("Matilda", "white",6),
                new Cat("Comet", "black", 2)
        };

        System.out.println(cat2);

        for(Cat cat : cats){
            System.out.println(cat);
            cat.walk();
            cat.voice();

        }



    }

}
