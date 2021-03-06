/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    TreeNode* invertTree(TreeNode* root) {
        if(root == NULL)
            return root;
            
        TreeNode* node = root->left;
        root->left = root->right; invertTree(root->left);
        root->right = node; invertTree(root->right);
        
        return root;
    }
};