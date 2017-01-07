public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 0)
            return nums;
        
        ArrayList<Integer> deQ = new ArrayList<Integer>();
        int[] array = new int[nums.length - k + 1];
        deQ.add(0);
        
        for(int i = 0; i < nums.length; i++) {
            if(i - deQ.get(0) >= k)
                deQ.remove(0);
            
            if(deQ.size() == 0) {
            
            } else {
                while(deQ.size() > 0 && nums[deQ.get(deQ.size() - 1)] <= nums[i])
                    deQ.remove(deQ.size() - 1);
            }
            deQ.add(i);
            
            if(i >= k-1)
                array[i-k+1] = nums[deQ.get(0)];
        }
        return array;
    }
}