class Solution {
    public void nextPermutation(int[] nums) {
        int in = -1, j=-1;
        for(int i = nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                in=i;
                break;
            }
        }
        if(in==-1) rev(nums,0);
        else{
            for(int i = nums.length-1;i>=0;i--){
                if(nums[i]>nums[in]){
                    j=i;
                    break;
                }
            }
            swap(nums,in,j);
            rev(nums,in+1);
        }        
    }
    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    void rev(int[] nums,int s){
        int i =s;
        int j = nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}