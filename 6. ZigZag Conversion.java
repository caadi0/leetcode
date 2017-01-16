public class Solution {
    public String convert(String s, int numRows) {
        List<String> list = new ArrayList<String>();
        
        Boolean dir = true;
        int row = 0;
        
        for(int i = 0; i < numRows; i++) {
            list.add("");
        }
        
        for(int i = 0; i < s.length(); i++) {
            list.set(row%numRows, list.get(row%numRows) + (s.charAt(i) + ""));
            
            if(row%numRows == 0 && !dir) {
                dir = true;
                row = 1;
            } else if (row%numRows == numRows - 1 && dir) {
                row--;
                dir = false;
            } else if (dir) {
                row++;
            } else {
                row--;
            }
        }
		
		String s1 = "";
        
        for(int i = 0; i < numRows; i++) {
            s1 += list.get(i);
        }
        return s1;
    }
}