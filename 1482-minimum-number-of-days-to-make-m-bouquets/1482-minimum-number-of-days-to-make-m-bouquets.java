class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(((long)m*k) > bloomDay.length) return -1;
        int l=1, r=Arrays.stream(bloomDay).max().getAsInt();
        int ans=Integer.MAX_VALUE;
        while(l<=r){
            int mid=l+(r-l)/2;
            int b=isPossible(bloomDay,mid, k);
            if(b>=m) {ans=mid; r=mid-1;}
            else l=mid+1;
        }
        return ans;
    }
    int isPossible(int[] a, int mid, int k) {
        int total=0;
        int c=0;
        for(int i:a){
            if(i<=mid) {
                c++;
                if(c==k) {total++; c=0;}
            }
            else c=0;
        }
        return total;
    }
}