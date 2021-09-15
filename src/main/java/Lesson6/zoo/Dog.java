package Lesson6.zoo;

public class Dog extends Animal{

    public Dog(String name, String color) {
        super(name, color, "Dog");
        countDogs++;
    }

    @Override
    public void voice() {
        System.out.printf("%s dog %s wow\n", this.color, this.name);
    }

    @Override
    public void swim(int i){
        if(i > 10) {
            System.out.printf("Dog %s can't swim this distance (%d).\n", name, i);
        } else {
            System.out.printf("Dog %s swim %d meters.\n", name, i);
        }
    }

       @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
