import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

    //FOR Loop

        // print no from 1 to 5
        for (int num = 1; num <= 5; num += 2) {
            System.out.println(num);
        }

        // print no from 1 to n
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int num = 1; num <= n; num++) {
            System.out.println(num + " ");
        }

    //WHILE Loop
        int num = 1;
        while (num <= 5) {
            System.out.println(num);
            num++;
        }

    // DO WHILE Loop
        //1
       // int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <=5);

        //2
        //int n = 1;
        do {
            System.out.println("Hello Hardhik");
        } while (n != 1);

    }
}
