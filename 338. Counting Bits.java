public class Solution {
    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        int count;
        for(int i = 0; i <= num; i++) {
            count = 0; int k = i;
            while(k > 0) {
                k &= (k-1);
                count++;
            }
            result[i] = count;
        }
        return result;
    }
}