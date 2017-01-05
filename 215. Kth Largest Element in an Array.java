public class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(nums.length, new Comparator<Integer>() {
            
            @Override
            public int compare(Integer n1, Integer n2) {
                return -n1.compareTo(n2);
            }
        });
        for(int i : nums)
            queue.add(i);
        while(k-- > 0)
            n = queue.poll();
        return n;
    }
}