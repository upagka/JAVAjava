package Lesson8.Homework;

public class Homework {
    public static void main(String[] args) {
        Human human = new Human("Vasya", 20, 3);
        Path path = new Path(21);
        Barrier barrier = new Barrier(3);
        human.run(path);
        System.out.println(human.isTired());

        Moving[] competitors = {
                human,
                new Robot("Bob", 15, 5),
                new Cat("Sharik", 25, 2)


        };
        for (Moving competitor : competitors) {
            competitor.run(path);
            competitor.jump(barrier);
        }
    }
}
