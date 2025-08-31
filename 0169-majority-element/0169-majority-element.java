class Solution {
    public int majorityElement(int[] nums) {
        int maj = 0, c = 0;
        for(int i : nums){
            if( c == 0) maj = i;
            c += (maj == i) ? 1 : -1;
        }
        return maj;
    }
}