class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, max = 0;
        for(int i : nums){
            sum = Math.max(i, sum + i);
            max = Math.max(max, sum);
        }
        return max;
    }
}