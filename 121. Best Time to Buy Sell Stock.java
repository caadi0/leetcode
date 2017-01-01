public class Solution {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int n = prices.length;
        int maxDiff = Integer.MIN_VALUE;
        
        int[] minArray = new int[n];
        int[] maxArray = new int[n];
        
        for(int i = 0; i < n; i++) {
            minArray[i] = maxArray[i] = prices[i];
            if(max >= maxArray[n-i-1]) {
                maxArray[n-i-1] = max;
            } else {
                max = maxArray[n-i-1];
            }
            
            if(min <= minArray[i]) {
                minArray[i] = min;
            } else {
                min = maxArray[i];
            }
        }
        
        for(int i = 0; i < n; i++)
            if(maxDiff < maxArray[i] - minArray[i])
                maxDiff = maxArray[i] - minArray[i];
                
        if(maxDiff > 0)
            return maxDiff;
        return 0;
    }
}