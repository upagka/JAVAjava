package Lesson6.zoo;

public class Dog extends Animal{

    public Dog(String name, String color) {
        super(name, color);
    }

    public void voice() {
        System.out.printf("%s dog %s wow\n", this.color, this.name);
    }

    public void walk() {
        System.out.printf("%s dog %s walks on paws\n", this.color, this.name);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
