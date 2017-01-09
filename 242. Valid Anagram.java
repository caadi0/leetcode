public class Solution {
    public boolean isAnagram(String s, String t) {
        int[] array = new int[256];
        for(char c : s.toCharArray())
            array[c]++;
        for(char c : t.toCharArray())
            array[c]--;
        for(int i : array)
            if(i != 0)
                return false;
        
        return true;
    }
}