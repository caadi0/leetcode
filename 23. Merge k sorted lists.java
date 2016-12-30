public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode rl = null;
        ListNode rlNext = new ListNode(0);
        
        if(lists == null || lists.length == 0)
            return rl;
        
        PriorityQueue<ListNode> queue = new PriorityQueue<ListNode>(lists.length, new Comparator<ListNode>() {
            public int compare(ListNode l1, ListNode l2) {
                return l1.val > l2.val ? 1 : -1;
            }
        });
        
        for(ListNode l : lists) {
            if(l != null)
                queue.add(l);
        }
        
        rl = rlNext;
        
        while(!queue.isEmpty()) {
            rlNext.next = queue.remove();
            rlNext = rlNext.next;
            if(rlNext.next != null)
                queue.add(rlNext.next);
        }
        return rl.next;
    }
}