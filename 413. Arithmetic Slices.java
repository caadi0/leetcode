public class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        int count = 0, local = 0;
        for(int i = 1; i < A.length - 1; i++) {
            local = 0;
            while(i < A.length -1 && (A[i] - A[i-1] == A[i+1] - A[i])) {
                local++; i++;
            }
            count += ((local + 1) * (local))/2;
        }
        return count;
    }
}