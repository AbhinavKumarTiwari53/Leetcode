class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int l=1,r=Arrays.stream(piles).max().getAsInt();
       while(l<r){
        int m=(l+r) >> 1;
        if(can(piles,m,h)==1) r=m;
        else l=m+1;
       }
       return l;
    }
    public int can(int[] piles,int k, int h){
        int ans=0;
        for(int p: piles){
            ans += p/k;
            if(p%k!=0) ans++;
        }
        return ans<=h ? 1:0;
    }
}