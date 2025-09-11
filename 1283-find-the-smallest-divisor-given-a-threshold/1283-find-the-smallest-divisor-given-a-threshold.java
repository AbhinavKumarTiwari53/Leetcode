class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1,r=(int)1e6;
        while(l<r){
            int m=(l+r)/2,sum=0;
            for(int i:nums) sum+=(i+m-1)/m;
            if(sum>threshold) l=m+1;
            else r=m;
        }
        return l;
    }
}