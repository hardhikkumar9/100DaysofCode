import java.util.Scanner;

public class ReturnValueSum {
    public static void main(String[] args) {
        int ans = sumnew();
        System.out.println(ans);
    }

    static int sumnew() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter no. 1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter no. 2 : ");
        int num2 = in.nextInt();
        int sumnew = num1 + num2;
        return sumnew;
    }
}
