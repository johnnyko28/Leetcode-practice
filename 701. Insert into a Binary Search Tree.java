/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode insertIntoBST(TreeNode root, int val) {
         if (root == null) {
            return new TreeNode(val);   // return a new node if root is null
        }
        if (root.val < val) {           // insert to the right subtree if val > root->val
            root.right = insertIntoBST(root.right, val);
        } else {                        // insert to the left subtree if val <= root->val
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }
}
