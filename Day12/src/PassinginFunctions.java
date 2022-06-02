import java.util.Arrays;
import java.util.Scanner;

public class PassinginFunctions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.print(Arrays.toString(nums));
    }
    static void change(int[] arr) {
        arr[1] = 45;
    }
}
