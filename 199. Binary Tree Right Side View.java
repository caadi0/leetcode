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
    
    LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> nodes = new ArrayList<Integer>();
        if(root == null)
            return nodes;
        queue.add(root);
        queue.add(null);
        TreeNode prev = null;
        while(queue.size() > 0) {
            TreeNode node = queue.removeFirst();
            if(node == null) {
                nodes.add(prev.val);
                if(queue.size() > 0) // Terminating null 
                    queue.add(null);
            } else {
                if(node.left != null)
                    queue.add(node.left);
                if(node.right != null)
                    queue.add(node.right);
            }
            prev = node;
        }
        return nodes;
    }
}