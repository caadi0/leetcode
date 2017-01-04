public class Solution {
    public int countPrimes(int n) {
        int i = 0, j = 2;
        boolean[] array = new boolean[n+1];
        while(j*j < n) {
            if(array[j] == false) {
                i++;
                for(int k = j*j; k < n; k+=j)
                    array[k] = true;
            }
            j++;
        }
        while(j < n) {
            if(array[j++] == false)
                i++;
        }
        return i;
    }
}