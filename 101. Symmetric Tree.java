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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return check(root.left, root.right);
    }
    
    public boolean check(TreeNode a, TreeNode b) {
        if(a == null && b == null)
            return true;
        if(a == null || b == null)
            return false;
        return (a.val == b.val) && check(a.left, b.right) && check(a.right, b.left);
    }
}
