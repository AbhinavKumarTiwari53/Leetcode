class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length, nz = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) nums[nz++] = nums[i];
        }
        while (nz < n) nums[nz++] = 0;
    }
}