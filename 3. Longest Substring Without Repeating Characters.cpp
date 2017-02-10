class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        unordered_map<int, int> map;
        int len = 0, max = 0;
        string::iterator it = s.begin();
        
        for(int i = 0; it < s.end(); it++, i++) {
            if(map.find(*it - 'a') != map.end()) {
                len = i - map[*it - 'a'] > len ? len+1 : i - map[*it - 'a'];
            } else {
                len++;
            }
            map[*it - 'a'] = i;
            max = max > len ? max : len;
        }
        
        return max;
    }
};