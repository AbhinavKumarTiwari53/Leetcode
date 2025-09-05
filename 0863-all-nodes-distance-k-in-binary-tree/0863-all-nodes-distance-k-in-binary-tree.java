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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
       List<Integer> res = new LinkedList<>();
       if(k == 0) res.add(target.val);
       else dfs(res,root,target.val, k , 0);
       return res;
    }
    private int dfs(List<Integer> res, TreeNode node, int target, int k, int depth){
        if(node == null) return 0;
        if(depth == k){
            res.add(node.val);
            return 0;
        }
        int left, right;
        if(node.val == target || depth > 0){
            left = dfs(res, node.left, target, k, depth+1);
            right = dfs(res, node.right, target, k, depth+1);
        }else{
            left = dfs(res, node.left, target, k, depth);
            right = dfs(res, node.right, target, k, depth);
        }
        if(node.val == target) return 1;
        if(left == k || right == k){
            res.add(node.val);
            return 0;
        }
        if(left > 0){
            dfs(res,node.right,target, k ,left+1);
            return left +1 ;
        }
        if(right > 0){
            dfs(res, node.left, target, k , right+1);
            return right+1;
        }
        return 0;
    }
}