public class Scope {
    public static void main(String[] args) {
         int a = 10;
         int b = 40;

         //Block Scope
        {
            int a = 4; // already initialised outside the block in the same method, hence you cannot initialise again
            a = 100; // here we are reassigning the origin ref variable to some other value
            int c = 3;
            //values initialised in this block, will remain in this block
        }
        System.out.println(c); // cannot use outside the block

    }
    static void random() {
        int num = 33;
        System.out.println(num);

        //Function Scope : if the variable is not defined here it will show error eg:below
        System.out.println(a);
    }
}
