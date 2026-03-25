class Solution {
    public int maxProfit(int k, int[] prices) {
        Integer[][][] dp=new Integer[prices.length][2][k+1];
        return help(prices,0,1,k,dp);
    }
    int help(int[] arr, int i,int can , int cap,Integer dp[][][]){
        if(cap==0 || i==arr.length) return 0;
        if(dp[i][can][cap]!=null) return dp[i][can][cap];
        int pro=0;
        if(can==1){
            int buy=-arr[i] + help(arr,i+1,0,cap,dp);
            int skip=help(arr,i+1,1,cap,dp);
            pro=Math.max(buy,skip);
        }else {
            int sell=arr[i]+help(arr,i+1,1,cap-1,dp);
            int skip=help(arr,i+1,0,cap,dp);
            pro=Math.max(sell,skip);
        }
        return dp[i][can][cap]=pro;
    }
}