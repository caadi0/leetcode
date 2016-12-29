public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        //HashSet tripletSet = new HashSet();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length;) {
            int complement = -nums[i];
            int beg = i+1;
            int end = nums.length - 1;
            while(beg < end) {
                if(nums[beg] + nums[end] < complement) {
                    beg++;
                } else if (nums[beg] + nums[end] > complement) {
                    end--;
                } else {
                    List<Integer> sList = new ArrayList<Integer>();
                    sList.add(nums[i]);
                    sList.add(nums[beg]);
                    sList.add(nums[end]);
                    
                    // Add to big list if no duplicate
                    list.add(sList);
                    while((++beg < end) && (nums[beg] == nums[beg - 1]));
                    while((beg < --end) && (nums[end] == nums[end + 1]));
                }
            }
            while((++i < nums.length) && (nums[i] == nums[i - 1]));
        }
        return list;
    }
}