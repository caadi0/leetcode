public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> list = new ArrayList<Integer>();
        
        int totalNumber = (int) Math.pow(2,n);
        for(int j = 1; j <= totalNumber; j++) {
            list.add(0);
        }
        
        for(int i = 0; i < n; i++) {
            int sum = 0;
            int diff = (int) Math.pow(2,i);
            for(int j = diff; j < totalNumber; j++) {
                int number = (int) Math.pow(2,i+2);
                if((j - diff) % number < number/2) {
                    list.set(j, list.get(j) + diff);
                } 
            }
        }
        return list;
    }
}