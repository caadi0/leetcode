/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        return reverse(head, null); 
    }
    
    public ListNode reverse(ListNode head, ListNode back) {
        if(head == null)
            return back;
        ListNode newNode = head.next;
        head.next = back;
        back = head;
        head = newNode;
        return reverse(head, back);
    }
}