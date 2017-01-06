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
    
    List<TreeNode> preOrder = new ArrayList<TreeNode>();
    List<TreeNode> postOrder = new ArrayList<TreeNode>();
    HashSet<TreeNode> hash = new HashSet<TreeNode>();
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        calPreOrder(root);
        calPostOrder(root);
        int i, j;
        for(i = 0; i < preOrder.size(); i++) {
            if(preOrder.get(i) == p || preOrder.get(i) == q)
                break;
        }
        
        for(j = preOrder.size() -1; j >= 0; j--) {
            hash.add(postOrder.get(j));
            if(postOrder.get(j) == p || postOrder.get(j) == q)
                break;
        }
        
        for(; i >= 0; i--) {
            if(hash.contains(preOrder.get(i)))
                return preOrder.get(i);
        }
        
        return null;
        
    }
    
    void calPreOrder(TreeNode root) {
        if(root == null)
            return;
        preOrder.add(root);
        calPreOrder(root.left);
        calPreOrder(root.right);
    }
    
    void calPostOrder(TreeNode root) {
        if(root == null)
            return;
        calPostOrder(root.left);
        calPostOrder(root.right);
        postOrder.add(root);
    }
    
}