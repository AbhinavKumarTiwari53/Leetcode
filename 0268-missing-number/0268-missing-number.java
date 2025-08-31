class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int sum = (l*(l+1))/2;
        for(int i : nums){
            sum -= i;
        }
        return sum;
    }
}