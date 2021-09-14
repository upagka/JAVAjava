package Lesson6.zoo;

public class Parrot extends Bird {
    public Parrot(String name, String color) {
        super(name, color);
    }

    public void speak() {
        System.out.printf("Parrot %s: Hello owner!\n", name);
    }




}
