class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n==0) return n; 
        int idx=1; // current unique
        for(int i=1;i<n;i++){
            if(nums[idx-1]!=nums[i]) {  // check current with prev
                nums[idx]=nums[i]; // update last unique
                idx++;
            }
        }
        return idx; 
    }
}