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
        ListNode back = null;
        while(head != null) {
            ListNode next = head.next;
            head.next = back;
            back = head;
            head = next;
        }
        return back;
    }
}