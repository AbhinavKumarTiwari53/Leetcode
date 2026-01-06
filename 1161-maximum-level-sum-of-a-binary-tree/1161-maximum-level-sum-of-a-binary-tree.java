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
    public int maxLevelSum(TreeNode root) {
        int l=0, ans=Integer.MIN_VALUE, level=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int s=q.size();
            l++;
            int sum=0;
            for(int i=0;i<s;i++){
                TreeNode v=q.poll();
                sum+=v.val;
                if(v.left!=null) q.offer(v.left);
                if(v.right!=null) q.offer(v.right);
            }
            if(ans<sum) {
                ans=sum; 
                level=l;
            }
        }
        return level;
    }
}