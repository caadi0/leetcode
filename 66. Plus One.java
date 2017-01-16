public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        if(n == 0) {
            int[] s = new int[1];
            s[0] = 1;
            return s;
        }
        int term = (digits[n - 1] + 1);
        digits[n - 1] = term % 10;
        int carry = term / 10;
        for(int i = n - 2; i >= 0 && carry != 0; i--) {
            digits[i] = digits[i] + carry;
            carry= digits[i] /10;
            digits[i] = digits[i] % 10;
        }
        
        if(carry == 1) {
            int[] carryA = new int[n + 1];
            carryA[0] = 1;
            for(int i = 1; i <= n; i++) {
                carryA[i] = digits[i-1];
            }
            return carryA;
        }
        return digits;
    }
}