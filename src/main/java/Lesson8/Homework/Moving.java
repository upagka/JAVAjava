package Lesson8.Homework;

public interface Moving {
    boolean run(Path path);
    boolean jump(Barrier barrier);
    boolean isTired();
    String getName();
}
