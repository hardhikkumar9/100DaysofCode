import java.lang.reflect.Array;
import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {

        //create an array
        int[] arr = {1, 4, 5, 33, 64, 2};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int nums[]) {
        nums[0] = 99; //if you make a change to the obj via reference variable, same obj will be changed
    }
}
