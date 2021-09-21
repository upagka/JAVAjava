package Lesson9;

public class Homework {
    public static void main(String[] args) {

        String myString[][] = {
                {"32", "34", "43", "55"},
                {"11", "3", "64", "Text here"},
                {"55", "92", "154", "3"},
                {"39", "18", "8", "9"}
        };
        String myString2[][] = {
                {"1", "34", "43", "55"},
                {"11", "3", "64", "15", "944", "61"},
                {"55", "92", "154", "3"},
                {"39", "18", "8", "9"}
        };
        try {
            System.out.println(quadArraySum(myString));
            System.out.println(quadArraySum(myString2));

        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
            System.out.println("Координаты ячейки с несоответсвующим содержимым: строка: " + e.getY() + ", столбец: " + e.getX());
        } catch (MyArraySizeException e) {
            System.out.println("Расчёт не завершен, так как размер массива отличается от заданного (4х4).");
        }
    }
    public static int quadArraySum(String[][] myArray) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (myArray.length != 4) throw new MyArraySizeException();
        for (int y = 0; y < 4; y++) {
            if (myArray[y].length != 4) throw new MyArraySizeException();
            for (int x = 0; x < 4; x++) {
                String regex = "\\d+";
                //Немного экспериментов
                if(!myArray[y][x].matches(regex)) throw new MyArrayDataException(
                        "Значение не является числом.", x+1, y+1);
                sum += Integer.parseInt(myArray[y][x]);
            }
        }
        return sum;
    }
}
