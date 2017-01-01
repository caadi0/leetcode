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
    public boolean isValidBST(TreeNode root) {
        if(root == null)
            return true;
        return isValid(root.left, Integer.MIN_VALUE-1l, root.val) && isValid(root.right, root.val, Integer.MAX_VALUE+1l); 
    }
    
    private boolean isValid(TreeNode node, long min, long max) {
        if(node == null)
            return true;
        if(node.val >= max || node.val <= min)
            return false;
        return isValid(node.left, min, node.val) && isValid(node.right, node.val, max);
    }
}