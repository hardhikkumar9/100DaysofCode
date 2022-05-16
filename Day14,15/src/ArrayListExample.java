import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Syntax
        //ArrayList <Integer> list = new ArrayList<>(10);

        ArrayList <Integer> list = new ArrayList<>(10);

        list.add(44);
        list.add(34);
        list.add(44543);
        list.add(447685);

        System.out.println(list);

        // to check weather the element is present or not
        System.out.println(list.contains(34));

        //to update the element in the array
        list.set(0, 99); //(index,updated value)

        //to remove the element from the array
        list.remove(2);

        System.out.println(list);
        
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] will not work here
        }

        System.out.println(list);

    }
}
