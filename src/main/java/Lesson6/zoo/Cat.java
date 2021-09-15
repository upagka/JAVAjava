package Lesson6.zoo;

public class Cat extends Animal {

 //   private  String name; // Движение животного работает с Animal, а имя работает с этого файла, он считывает,
    // но бы не даем значение этому name, поэтому выводит 'null', компилятор в первую очередь считывает этот лист.
    // Раз здесь ечть name, то он его и считывает.Для того, чтобы он считывал Имя из материнского файла,
    // несмотря на этот метод, необходимо ниже в пеернапреавленных методах прописывать "super.name".

    public Cat(String name, String color) {
        super(name, color, "Cat");
        countCats++;
    }

    @Override
    public void voice() {
        System.out.printf("%s cat %s meaw\n", this.color, this.name);
    }

    @Override
    public  void swim(int i){
        System.out.printf("Cats can't swim!\n");
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
