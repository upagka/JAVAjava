public class Homework3 {

    public static void main(String[] args) {

//        int[][] arr = new int[8][8]; // [строки][столбцы]
//        ex1(arr);
//        print2dArray(arr);



    }

    private static void ex1(int[][] arr) {
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                if (x == y) {
                    arr[y][x] = 1;
                }
                if (x == arr.length - y - 1) {
                    arr[y][x] = 1;
                }

            }
        }
    }


    static void print2dArray(int[][] arr){
        for (int y = 0; y < arr.length; y++){
            for (int x = 0; x < arr[y].length; x++){
                System.out.print(arr[y][x] + "  ");
            }
            System.out.println();
        }


    }


}
