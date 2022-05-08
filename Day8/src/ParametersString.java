import javax.xml.namespace.QName;
import java.util.Scanner;

public class ParametersString {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name_person = in.next();
        String personalised = myGreet(name_person);
        System.out.println(personalised);
    }
    static String myGreet(String name) {
        String message = ("Hello " + name);
        return message;
    }
}
