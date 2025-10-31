class Solution {
    public int coinChange(int[] c, int a) {
        int dp[] = new int[a+1];
        Arrays.fill(dp,10000000);
        dp[0]=0;
        for(int i=1;i<a+1;i++){
            for(int j=0;j<c.length;j++){
                if(i>=c[j]){
                    dp[i]=Math.min(dp[i],1+dp[i-c[j]]);
                }
            }
        }
        return dp[a] == 10000000? -1: dp[a];
    }
}