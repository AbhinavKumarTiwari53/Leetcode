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
    class Pair{
        int h;
        boolean f;
        public Pair(int h, boolean f){
            this.h=h;
            this.f=f;
        }
    }
    int d = 0 ;
    int sd = 0;
    public int amountOfTime(TreeNode root, int start) {
        dfs(root ,start);
       return Math.max(d,sd);
    }
    private Pair dfs(TreeNode root, int start){
        if(root==null) return new Pair(0, false);
        Pair r=dfs(root.left,start);
        Pair l=dfs(root.right,start);
        if(root.val==start){
            sd = Math.max(r.h,l.h);
            return new Pair(1,true);
        }
        if(l.f){
            d = Math.max(d,l.h+r.h);
            l.h++;
            return l;
        }
        if(r.f){
            d = Math.max(d,l.h+r.h);
            r.h++;
            return r;
        }
        return new Pair(Math.max(r.h,l.h)+1,false);
    }

}