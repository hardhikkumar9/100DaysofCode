public class Conditionals {

    public static void main(String[] args) {

        // If/Else statement
            int salary = 16000;
            if (salary > 10000){
                salary = salary + 2000;
            }
            else {
                salary = salary +1000;
            }

        // && Add two conditions
        int a = 10;
        int b = 20;
        if (a == 10 && b == 20) ;
        {
            System.out.println("RIGHT!");
        }

        // Multiple If/Else statement
        if (salary > 20000) {
            salary += 2000;  // Short form of salary = salary + 2000;
        } else if (salary > 15000) {
            salary += 1000;
        } else {
            salary += 500;
        }
        System.out.println(salary);
    }
}

