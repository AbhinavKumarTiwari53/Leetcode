/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p==root || q==root) return root;
        boolean lp=help(root.left,p);
        boolean lq=help(root.left,q);
        boolean rq=help(root.right,q);
        boolean rp=help(root.right,p);
        if((lp && rq) || (rp && lq)) return root;
        if(lp && lq) return lowestCommonAncestor(root.left,p,q);
        if(rp && rq) return lowestCommonAncestor(root.right,p,q);
        return root;
    }
    public boolean help(TreeNode root,TreeNode a){
        if(root==null) return false;
        if(root==a) return true;
        return help(root.left,a) || help(root.right,a);
    }
}