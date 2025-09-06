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
    int e=-1;
    public TreeNode deleteNode(TreeNode root, int key) {
        return del(root,key);
    }
    public TreeNode del(TreeNode root, int key){
        if(root == null) return null;
        if(root.val == key){
            if(root.left == null && root.right==null) return null;
            if(root.left == null || root.right==null) return (root.left==null)?root.right:root.left;
            if(root.left!=null && root.right!=null){
                root.left=f(root.left);
                root.val=e;
                return root;
            }
        }
        if(root.val<key) root.right=del(root.right,key);
        if(root.val>key) root.left=del(root.left,key);
        return root;
    }
    public TreeNode f(TreeNode root){
        if(root.right==null){
            e=root.val;
            return root.left;
        }
        root.right=f(root.right);
        return root;
    }
}