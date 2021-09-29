package Lesson11.Homework;

import java.util.ArrayList;

public class Box<T extends Fruit>{
    ArrayList<T> content = new ArrayList<>();

    public boolean compare(Box<Fruit> box2) {
        if (getMass() - box2.getMass() < 0.0001) return true;
        return false;
    }
    
    public void emptyInto (Box<Fruit> box2) {
        if (!getFruitType().equals(box2.getFruitType())) {
            System.out.println("Тип фрукта не совпадает");
        } else {
            for (T t : content) {
                box2.put(t);
            }
            content.clear();
        }
    }
    public String getFruitType () {
        return content.get(0).getClass().toString();
    }

    public float getMass () {
        float mass = 0;
        for (T t : content)
        {
            mass += t.getWeight();
        }
        return mass;
    }
    public void put (T fruit) {
        content.add(fruit);
    }
}
