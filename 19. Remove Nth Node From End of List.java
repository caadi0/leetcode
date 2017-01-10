/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode ans = new ListNode(-1); ans.next = head;
        
        ListNode copy, cC; copy = cC = ans;
        
        while(n-- > 0) {
            copy = copy.next;
        }
        
        while(copy != null && copy.next != null) {
            copy = copy.next;
            ans = ans.next;
        }
        
        ans.next = ans.next.next;
        return cC.next;
    }
}