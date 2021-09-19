package Lesson8.Classwork;

public class Classwork8 {
    public static void main(String[] args) {


        Duck duck = new Duck();
        Plane plane = new Plane();
        Balloon balloon = new Balloon();

        duck.fly();
        plane.fly();
        balloon.fly();

        System.out.println(duck instanceof Flyable);

        Flyable[] flyables = {
          duck,
          balloon,
          new Duck(),
          new Plane(),
        };


        for (Flyable flyable : flyables) {
            flyable.fly();

        }

    }


}
