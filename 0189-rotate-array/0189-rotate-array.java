class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        if (l == 0) return;
        k %= l;
        if (k == 0) return;
        int[] arr = new int[l];
        int m = 0;
        for(int i : nums){
            arr[(m + k)%l] = i;
            m++;
        }
        m = 0;
        for(int i : arr){
            nums[m] = i;
            m++;
        }
    }
}