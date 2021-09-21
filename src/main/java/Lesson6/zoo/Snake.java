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
    public void swim(int distance) {
        System.out.println("Snakes can't swim");
    }

    @Override
    public void voice() {
        System.out.printf("%s snake %s Shhhh\n", this.color, this.name);
    }

    public void walkAsParents(){
        super.walk();
    }

//    @Override
//    public  void swim(int i){
//        System.out.printf("Snakes can't swim!\n");
//    }

       @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
