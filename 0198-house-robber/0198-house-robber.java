class Solution {
    public int rob(int[] nums) {
        int r=0;
        int pr=0;
        for(int i=0;i<nums.length;i++){
            int temp=Math.max(pr+nums[i],r);
            pr=r;
            r=temp;
        }
        return r;
    }
}