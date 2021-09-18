package Lesson7;

public class CwPlusHw7 {
    public static void main(String[] args) {

      CatsAndBawls();



    }

    private static void CatsAndBawls() {
        Cat[] cats = {
                new Cat("Bulochka", 7, 0),
                new Cat("Kamochek", 12, 10),
                new Cat("Pusik", 5, 3)
        };

        Bowl bowl = new Bowl(13);

        System.out.println("At the start in the bowl: " + bowl.getFoodAmount());

        feedCats(cats, bowl);

        cats[2].playWithFleas();

        bowl.addFood(6);

        feedCats(cats, bowl);

//        for (Cat cat : cats) {
//            cat.playWithFleas();
//        }

        System.out.println("Finally in the bowl: " + bowl.getFoodAmount());
    }

    private static void feedCats(Cat[] cats, Bowl bowl) {
        for (Cat cat : cats) {
            cat.eat(bowl);

        }
    }

}