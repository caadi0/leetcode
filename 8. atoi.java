public class Solution {
    public int myAtoi(String str) {
        str = str.trim();
        if(str.isEmpty()) {
            return 0;
        }
        int number = 0, i = 0; long lnum = 0l;
        int sign = str.charAt(0) == '-' ? -1 : 1;
        if((str.charAt(0) == '-' || str.charAt(0) == '+'))
            i = 1;
        for(;i < str.length(); i++) {
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    lnum = number * 10l + (str.charAt(i) - '0');
                    number = number * 10 + (str.charAt(i) - '0');
                    if(sign * lnum > Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    } else if (sign * lnum < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    }
            } else {
                return sign * number;
            }
        }
        return number * sign;
    }
}