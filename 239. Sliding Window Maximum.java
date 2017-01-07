public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 0)
            return nums;
        
        ArrayList<Integer> deQ = new ArrayList<Integer>();
        int[] array = new int[nums.length - k + 1];
        deQ.add(0);
        
        for(int i = 0; i < k; i++) {
            if(nums[deQ.get(0)] <= nums[i]) {
                deQ.clear();
            } else {
                if(nums[deQ.get(deQ.size() - 1)] <= nums[i]) {
                    while(nums[deQ.get(deQ.size() - 1)] <= nums[i])
                        deQ.remove(deQ.size() - 1);
                }
            }
            deQ.add(i);
        }
        
        array[0] = nums[deQ.get(0)];
        
        for(int i = k; i < nums.length; i++) {
            if(i - deQ.get(0) >= k)
                deQ.remove(0);
            
            if(deQ.size() == 0) {
                
            } else if(nums[deQ.get(0)] <= nums[i]) {
                deQ.clear();
            } else {
                if(nums[deQ.get(deQ.size() - 1)] >= nums[i]) {
                    
                } else {
                    while(nums[deQ.get(deQ.size() - 1)] <= nums[i])
                        deQ.remove(deQ.size() - 1);
                    
                }
            }
            deQ.add(i);
            array[i-k+1] = nums[deQ.get(0)];
        }
        return array;
    }
}