package Lesson6.zoo;

public abstract class Animal {
    protected String name;
    protected String color;
    protected String type;
    protected static int countCats = 0;
    protected static int countDogs = 0;
    protected static int countAnimals = 0;

    public Animal() {
        System.out.println("Animal born!");
        countAnimals++;
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
    public void run(int i) {

        if((type == "Dog" && i > 500) || (type == "Cat" && i > 200)) {
            System.out.printf("%s %s can't run so far (%d).\n", type, name, i);
        } else {
            System.out.printf("%s %s run %d meters.\n", type, name, i);
        }

//        System.out.printf("%s cat %s run\n", this.color, this.name);
    }

    public abstract void swim(int i);

    public String getType() {return type;}

    public String getName() {
        return name;
    }

    public static int getCountCats() {
        return countCats;
    }

    public static int getCountDogs() {
        return countDogs;
    }

    public static int getCountAnimals() {
        return countAnimals;
    }

    public String getColor() {
        return color;
    }



}
