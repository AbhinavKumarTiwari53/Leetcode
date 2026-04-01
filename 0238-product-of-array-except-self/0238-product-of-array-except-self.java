class Solution {
    public int[] productExceptSelf(int[] nums) {
        int c=0;
        int n=nums.length;
        int pro=1;
        int idx=0;
        int ans[]=new int[n];
        for(int i=0;i<n;i++) {if(nums[i]==0) {c++; idx=i;}
            else pro*=nums[i];
        }
        if(c>1) {
            Arrays.fill(ans,0);
            return ans;
        }
        if(c==1){
            Arrays.fill(ans,0);
            ans[idx]=pro;
            return ans;
        }
        for(int i=0;i<n;i++){
            ans[i]=pro/nums[i];
        }
        return ans;
    }
}