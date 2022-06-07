public class conditionals {
    public static void main(String[] args) {

        int x = 13;
        if(x % 2 == 0){
            System.out.println("X is even");
        }
        else {
            System.out.println("X is odd");
        }
        System.out.println("If Else statement example");

        int n1 = 22;
        int n2 = 46;

        if (n1 == n2){
            System.out.println(n1 + " is equal to " + n2);
        }
        else if (n1 > n2){
            System.out.println(n1 + " is greater than " + n2);
        }
        else {
            System.out.println(n1 + "is less than" + n2);
        }
    }
}
