package Lesson9;

public class MyArrayDataException extends ArrayStoreException {
    //Немного экспериментов
    private int x;
    private int y;

    //Немного экспериментов
    public MyArrayDataException(String s, int x, int y) {
        super(s);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
