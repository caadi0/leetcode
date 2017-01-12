public class Solution {
    public int reverse(int x) {
        
        int sign = (x > 0 ? 1 : -1);
        x *= sign;
        int ans = 0;
        
        do {
            if (ans > (Integer.MAX_VALUE - x % 10) / 10)
                return 0;  
            ans = ans * 10 + x % 10;
            x /= 10;
        } while (x > 0);
        
        return ans * sign;
    }
}