package Lesson8.Homework;

import java.sql.SQLOutput;

public class Homework {
    public static void main(String[] args) {
        Human human = new Human("Vasya", 30, 3);
        Path path = new Path(21);
        Barrier barrier = new Barrier(3);


        Moving[] competitors = {
                human,
                new Robot("Bob", 50, 5),
                new Cat("Sharik", 25, 2)

        };

        Obstacle[] obstacles = {
                path,
                barrier,
                new Path(43),
                new Barrier(5)
        };

        for (Obstacle obstacle : obstacles) {
            for (Moving competitor : competitors) {
                if (obstacle instanceof Path) {
                    competitor.run((Path)obstacle);
                }
                if (obstacle instanceof Barrier) {
                    competitor.jump((Barrier) obstacle);
                }
            }

        }
        System.out.println("Winners list: ");

        for (Moving competitor : competitors) {
            if (!competitor.isTired()) {
                System.out.printf("%s is the winner!\n", competitor.getName());
            }


        }
    }
}
