class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> ans;
        unordered_map<int, int> map;
        vector<int>::iterator it = nums.begin();
        
        for(int i = 0; it <= nums.end(); it++) {
            if(map.find(target - *it) != map.end()) {
                ans.push_back(map[target- *it]);
                ans.push_back(i);
                break;
            }
            map[*it] = i++;
        }
        
        return ans;
    }
};