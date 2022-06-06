import java.util.Scanner;

public class Runnsumod1dArr {
    public static void main(String[] args) {
        class Solution {
            public int[] runningSum(int[] nums) {
                int n = nums.length;
                int[] arr = new int[n];
                int sum = 0;
                for (int i = 0; i < n; i++) {
                    arr[i] = sum + nums[i];
                    sum = sum + nums[i];
                }
                return arr;
            }
        }

        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter input = ");
        
        int rollno = input.nextInt();
        System.out.println("Your roll number is = " + rollno);

        System.out.println("Your name name is = ");

    }
}
