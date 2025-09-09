class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int l=1,r=1000000000;
       while(l<r){
        int m=l+(r-l)/2;
        if(can(piles,m,h)) r=m;
        else l=m+1;
       }
       return l;
    }
    public boolean can(int[] piles,int k, int h){
        int ho=0;
        for(int p: piles){
            int d=p/k;
            ho+=d;
            if(p%k!=0) ho++;
        }
        return ho<=h;
    }
}