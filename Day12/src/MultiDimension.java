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

        int[][] arr = new int[3][];

        int[][] arr2d = {
            {1, 2, 3}, //0th index
            {4, 5, 6}, //1st index
            {7, 8, 9} //2nd index  -> arr2d[2] = {7, 8, 9}
        };
        System.out.println(Arrays.toString(arr2d[2]));

        // Input


    }
}
