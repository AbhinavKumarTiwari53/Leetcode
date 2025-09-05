class Solution {
    public int maxProfit(int[] prices) {
       int l = Integer.MAX_VALUE, p=0,j=0;
       for(int i = 0;i<prices.length;i++){
        if(prices[i]<l) l = prices[i];
        j=prices[i]-l;
        if(p<j) p = j;
       }
       return p;
    }
}