
import java.util.Scanner;

public class PrimeNum  {
    Scanner scn = new Scanner(System.in);
    int t = scn.nextInt();

    for (int i = 0, i < t, i++) {
        int n = scn.nextInt();

        int div = 2;
        while (div * div <= n) {
            if (n % div == 0) {
                break;
            }
            div++;
        }

        if (div * div > n) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

}
/*{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 2; i < n; ++i) {
            if (n % i ==0){
                System.out.println("Prime");
            }
            else {
                System.out.println("Not Prime");
            }
        break;
        }
    }
}*/
