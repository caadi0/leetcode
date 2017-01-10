public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int n = 0;
        while((x / (long) Math.pow(10, ++n)) != 0);
        int m = 0;
        while(--n >= ++m) {
            int a = x/ (int) Math.pow(10, n);
            int b = (x % (int) Math.pow(10, m)) / ((int) Math.pow(10, m-1));
            if(a != b)
                return false;
            x -= a * (int) Math.pow(10, n);
        }
        return true;
    }
}