import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
        1 2 3
        4 5 6
        7 8 9
         */

//        int[][] arr = new int[3][];
//
//        int[][] arr2d = {
//            {1, 2, 3}, //0th index
//            {4, 5, 6}, //1st index
//            {7, 8, 9} //2nd index  -> arr2d[2] = {7, 8, 9}
//        };
//        System.out.println(Arrays.toString(arr2d[2]));



        int[][] arr = new int[3][3];
        System.out.println(arr.length); //print no of rows

        // Input
        for (int row = 0; row < arr.length; row++) { //For every Row it is running
            //for each col in every row
            for (int col = 0; col < arr[row].length; col++) { //For every column it is running
                arr[row][col] = in.nextInt();
            }
        }

        // Output
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row])); //for printing in matrix form whenever the row get input & get over
        }

        // Enhanced output using for loop

        for (int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
