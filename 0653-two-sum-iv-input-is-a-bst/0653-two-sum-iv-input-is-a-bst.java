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
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        inorder(root, k, ans);
        int s = 0;
        int e = ans.size() - 1;
        while(s < e){
            int sum = ans.get(s) + ans.get(e);
            if(sum == k) return true;
            else if(sum < k) s++;
            else e--;
        }
        return false;
    }
    void inorder(TreeNode root, int k, ArrayList<Integer> ans){
        if(root == null) return ;
        inorder(root.left, k, ans);
        ans.add(root.val);
        inorder(root.right, k, ans);
    }
}