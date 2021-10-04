package Lesson12;

public class Homework12 {
    public static void main(String[] args) {
        multith();
        monoth();
    }

    public static void monoth() {
        final int SIZE = 10_000_000;
        float[] arr = new float[SIZE];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        mathMeth(0, arr.length, arr);
        System.out.println("The result without multithreading: " + (System.currentTimeMillis() - a) + "ms");

    }

    public static void multith(){
        final int SIZE = 10_000_000;
        final int QUATER = SIZE/4;
        float[] arr = new float[SIZE];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();


        Thread myThread1 = new Thread(() -> mathMeth(0, QUATER, arr));
        Thread myThread2 = new Thread(() -> mathMeth(QUATER, 2 * QUATER, arr));
        Thread myThread3 = new Thread(() -> mathMeth(2 * QUATER, 3 * QUATER, arr));
        Thread myThread4 = new Thread(() -> mathMeth(3 * QUATER, arr.length, arr));



        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();


        try {
            myThread1.join();
            myThread2.join();
            myThread3.join();
            myThread4.join();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        System.out.println("The result of multithreading: " + (System.currentTimeMillis() - a) + "ms");
    }

    public static void mathMeth(int start, int end, float arr[]){
        for (int i = start; i < end; i++) {
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
 }
