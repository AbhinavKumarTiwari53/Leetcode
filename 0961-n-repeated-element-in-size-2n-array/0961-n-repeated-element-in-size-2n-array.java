class Solution {
    public int repeatedNTimes(int[] nums) {
        int n=nums.length;
        int nu[] = new int[10000];
        for(int i=0;i<n;i++){
            nu[nums[i]]++;
            if(nu[nums[i]]==n/2) return nums[i];
        }
        return -1;
    }
}