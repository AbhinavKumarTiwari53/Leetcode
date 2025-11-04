class Solution {
    public int lengthOfLIS(int[] nums) {
        int m[]=new int[nums.length];
        Arrays.fill(m,1);
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]) {
                    if(m[j]+1>m[i]){
                        m[i]=m[j]+1;
                    }
                }
            }
        }
        int max=-1;
        for(int i=0;i<nums.length;i++){
            if(m[i]>max) max=m[i];
        }
        return max;
    }
}