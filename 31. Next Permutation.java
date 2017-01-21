public class Solution {
    public void nextPermutation(int[] nums) {
        int min= nums[nums.length - 1];
        for(int i = nums.length - 2; i>= 0; i--) {
            if(nums[i] < nums[i+1]) {
                int j = nums.length - 1;
                for(; j > i; j--) {
                    if(nums[j] > nums[i]) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
                j = nums.length; int k = i;
                while(k++ < --j) {
                    int temp = nums[k];
                    nums[k] = nums[j];
                    nums[j] = temp;
                }
                return;
            }
        }
        Arrays.sort(nums);
    }
}