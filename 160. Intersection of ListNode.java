/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode aCopy = headA;
        ListNode bCopy = headB;
        int aLength = 0, bLength = 0;  
        while(aCopy != null || bCopy != null) {
            if(aCopy != null) {
                aCopy = aCopy.next;
                aLength++;
            }
            if(bCopy != null) {
                bCopy = bCopy.next;
                bLength++;
            }
        }
        
        aCopy = headA; bCopy = headB;
        while(aLength > bLength) {
            aCopy = aCopy.next;
            aLength--;
        }
        
        while(aLength < bLength) {
            bCopy = bCopy.next;
            bLength--;
        }
        
        while(aLength-- > 0) {
            if(aCopy == bCopy)
                return aCopy;
            aCopy = aCopy.next; bCopy = bCopy.next;
        }
        return null;
    }
}