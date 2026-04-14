class Solution {
    public int maxProfit(int[] prices) {
        Integer dp[][][]=new Integer[prices.length][2][3];
        return help(prices,0,1,2,dp);
    }
    int help(int[] prices,int i, int c, int cap,Integer[][][] dp){
        if(cap==0 || i==prices.length) return 0;
        if(dp[i][c][cap]!=null) return dp[i][c][cap];
        int pro=0;
        if(c==1){
            int buy=-prices[i]+help(prices,i+1,0,cap,dp);
            int skip=help(prices,i+1,1,cap,dp);
            pro=Math.max(buy,skip);
        }else{
            int sell=prices[i]+help(prices,i+1,1,cap-1,dp);
            int skip=help(prices,i+1,0,cap,dp);
            pro=Math.max(sell,skip);
        }
        return dp[i][c][cap]=pro;
    }
}