public class Solution {
    public int removeElement(int[] nums, int val) {
        int counter = 0;
        for(int i = 0; i < nums.length; i++) {
            if(val == nums[i]) {
                continue;
            }
            nums[counter++] = nums[i];
        }
        return counter;
    }
}