package Lesson8.Homework;

public class Robot implements Moving {
    private String name;
    private boolean tired;
    private int maxDistance;
    private int maxHeight;

    public Robot(String name, boolean tired, int maxDistance, int maxHeight) {
        this.name = name;
        this.tired = tired;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }
    public boolean run(Path path){
        if (path.getDistance() > this.maxDistance) {
            System.out.printf("Robot %s couldn't run this distance (%d). He tired.\n", this.name, path.getDistance());
            return false;
        } else {
            System.out.printf("Robot %s have run this distance (%d).\n", this.name, path.getDistance());
            return true;
        }

    }
    public boolean jump(Barrier barrier){
        if (barrier.getHeight() > this.maxHeight) {
            System.out.printf("Human %s couldn't jump this height (%d). He tired.\n", this.name, barrier.getHeight());
            return false;
        } else {
            System.out.printf("Human %s have jumped this height (%d).\n", this.name, barrier.getHeight());
            return true;
        }

    }

}
