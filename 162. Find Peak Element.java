public class Solution {
    public int findPeakElement(int[] nums) {
        int beg = 0;
        int end = nums.length-1;
        while(beg <= end) {
            int mid = beg + (end - beg)/2;
            //System.out.println(beg +" " + end + " " + mid);
            if((mid == nums.length -1 || nums[mid] > nums[mid+1]) && (mid == 0 || nums[mid] > nums[mid - 1])) {
                return mid;
            } else if (mid != 0 && nums[mid] < nums[mid - 1]) {
                end = mid -1;
            } else {
                beg = mid + 1;
            }
        }
        return -1;
    }
}