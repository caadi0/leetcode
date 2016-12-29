public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null)
            return l2;
        else if(l2 == null)
            return l1;
        ListNode ll = null;
        ListNode l3Next = null;
        
        if(l1.val < l2.val) {
            l3Next = new ListNode(l1.val);
            l1=l1.next;
        } else {
            l3Next = new ListNode(l2.val);
            l2 = l2.next;
        }
        ll = l3Next;
        
        while(l1 != null || l2 != null) {
            ListNode l3;
            if(l1 != null && l2 != null) {
                if(l1.val < l2.val) {
                    l3 = new ListNode(l1.val);
                    l1=l1.next;
                } else {
                    l3 = new ListNode(l2.val);
                    l2=l2.next;
                }
            } else if (l1 != null) {
                l3 = new ListNode(l1.val);
                l1=l1.next;
            } else {
                l3 = new ListNode(l2.val);
                l2=l2.next;
            }
            
            l3Next.next = l3;
            l3Next = l3;
        }
        return ll;
    }
}