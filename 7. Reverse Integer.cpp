class Solution {
public:
    int reverse(int x) {
        int rev = 0; 
        int sign = x < 0 ? -1 : 1;
        x *= sign;
        while(x > 0) {
            if(rev > (INT_MAX - x % 10) / 10)
                return 0;
            rev *= 10;
            rev += x % 10;
            x = x / 10;
        }
        return sign * rev;
    }
};