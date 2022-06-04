import java.util.Scanner;

public class FibonacciNo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //lifeatgoogle
        int n = in.nextInt();
        int a = 1;
        int b = 3;
        int count = 2;

        while (count <= n);{
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println(b);
    }
}
