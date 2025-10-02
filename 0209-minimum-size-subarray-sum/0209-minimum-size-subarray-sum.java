class Solution {
    public int minSubArrayLen(int t, int[] nums) {
        int ans=Integer.MAX_VALUE, n=nums.length;
        int i=0,j=0;
        int d=0;
        while(j<n){
            d+=nums[j];
            while(d>=t){
                ans=Math.min(j-i+1,ans);
                d-=nums[i++];
            }
            j++;
        }
        if(ans==Integer.MAX_VALUE) return 0;
        return ans;
    }
}