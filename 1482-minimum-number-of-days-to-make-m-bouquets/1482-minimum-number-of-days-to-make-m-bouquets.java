class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length,l=1,r=(int)1e9;
        if((long)m*k>n) return -1;
        while(l<r){
            int mid = (l+r)/2, f=0,bq=0;
            for(int j =0;j<n;++j){
                if(bloomDay[j] >mid) f=0;
                else if(++f>=k) {bq++; f=0;}
            }
            if(bq<m) l=mid+1;
            else r=mid;
        }
        return l;
    }
}