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
    private static int count = 0;
    private static int res = 0;
    
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        helper(root);
        return res;
    }
    
    public static void helper(TreeNode root){
        if (root == null) return;
        helper(root.left);
        count--;
        if (count == 0){
            res = root.val;
        }
        helper(root.right);
    }
}
