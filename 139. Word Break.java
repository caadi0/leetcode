public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        int length = s.length();
        boolean[] array = new boolean[length+1];
        array[0] = true;
        for(int i = 0; i < length; i++) {
            for(Iterator<String> it = wordDict.iterator(); it.hasNext(); ) {
                String part = it.next();
                int n = part.length();
                if(array[i] == true && i+n <= length && s.substring(i, i+n).equals(part)) {
                    array[i+n] = true;
                    if(i+n-1 == length-1)
                        return true;
                }
            }
        }
        return false;
    }
}