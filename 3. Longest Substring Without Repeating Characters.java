public class Solution {
    
    int[] index = new int[256];
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int len = 0;
        for (int i = 0; i < 256 ; i++) {
            index[i] = -1;
        }
        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);
            if(index[c] >= 0) {
                if(i - index[c] > len)
                    len++;
                else
                    len = i - index[c];
            } else {
                len++;
            }
            index[c] = i;
            if(len > maxLength)
                maxLength = len;
        }
        return maxLength;
    }
}
