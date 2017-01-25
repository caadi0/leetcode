public class Solution {
    public int rob(int[] nums) {
        int robN = 0;
        int robY = 0;
        for(int i = 0; i < nums.length; i++) {
            int temp = robN;
            robN = Math.max(robY, robN);
            robY = temp + nums[i];
        }
        return Math.max(robN, robY);
    }
}