/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return true;
        ListNode copy, leftp, rightp;
        copy = leftp = rightp = head;
        int count = 0, right = 0, left = 0;
        while(copy != null) {
            count++;
            copy = copy.next;
        }
        if(count % 2 == 0) {
            right = count/2 + 1;
            left = count/2;
        } else {
            right = count/2 + 2;
            left = count/2;
        }
        
        while(--right > 0)
            rightp = rightp.next;
        ListNode newNode = null;
        while(left-- > 0) {
            ListNode h = leftp;
            leftp = leftp.next;
            h.next = newNode;
            newNode = h;
        }
        
        while(newNode != null) {
            if(newNode.val != rightp.val)
                return false;
            rightp = rightp.next; newNode = newNode.next;
        }
        return true; 
    }
}