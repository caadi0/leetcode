public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        generateP(list, n * 2, "", 0, 0);
        return list;
    }
    
    void generateP(List<String> list, int max, String str, int open, int close) {
        if(str.length() == max) {
            list.add(str);
            return;
        }
        if(open < max/2)
            generateP(list, max, str + "(", open + 1, close);
        if(close < open)
        generateP(list, max, str + ")", open, close + 1);
    }
}