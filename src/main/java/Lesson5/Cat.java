package Lesson5;




    // Класс в java это тип данных

//модификатор доступа      класс            имя класса
 //   public                 class              Cat {

public class Cat {
    String name;
    String color;
    int age;

    Cat() {
        System.out.println("Cat was born!");

    }

    Cat(String color) {
        this();
        this.color = color;
    }

    Cat(String name, String color, int age) {
        this(color);
        this.name = name;   //this.name - это данные, которые введены в начале класса
        //this.color = color; //name -  аргумент метода, считываемый аргумент
        this.age = age;
    }


    //метод = действие
    void walk() {
        System.out.printf("Cat %s walk\n", name);
    }

    void voice() {
        System.out.printf("Cat %s meaw\n", name);
    }


    public String toString() {
        return String.format("Cat %s color: %s age: %d", this.name, this.color, this.age);
    }

}






