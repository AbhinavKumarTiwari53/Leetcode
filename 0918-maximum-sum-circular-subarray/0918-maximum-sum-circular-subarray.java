class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int Tsum = 0, ans = maxSum(nums);
        for(int i=0;i<nums.length;i++){
            Tsum+=nums[i];
            nums[i] = -1*nums[i];
        }
        if(ans<0) return ans;
        return Math.max(ans,Tsum+maxSum(nums));
    }
    int maxSum(int arr[]){
        int sum=0, msum=Integer.MIN_VALUE;
        for(int i:arr){
            sum+=i;
            msum=Math.max(sum,msum);
            if(sum<0) sum=0;
        }
        return msum;
    }
}