public class Plusone26 {
    public static void main(String[] args) {
        public int[] plusOne(int[] digits); {
            int n = digits.length;
            int carry = 0;
            for(int i = n - 1; i>=0; i--){
                if(i == (n-1)){
                    carry = (digits[i] + 1)/ 10;
                    digits[i] = (digits[i] + 1) % 10;
                }else{
                    int sum = (digits[i] + carry);
                    digits[i] = sum % 10;
                    carry = sum / 10;
                }
            }
            if(carry > 0){
                int[] ans = new int[n+ 1];
                ans[0] = carry;
                for(int i = 1; i< ans.length; i++){
                    ans[i] = digits[i-1];
                }
                return ans;
            }

            return digits;

        }
    }
}
