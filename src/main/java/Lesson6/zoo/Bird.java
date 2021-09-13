package Lesson6.zoo;

public class Bird extends Animal {

    public Bird(String name, String color) {
        super(name, color);
    }

    public void voice() {
        System.out.printf("%s bird %s sings\n", this.color, this.name);
    }

    public void walk() {
        System.out.printf("%s bird %s walks on paws\n", this.color, this.name);
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
