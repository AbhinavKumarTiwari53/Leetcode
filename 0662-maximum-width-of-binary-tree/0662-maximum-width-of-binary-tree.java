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
    Map<Integer, Integer> ind = new HashMap<>();
    int max = 0;
    public int widthOfBinaryTree(TreeNode root) {
        help(root,0, 0);
        return max;    
    }
    public void help(TreeNode root, int d, int i){
        if(root == null) return;
        ind.putIfAbsent(d, i);
        max = Math.max(max, (i-ind.get(d))+1);
        help(root.left, d+1, i*2);
        help(root.right, d+1, i*2+1);
    }
}