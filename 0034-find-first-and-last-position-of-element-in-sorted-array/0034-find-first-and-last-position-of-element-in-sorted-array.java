class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int i = 0, j = nums.length-1;
        boolean s = true, l = true;
        while(i <= j){
            if(s && nums[i] == target) {ans[0] = i; s = false;}
            if(l && nums[j] == target) {ans[1] = j; l = false;}
            if(!s && !l) break;
            i = s ? i+1 : i;
            j = l ? j-1 : j;
        }
        return ans;
    }
}