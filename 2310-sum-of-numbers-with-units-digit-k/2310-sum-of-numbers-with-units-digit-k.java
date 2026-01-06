class Solution {
    public int minimumNumbers(int nums, int k) {
        if(nums==0) return 0;
        int x=nums%10;
        for(int i=1; i<=10; i++){
            if((k*i)%10==x) {
                if(nums>=k*i) return i;
                else return -1;
            }
        }
        return -1;       
    }
}