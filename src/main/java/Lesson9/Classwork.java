package Lesson9;

public class Classwork {
    public static void main(String[] args) {
        System.out.println("Start");

        try {
            System.out.println("Divide start");
            System.out.println(div2(10, 2));
            System.out.println("Dive end");
            System.out.println("Array exception start");
            generateException();
            System.out.println("Array exception end");
        } catch (ArithmeticException exception) {
            System.out.println("Caught exception");
//            exception.printStackTrace();
        }


        System.out.println("Finish");
    }

    private static  int div2(int a, int b) {
        return div1(a, b);
    }
    private static  int div1(int a, int b) {
        return div0(a, b);
    }

    private static  int div0(int a, int b) {
        return a/b;
    }

    private static  void  generateException() {
        int[] arr = {1, 2};
        System.out.println(arr[3]);
    }

}
