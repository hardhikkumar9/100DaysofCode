import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs {

    public static void main(String[] args) {
    args(44, 55, 1, 77, 9, 110, 12, 54);
    Multiple(22, 67, "Hardhik", "Rachit", "Gunaj");
    }

    static void args(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    // Multiple variable arguments
    static void Multiple(int a, int b, String ...v){
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
