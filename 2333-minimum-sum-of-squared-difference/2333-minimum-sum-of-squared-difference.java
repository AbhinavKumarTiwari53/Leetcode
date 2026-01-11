class Solution {
    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
        int n=nums1.length;
        int[] diff=new int[n];
        int maxDiff=0;
        for(int i=0;i<nums1.length;i++){
            int d=Math.abs(nums1[i]-nums2[i]);
            maxDiff=Math.max(maxDiff,d);
            diff[i]=d;
        }
        int l=0, r=maxDiff;
        int k=k1+k2;
        long extra=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            int c=0;
            for(int i=0;i<n && c<=k;i++){
                c+=Math.max(0,diff[i]-mid);
            }
            if(c<=k){
                r=mid-1;
                extra=k-c;
            }else{
                l=mid+1;
            }
        }
         long sum=0;
          for(int i=0; i<n && l>0;i++){
            long d=Math.min(l, diff[i]);
            if(d==l && extra>0){ 
                --d;
                --extra;
            }
            sum+=d*d;
        }
        return sum;
    }
}