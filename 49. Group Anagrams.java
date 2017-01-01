public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] copy = Arrays.copyOf(strs, strs.length);
        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();
        for(int i = 0; i < strs.length; i++) {
            String copyS = copy[i];
            char[] cArray = copyS.toCharArray();
            Arrays.sort(cArray);
            copy[i] = new String(cArray);
            
            if(map.containsKey(copy[i])) {
                ArrayList<String> aList = map.get(copy[i]);
                aList.add(strs[i]);
                map.put(copy[i], aList);
            } else {
                ArrayList<String> aList = new ArrayList<String>();
                aList.add(strs[i]);
                map.put(copy[i], aList);
            }
        }
        
        return new ArrayList<List<String>>(map.values());
    }
}