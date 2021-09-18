package Lesson7;

public class Cat {
    private String name;
    private int appetite;
    private Flea[] fleas;
    private boolean satiety = false;


    public Cat(String name, int appetite, int fleaCount) {
        this.name = name;
        this.appetite = appetite;
        this.fleas = new Flea[fleaCount];
        for (int i = 0; i < fleas.length; i++) {
            fleas[i] = new Flea();
        }

    }

    public void playWithFleas(){
        for (Flea flea : fleas) {
            flea.jump(this.name);
        }
        this.satiety = false;
        System.out.printf("Cat %s is hungry again after playing with fleas\n", this.name);

    }

    public void eat(Bowl bowl){
        if(satiety){
            System.out.printf("Cat %s is already full\n", this.name);
        } else {
            System.out.printf("Cat %s is ready to eat\n", this.name);
            if (bowl.descreaseFood(this.appetite)) {
                this.satiety = true;
                System.out.printf("Cat %s is full now\n", this.name);
            } else {
                System.out.printf("Cat %s is still hungry\n", this.name);
            }
        }

    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }
}
