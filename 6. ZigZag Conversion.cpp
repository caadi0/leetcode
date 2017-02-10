class Solution {
public:
    string convert(string s, int numRows) {
        vector<string> ans(numRows); 
        bool dir = true;
        string::iterator iter = s.begin();
        
        while(iter < s.end()) {
            for(int i = 0; i < numRows && iter < s.end(); i++, iter++) {
                ans.at(i) = ans.at(i) + *iter; 
            }
            
            for(int i = numRows - 2; i > 0 && iter < s.end(); i--, iter++) {
                ans.at(i) = ans.at(i) + *iter; 
            }
        }
        
        string answer = "";
        vector<string>::iterator iter1 = ans.begin();
        for(;iter1 < ans.end(); iter1++)
            answer.append(*iter1);
            
        return answer;
    }
};