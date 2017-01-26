public class Solution {
    public boolean canJump(int[] nums) {
        boolean canJump = false;
        int maxReached = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i > maxReached)
                return false;
            if(nums[i] + i >= nums.length - 1)
                return true;
            maxReached = maxReached > nums[i] + i ? maxReached : nums[i] + i; 
        }
        return false;
    }
}