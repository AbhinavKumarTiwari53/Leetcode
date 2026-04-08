class Solution {
    public int climbStairs(int n) {
        if(n<3) return n;
        int pp=1;
        int p=2;
        int ans=0;
        for(int i=3;i<=n;i++){
            ans=pp+p;
            pp=p;
            p=ans;
        } 
        return ans;
    }
}