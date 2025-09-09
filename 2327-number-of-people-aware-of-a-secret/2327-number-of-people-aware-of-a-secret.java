class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        final int m = 1000000007;
        long[] dp = new long[n];
        dp[0] = 1;
        long t = 0;
        for(int i=delay;i<n;i++){
            t+=dp[i-delay];
            dp[i] = t%m;
            if(i-forget+1>=0){
                t-=dp[i-forget+1];
                t=(t+m)%m;
            }
        }
        long res=0;
        for(int i = n- forget;i<n;i++) res=(res+dp[i])%m;
        return (int)res;
    }
}