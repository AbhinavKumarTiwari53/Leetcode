class Solution {
    public boolean canPartition(int[] nums) {
        int n=nums.length;
        int sum=Arrays.stream(nums).sum();
        if(sum%2!=0) return false;
        sum/=2;
        boolean dp[][]=new boolean[n][sum+1];
        for(int i=0;i<n;i++) dp[i][0]=true;
        for(int i=1;i<=sum;i++) {
            if(nums[0]==i) dp[0][i]=true;
            else dp[0][i]=false;
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<=sum;j++){
                boolean np=dp[i-1][j];
                boolean p=false;
                if(j-nums[i]>=0) p=dp[i-1][j-nums[i]];
                dp[i][j]=p||np;
            }
        }
        return dp[n-1][sum];
    }
}