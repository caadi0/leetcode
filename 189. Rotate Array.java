public class Solution {
    public void rotate(int[] nums, int k) {
        if( k < 1 )
            return;
        k %= nums.length;
        reverse(nums, nums.length - 1, 0);
        reverse(nums, k-1, 0);
        reverse(nums, nums.length -1, k);
    }
    
    void reverse(int[] array, int high, int low) {
        while(high > low) {
            int temp = array[high];
            array[high--] = array[low];
            array[low++] = temp; 
        }
    }
}