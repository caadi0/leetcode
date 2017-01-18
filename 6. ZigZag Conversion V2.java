public class Solution {
    public String convert(String s, int numRows) {
        List<String> list = new ArrayList<String>();
        
        Boolean dir = true;
        int row = 0, i = 0;
        
        for(i = 0; i < numRows; i++) {
            list.add("");
        }
        
        i = 0;
        
        while(i < s.length()) {
            for(int j = 0; j < numRows && i < s.length(); j++) {
                String a = list.get(j);
                a += s.charAt(i++);
                list.set(j, a);
            }
            
            for(int j = numRows - 2; j > 0 && i < s.length(); j--) {
                String a = list.get(j);
                a += s.charAt(i++);
                list.set(j, a);
            } 
        }
		
		String s1 = "";
        
        for(i = 0; i < numRows; i++) {
            s1 += list.get(i);
        }
        return s1;
    }
}

