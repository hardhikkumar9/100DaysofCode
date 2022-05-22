public class ShuffleArr {
    public static void main(String[] args) {
        class Solution {
            public int[] shuffle(int[] nums, int n) {
                int[] arr = new int[2*n];

                for(int i=0,j=n,ind = 0;ind<2*n;i++,j++)
                {
                    arr[ind++] = nums[i];
                    arr[ind++] = nums[j];
                }
                return arr;
            }
        }
    }
}
