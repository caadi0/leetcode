public class Solution {
    
    public int climbStairs(int n) {
        return steps(n);
    }
    
    int steps(int n) {
        int a = 1, b =1, c = 1;
        while (--n > 0) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}