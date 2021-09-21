package Lesson6;

import Lesson6.zoo.Cat;
import Lesson6.zoo.Dog;

public class Homework {
    public static void main(String[] args) {
        Cat cat = new Cat("Matroskin", "grey");
        Dog dog = new Dog("Sharik", "brown");
        dog.run(700);
        cat.run(350);
        dog.run(400);
        cat.run(120);
        dog.swim(15);
        dog.swim(5);
        cat.swim(3);
    }
}
