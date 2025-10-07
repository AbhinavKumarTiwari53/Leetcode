class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        Integer dp[][] = new Integer[n+2][n+2];
        return solve(nums,0,-1,dp);
    }
    int solve(int[] nums, int i,int j, Integer dp[][]){
        if(i==nums.length) return 0;
        if(dp[i][j+1]!=null) return dp[i][j+1];
        int exclude=solve(nums,i+1,j,dp);
        int include=0;
        if(j==-1 || nums[i]>nums[j]){
            include=1+solve(nums,i+1,i,dp);
        }
        dp[i][j+1]=Math.max(include,exclude);
        return dp[i][j+1];
    }
}