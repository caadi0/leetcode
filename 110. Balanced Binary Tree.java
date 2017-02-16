/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null)
            return true;
            
        populateStack(root.left, true, s1);
        populateStack(root.right, false, s2);
        
        while(!s1.isEmpty() && !s2.isEmpty() && (s1.peek() == s2.peek())) {
            s1.pop();
            s2.pop();
        }
        if(s1.isEmpty() && s2.isEmpty())
            return true;
        return false;
    }
    
    void populateStack(TreeNode root, boolean l2r, Stack<Integer> stack) {
        if(root == null) {
            stack.push(null);
            return;
        }
        stack.push(root.val);
        if(l2r) {
            populateStack(root.left, l2r, stack);
            populateStack(root.right, l2r, stack);
        } else {
            populateStack(root.right, l2r, stack);
            populateStack(root.left, l2r, stack);
        }
    }
}
