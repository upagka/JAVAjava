package Lesson6.zoo;

public class Dog extends Animal{

    public Dog(String name, String color) {
        super(name, color, "Dog");
    }

    @Override
    public void voice() {
        System.out.printf("%s dog %s wow\n", this.color, this.name);
    }


       @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
