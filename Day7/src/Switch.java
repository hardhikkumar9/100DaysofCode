import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fruit = in.next();

        // old Switch case

        switch (fruit) {
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Grape":
                System.out.println("A small fruite");
                break;
            case "Banana":
                System.out.println("A yellow colour fruit");
                break;
            default:
                System.out.println("Enter valid Fruit!");
        }
    }
}
