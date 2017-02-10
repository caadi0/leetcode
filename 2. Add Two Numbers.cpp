/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        
        ListNode start(0), *p = &start;
        int carry = 0, sum = 0;
        
       while(l1 != NULL || l2 != NULL || carry) {
            sum = 0; 
            if ( l1 != NULL) {
                sum += l1 -> val;
                l1 = l1 -> next;
            }
            if ( l2 != NULL) {
                sum += l2 -> val;
                l2 = l2 -> next;
            }
            
            p -> next = new ListNode((sum + carry) % 10);
            p = p -> next;
            carry = (sum + carry) / 10;
        }
        
        return start.next;
    }
};