import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int EmpID = in.nextInt();
        String Department = in.next();

        //old Switch Case
        switch (EmpID) {
            case 1:
                System.out.println("Hardhik Kumar");
                break;
            case 2:
                System.out.println("Rachit Chitkara");
                break;
            case 3:
                System.out.println("EmpID 3");
                switch (Department) {
                    case "IT":
                        System.out.println("Information Technology Department");
                        break;
                    case "CS":
                        System.out.println("Computer Science Department");
                        break;
                    default:
                        System.out.println("No department Entered");
                }
                break;
            default:
                System.out.println("Enter correct EmpID");

        }

        //Enhanced Switch case

        switch (EmpID) {
            case 1 -> System.out.println("Hardhik Kumar");
            case 2 -> System.out.println("Rachit Chitkara");
            case 3 -> {
                System.out.println("EmpID 3");
                switch (Department) {
                    case "IT" -> System.out.println("Information Technology Department");
                    case "CS" -> System.out.println("Computer Science Department");
                    default -> System.out.println("No department Entered");
                }
            }
            default -> System.out.println("Enter correct EmpID");
        }
    }
}
