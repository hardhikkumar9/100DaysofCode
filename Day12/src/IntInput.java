import java.util.Arrays;
import java.util.Scanner;

public class IntInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Arrays of primitive

        int arr[] = new int[6];
        arr[0] = 33;
        arr[1] = 64;
        arr[2] = 39;
        arr[3] = 13;
        arr[4] = 24;
        arr[5] = 332;

        System.out.println(arr[4]);

        //input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        //1st way to print

        System.out.println(Arrays.toString(arr));

        //2nd way to print

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //3rd way to print

        for(int num : arr) { // for every element in the array print the element
            System.out.print(num + " "); //Here num represent element of an array
        }


    }
}
