public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        int nTarget = 0;
        for(int i = 0; i < nums.length;i++) {
            int beg = i+1;
            int end = nums.length - 1;
            while(beg < end) {
                int c = target - (nums[beg] + nums[end] + nums[i]);
                if(Math.abs(c) < diff) {
                    diff = (int) Math.abs(c);
                    nTarget = nums[beg] + nums[end] + nums[i];
                } else if (c < diff) {
                    end--;
                } else {
                    beg++;
                }
            }
        }
        return nTarget;
    }
}