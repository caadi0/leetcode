public class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] range = { -1, -1 };
        if(nums.length == 0)
            return range;
        
        int beg; int end;
        
        beg = findBeg(nums, target);
        end = findlast(nums, target);

        if(nums[beg] == target && nums[end] == target) {
            range[0] = beg; range[1] = end; 
        }
            
        return range;
    }
    
    int findBeg(int[] nums, int target) {
        int beg = -1, mid = 0;
        int end = nums.length -1;
        while(end - beg > 1) {
            mid = beg + (end - beg)/2;
            if(nums[mid] >= target)
                end = mid;
            else
                beg = mid;
        }
        return beg+1;
    }
    
    int findlast(int[] nums, int target) {
        int beg = 0, mid = 0;
        int end = nums.length;
        while(end - beg > 1) {
            mid = beg + (end - beg)/2;
            if(nums[mid] <= target)
                beg = mid;
            else
                end = mid;
        }
        return end-1;
    }
    
}