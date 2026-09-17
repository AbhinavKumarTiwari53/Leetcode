class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        return Math.max(r(nums,0,nums.length-2),r(nums,1,nums.length-1));
    }
    public int r(int[] nums,int s,int e) {
       int dp[]=new int[nums.length];
       Arrays.fill(dp,-1);
       return help(dp,nums,e,s);
    }
    public int help(int dp[],int a[],int i,int s){
        if(i<s) return 0;
        if(i==s) return a[s];
        if(dp[i]!=-1) return dp[i];
        int np=a[i]+help(dp,a,i-2,s);
        int p=help(dp,a,i-1,s);
        return dp[i]=Math.max(p,np);
    }
}