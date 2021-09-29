package Lesson11.Classwork;

public class BoxWithNumbers<N extends Number> {
    private N[] numbers;

    public BoxWithNumbers(N... numbers) {
        this.numbers = numbers;
    }

    public  boolean equalsByAvg(BoxWithNumbers<? extends  Number> another) {
     return  avg() == another.avg();
    }

    public double avg() {
        return  sum() / numbers.length;
    }

    public double sum() {
       double sum = 0;
        for (N number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public N[] getNumbers() {
        return numbers;
    }

    public void setNumbers(N[] nuvbers) {
        this.numbers = numbers;
    }


}
