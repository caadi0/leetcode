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
    
    Stack<TreeNode> stack = new Stack<TreeNode>();
    
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        
        TreeNode node = root;
        
        while(node != null || stack.isEmpty() == false) {
            while(node != null) {
                stack.push(node);
                node = node.left;
            }
            
            // Add to list
            node = stack.pop();
            list.add(node.val);
            
            node = node.right;
        } 
        return list;
    }
}