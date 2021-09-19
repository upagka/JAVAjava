package Lesson8.Homework;

public class Human implements Moving {
    private String name;
    private boolean tired;
    private int maxDistance;
    private int maxHeight;

    public Human(String name, int maxDistance, int maxHeight) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }

    public boolean run(Path path){
        if (path.getDistance() > this.maxDistance) {
            System.out.printf("Human %s couldn't run this distance (%d). He tired.\n", this.name, path.getDistance());
            this.tired = true;
            return false;
        } else {
            System.out.printf("Human %s have run this distance (%d).\n", this.name, path.getDistance());
            return true;
        }

    }
    public boolean jump(Barrier barrier){
        if (barrier.getHeight() > this.maxHeight) {
            System.out.printf("Human %s couldn't jump this height (%d). He tired.\n", this.name, barrier.getHeight());
            this.tired = true;
            return false;
        } else {
            System.out.printf("Human %s have jumped this height (%d).\n", this.name, barrier.getHeight());
            return true;
        }

    }

    public String getName() {
        return name;
    }

    public boolean isTired() {
        return tired;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public int getMaxHeight() {
        return maxHeight;
    }
}
