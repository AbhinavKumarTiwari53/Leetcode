class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=0,r=0;
        for(int w : weights){
            l=Math.max(l,w);
            r+=w;
        }
        while(l<r){
            int m=(l+r)/2, n=1,c=0;
            for(int w:weights){
                if(c+w>m) {n+=1;c=0;}
                c+=w;
            }
            if(n>days) l=m+1;
            else r=m;
        }
        return l;
    }
}