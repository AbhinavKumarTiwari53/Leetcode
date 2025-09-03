class Solution {
    public int findMin(int[] nums) {
        int i =0, j=nums.length-1, ans=Integer.MAX_VALUE;
        while(i<=j){
            if(nums[i]<nums[j]){
                ans = Math.min(ans,nums[i]);
                break;
            }
            int m=i+(j-i)/2;
            if(nums[m]>=nums[i] ){
                ans=Math.min(ans,nums[i]);
                i=m+1;
            }
            else if(nums[m] <= nums[j]){
                ans = Math.min(ans,nums[m]);
                j=m-1;                
            }
        }
        return ans;
    }
}