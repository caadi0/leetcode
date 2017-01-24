public class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0]; int current = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(current + nums[i] > 0) {
                current = (current < 0 ? nums[i] : nums[i] + current);
            } else {
                    current = nums[i];    
            }
            max = (max > current ? max : current);
        }
        return max;
    }
}