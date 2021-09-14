package Lesson6.zoo;

public class Animal {
    protected String name;
    protected String color;
    protected String type;

    public Animal() {
        System.out.println("Animal born!");
    }

    public Animal(String name, String color, String type) {
        this();
        this.name = name;
        this.color = color;
        this.type = type;
    }

    public void walk() {
        System.out.printf("%s %s %s walks on paws\n",
                this.color, this.type, this.name);
    }
//    public abstract void voice ();
    public void voice() {
        System.out.printf("%s animal %s make some sound\n",
                this.color, this.type, this.name);
    }

    public String getType() {return type;}

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }



}
