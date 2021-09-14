package Lesson6;

import Lesson6.zoo.*;

public class Classwork6 {

    public static void main(String[] args) {
 //       simpleExampleWitoutPoly();

        Animal[] animals = {
            new Cat("Matroskin", "grey"),
            new Dog("Sharik", "brown"),
            new Bird("Galchonok", "black"),
            new Snake("Kaa", "green"),
            new Parrot("Kesha", "purple")
            };
        for (Animal animal : animals) {
            animal.walk();
            animal.voice();
            if (animal instanceof  Bird) ((Bird)animal).fly();
            if (animal instanceof  Parrot) ((Parrot)animal).speak();

        };

//        for (int i = 0; i < animals.length; i++) {
//            animals[i].walk();
//            animals[i].voice();
//            if (i == 2) {
//                Bird b = (Bird) animals[i];
//                b.fly();
//            }
        }

        Snake animal = new Snake("Snake", "Gennadyi");
//        animal.walk();
//        animal.walkAsParents();




    private static void simpleExampleWitoutPoly() {
        Cat cat = new Cat("Matroskin", "grey");
        Dog dog = new Dog("Sharik", "brown");
        Bird bird = new Bird("Galchonok", "black");
        Snake snake = new Snake ("Kaa", "green");

        cat.voice();
        cat.walk();

        dog.voice();
        dog.walk();

        bird.voice();
        bird.walk();
        System.out.println(bird.getName());
    }


}
