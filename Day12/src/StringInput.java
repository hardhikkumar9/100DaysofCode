import java.util.Arrays;
import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Arrays of object

        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.toString();
        }
        System.out.println(Arrays.toString(str));


        //modify
        str[1] = "Kaku";
        System.out.println(Arrays.toString(str));


    }
}
