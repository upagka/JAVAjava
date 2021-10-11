package Lesson13;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Car implements Runnable {
    private static int CARS_COUNT;
    static {
        CARS_COUNT = 0;
    }
    private Race race;
    private int speed;
    private String name;
    public String getName() {
        return name;
    }
    public int getSpeed() {
        return speed;
    }
    public Car(Race race, int speed) {
        this.race = race;
        this.speed = speed;
        CARS_COUNT++;
        this.name = "Участник #" + CARS_COUNT;
    }
    @Override
    public void run() {
        ExecutorService fourThreads = Executors.newFixedThreadPool(4);
        ExecutorService twoThreads = Executors.newFixedThreadPool(2);
        final Object mon = new Object();
        for (int i = 0; i < race.getStages().size(); i++) {
            //Не смогла разобраться, как сделать так, чтобы каждый цикл ждал окончания задачи в предыдущем.
            if (race.getStages().get(i).getClass().getName() == "Lesson13.Road") {
                int finalI = i;
                fourThreads.submit(() -> race.getStages().get(finalI).go(this));

            } else {
                int finalI1 = i;
                twoThreads.submit(() -> race.getStages().get(finalI1).go(this));
            }
        }


    }
    public boolean prepare() {
        try {
            System.out.println(this.name + " готовится (скорость: " + speed + ")");
            Thread.sleep(500 + (int)(Math.random() * 800));
            System.out.println(this.name + " готов");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}