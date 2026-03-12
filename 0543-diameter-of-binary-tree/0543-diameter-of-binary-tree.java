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
    private int ans=0;
    public int diameterOfBinaryTree(TreeNode root) {
        help(root);
        return ans;
    }
    public int help(TreeNode root){
        if(root==null) return 0;
        int lh=help(root.left), rh=help(root.right);
        ans = Math.max(ans,lh+rh);
        return 1+Math.max(lh,rh);
    }
}