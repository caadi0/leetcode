/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return head;
        ListNode copy = head;
        ListNode copy1 = head;
        
        // find length
        int length = 0;
        while(copy != null) {
            copy = copy.next;
            length++;
        }
        
        copy = head;
        k %= length;
        
        while(k-- > 0) {
            copy = copy.next;
        }
        while(copy.next != null) {
            copy = copy.next;
            copy1 = copy1.next;
        }
        
        copy.next = head;
        ListNode newHead = copy1.next;
        copy1.next = null;
        return newHead;
    }
}