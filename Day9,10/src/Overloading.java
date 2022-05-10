public class Overloading {
    public static void main(String[] args) {
        fun(33);
        fun("Hardhik");
    }
    static void fun(int a) {
        System.out.println("First : " + a);
    }

    static void fun(String name) {
        System.out.println("Second : " + name);
    }
}
