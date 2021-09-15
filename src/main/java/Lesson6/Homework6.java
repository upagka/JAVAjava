package Lesson6;

import Lesson6.zoo.Animal;
import Lesson6.zoo.Cat;
import Lesson6.zoo.Dog;

public class Homework6 {

    public static void main(String[] args) {
        Cat cat = new Cat("Matroskin", "grey");
        Dog dog = new Dog("Sharik", "brown");
        Dog dog1 = new Dog("Mukhtar", "black");

        cat.run(150);
        dog.run(700);
        dog1.run(200);

        cat.run(400);
        dog.run(300);

        cat.swim(300);
        dog.swim(5);

        dog.swim(25);

        System.out.println("Количество животных: " + Animal.getCountAnimals());
        System.out.println("Количество кошек: " + Animal.getCountCats());
        System.out.println("Количество собак: " + Animal.getCountDogs());



    }

}
