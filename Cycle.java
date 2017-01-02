/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null)
            return false;
        ListNode dHead = new ListNode(head.val);
        dHead.next = head.next;
        while(head.next != null && (dHead != null && dHead.next != null)) {
            head = head.next;
            dHead = dHead.next.next;
            if(head == dHead)
                return true;
        }
        return false;
    }
}