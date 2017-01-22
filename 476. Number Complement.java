public class Solution {
    public int findComplement(int num) {
        int i = 0;
        int complement = 0;
        while(num > 0) {
            if(num % 2 == 0) {
                complement += Math.pow(2, i);
            }
            i++; num = num >> 1;
        }
        return complement;
    }
}