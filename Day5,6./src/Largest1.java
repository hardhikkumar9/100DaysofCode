import java.util.Scanner;

public class Largest1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // find the largest of 3 no.

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a > b) {
            System.out.println(a);
        }
        else if (b > c) {
            System.out.println(b);
        }
        else {
            System.out.println(c);
        }


        // 2nd small option

        int max = Math.max(c, Math.max(a, b));
        System.out.println(max);
    }
}
