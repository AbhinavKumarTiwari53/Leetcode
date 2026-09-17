class Solution {
    public int rob(int[] nums) {
       int n=nums.length;
       if(n==1) return nums[0];
       if(n==2) return Math.max(nums[0],nums[1]);
       int dp[]=new int[n+1];
       Arrays.fill(dp,-1);
       return help(dp,nums,n-1);
    }
    public int help(int dp[],int a[],int i){
        if(i==0) return a[0];
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int np=a[i]+help(dp,a,i-2);
        int p=help(dp,a,i-1);
        return dp[i]=Math.max(p,np);
    }
}