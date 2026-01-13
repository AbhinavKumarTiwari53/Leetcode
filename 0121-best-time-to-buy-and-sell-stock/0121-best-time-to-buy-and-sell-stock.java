class Solution {
    public int maxProfit(int[] prices) {
        int pr=0, m=Integer.MAX_VALUE;
        for(int i:prices){
            m=Math.min(m,i);
            pr=Math.max(pr,i-m);
        }
        return pr;
    }
}