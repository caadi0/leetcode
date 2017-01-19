/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        int temp = -1;
        ListNode copy = head;
        while(copy != null && copy.next != null) {
            temp = copy.val;
            copy.val = copy.next.val;
            copy.next.val = temp;
            copy = copy.next.next;
        }
        return head;
    }
}