public class Solution {
    public int search(int[] nums, int target) {
        int beg = 0, end = nums.length -1;
        while(end >= beg) {
            int mid = beg + (end - beg)/2;
            
           // System.out.println(beg +" "+ end +" "+ mid);
            if(nums[mid] == target) {
                return mid;
            } else if(nums[beg] < nums[mid] && nums[mid] > target && nums[beg] <= target) {
                end = mid - 1;
            } else if(nums[mid] < nums[end] && nums[end] >= target && nums[mid] < target) {
                beg = mid + 1;
            } else if(nums[mid] < nums[beg]) {
                end = mid - 1;
            } else {
                beg = mid + 1;
            }
        }
        return -1;
    }
}