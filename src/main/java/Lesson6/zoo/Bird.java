package Lesson6.zoo;

public class Bird extends Animal {

    public Bird(String name, String color) {
        super(name, color, "Bird");
    }

    @Override //Значение, что метод переопределен
    public void voice() {
        System.out.printf("%s bird %s sings\n", this.color, this.name);
    }

    public  void fly() {
        System.out.printf("%s bird %s flies\n", this.color, this.name);
    }

    @Override
    public  void swim(int i){
        System.out.printf("Birds can't swim!\n");
    }

//    @Override
//    public void swim(int distance) {
//        System.out.println("Birds can't swim");
//    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
