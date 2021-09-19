package Lesson8.Homework;

public class Cat implements Moving {
    private String name;
    private boolean tired;
    private int maxDistance;
    private int maxHeight;

    public Cat(String name, int maxDistance, int maxHeight) {
        this.name = name;
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
    }
    public boolean run(Path path){
        if (this.tired) {
            System.out.printf("Cat %s is already tired.\n", this.name);
            return false;
        } else {
            if (path.getDistance() > this.maxDistance) {
                System.out.printf("Cat %s couldn't run this distance (%d). He tired.\n", this.name, path.getDistance());
                this.tired = true;
                return false;
            } else {
                System.out.printf("Cat %s have run this distance (%d).\n", this.name, path.getDistance());
                return true;
            }

        }

    }
    public boolean jump(Barrier barrier){
        if (this.tired) {
            System.out.printf("Cat %s is already tired.\n", this.name);
            return false;
        } else {
            if (barrier.getHeight() > this.maxHeight) {
                System.out.printf("Cat %s couldn't jump this height (%d). He tired.\n", this.name, barrier.getHeight());
                this.tired = true;
                return false;
            } else {
                System.out.printf("Cat %s have jumped this height (%d).\n", this.name, barrier.getHeight());
                return true;
            }
        }

    }

    public boolean isTired() {
        return tired;
    }

    public String getName() {
        return name;
    }
}
