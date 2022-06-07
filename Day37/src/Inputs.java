import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // input string
        int n = scn.nextInt();

        for (int j = 1; j <= n; j++) {
            System.out.println(j);
        }

        // input string
        String name = scn.nextLine();
        System.out.println("Hello" + name);
    }
}
