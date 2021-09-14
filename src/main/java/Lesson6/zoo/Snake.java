package Lesson6.zoo;

import java.sql.SQLOutput;

public class Snake extends Animal{

    public Snake(String name, String color) {
        super(name, color, "Snake");
    }

    @Override
    public void walk(){
        System.out.printf ("%s %s %s crawling\n",
                this.color, this.type, this.name);
    }

    @Override
    public void voice() {
        System.out.printf("%s snake %s Shhhh\n", this.color, this.name);
    }

    public void walkAsParents(){
        super.walk();
    }

       @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
