class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length, res = 0, ans = 0;
        int[] l=new int[n], cnt = new int[n];
        for(int i=0; i<n; i++){
            l[i]=cnt[i] = 1;
            for(int j=0; j<i ; j++){
                if(nums[i]>nums[j]){
                    if(l[i]==l[j] + 1)cnt[i] += cnt[j];
                    if(l[i] < l[j] + 1){
                        l[i] = l[j] + 1;
                        cnt[i] = cnt[j];
                    }
                }
            }
            if(ans==l[i]) res+=cnt[i];
            if(ans<l[i]){
                ans=l[i];
                res=cnt[i];
            }
        }
        return res;
    }
}