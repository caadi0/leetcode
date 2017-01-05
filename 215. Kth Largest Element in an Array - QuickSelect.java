public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        return partition(nums, 0, n-1, n-k);
    }
    
    public int partition(int[] nums, int lo, int hi, int k) {
        int i = lo, small = lo, pivot = nums[hi];
        while(i < hi) {
            if(nums[i] < pivot) {
                swap(nums, i, small++);
            } 
            i++;
        }
        swap(nums, hi, small);
        if(small == k)
            return nums[k];
        else if (small < k)
            return partition(nums, small+1, hi, k);
        else
            return partition(nums, lo, small-1, k);
    }
    
    void swap(int[] nums, int i, int j) {
        //swap
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}