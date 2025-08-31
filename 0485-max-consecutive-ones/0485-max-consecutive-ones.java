class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ws = 0, cws = 0;
        for(int i : nums){
            if(i == 0) {
                ws = Math.max(ws, cws);
                cws = 0;
            }
            else cws++;
        }
        return Math.max(ws, cws);
    }
}