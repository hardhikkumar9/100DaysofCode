import java.util.Scanner;

public class ConcatenationofArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        class Solution {
            public int[] getConcatenation(int[] nums) {
                //int[] arr = {1, 2, 1};
                int[] arr = new int[2*nums.length];
                for(int i=0;i<nums.length;i++){
                    arr[i]=nums[i];
                    arr[i+nums.length]=nums[i];
                }
                return arr;
            }
        }
    }
}
