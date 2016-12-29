public class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> queue = new LinkedList<String>();
        if(digits.isEmpty())
            return queue;
        
        HashMap<Integer, Character[]> table = new HashMap<Integer, Character[]>();
        table.put(2, new Character[] {'a','b','c'});
        table.put(3, new Character[] {'d','e','f'});
        table.put(4, new Character[] {'g','h','i'});
        table.put(5, new Character[] {'j','k','l'});
        table.put(6, new Character[] {'m','n','o'});
        table.put(7, new Character[] {'p','q','r','s'});
        table.put(8, new Character[] {'t','u','v'});
        table.put(9, new Character[] {'w','x','y','z'});
        
        char c = digits.charAt(0);
        int key = Integer.valueOf(c-'0');
        //System.out.println("Key is "+key);
        Character[] array = table.get(key);
        for(Character c1 : array)
            queue.add(c1+"");
        
        for(int i = 1; i < digits.length(); i++) {
            c = digits.charAt(i);
            key = Integer.valueOf(c-'0');
            array = table.get(key);
            int size = queue.size();
            while(size-- > 0) {
                String s = queue.removeFirst();
                for(char c1 : array)
                    queue.add(s+c1);
            }
        }
        return queue;
    }
}