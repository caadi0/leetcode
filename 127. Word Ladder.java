public class Solution {
    
    LinkedList<Node> queue = new LinkedList<Node>();
    
    public class Node {
        String word;
        int len;
        
        public Node(String word, int len) {
            this.word = word;
            this.len = len;
        }
    }
    
    public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
        
        Iterator<String> iter;
        queue.add(new Node(beginWord, 1));
        while(!queue.isEmpty()) {
            
            Set<String> set = new HashSet<String>();
            iter = wordList.iterator();
            Node n = queue.removeFirst();
            String s1 = n.word;
            int len = n.len;
            
            while(iter.hasNext()) {
                String s2 = iter.next();
                
                int temp = compare(s1, s2);
                if(temp == 1) {
                    if(s2.equals(endWord))  {
                        return len+1; 
                    } else {
                        queue.add(new Node(s2, len+1));
                    }
                } else {
                    if(temp > 0)
                        set.add(s2);
                }
            }
            wordList = set;
        }
        return 0;
    }
    
    int compare(String s1, String s2) {
        int diff = 0;
        for(int i = 0; i < s1.length() && diff < 2; i++) {
            if(s1.charAt(i) != s2.charAt(i)) {
                diff++;
            }
        }
        return diff;
    }
}