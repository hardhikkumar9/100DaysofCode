public class Shadowing {
    static int x = 90;// this will shadow line 7

    public static void main(String[] args) {
        System.out.println(x); // 90
        int x ; // the class variable at line 2 will be shadowed by this
        x = 40; // scope will begin when value in initialised
        System.out.println(x); // 40
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
