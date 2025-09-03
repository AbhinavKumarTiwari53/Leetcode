class Solution {
    public boolean search(int[] nums, int target) {
        int f = 0, l=nums.length-1;
        while(f<=l){
            int mid = f+(l-f)/2;
            if(nums[mid]==target) return true;
            if(nums[f] == nums[mid] && nums[mid]==nums[l]){f++; l--; continue;}
            if(nums[f] <= nums[mid]){
                if(nums[f]<=target && target<nums[mid]) l=mid-1;
                else f=mid+1;
            }
            else{
                if(nums[l]>=target && nums[mid]<target) f=mid+1;
                else l=mid-1;
            }
        }
        return false;
    }
}