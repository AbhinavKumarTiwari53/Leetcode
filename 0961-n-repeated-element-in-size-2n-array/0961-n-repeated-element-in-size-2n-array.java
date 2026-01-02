class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n/2]==nums[n-1]?nums[n/2]:nums[n/2-1];
    }
}