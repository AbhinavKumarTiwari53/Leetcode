class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int res=0;
        int m=nums[0];
        for(int i:nums){
            if(i>m) m=i;
        }
        int c=0;
        for(int i:nums){
            if(m==i) {c++; res=Math.max(res,c);}
            else c=0;
        }
        return res;
    }
}