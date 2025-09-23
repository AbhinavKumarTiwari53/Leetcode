class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        return help(nums, dp, nums.length-1);
    }
    public int help(int[] nums, int[] dp, int i){
        if(i == 0) return nums[i];
        if(i < 0) return 0;
        if(dp[i] != -1) return dp[i];
        int f = nums[i] + help(nums, dp, i-2);
        int s = help(nums, dp, i-1);
        return dp[i] = Math.max(f,s);
    }
}