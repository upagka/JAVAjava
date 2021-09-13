package Lesson6.zoo;

public class Cat extends Animal {

    public Cat(String name, String color) {
        super(name, color);
    }

    public void voice() {
        System.out.printf("%s cat %s meaw\n", this.color, this.name);
    }

    public void walk() {
        System.out.printf("%s cat %s walks on paws\n", this.color, this.name);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
