public class IncOperator {
    public static void main(String[] args) {

        // pre increment
        int n = 4;
        int m = 6;

        int sum = ++n + m ;
        System.out.println(sum);

        //post increment
        int i = 4;
        int j = 1;

        int sum1 = i++ + j ;
        System.out.println(sum1);
    }
}
