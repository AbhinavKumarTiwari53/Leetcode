class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gl = gas.length;
        int fuel = 0;
        int ans=0;
        int tg=0;
        int tc=0;
        for(int i=0;i<gl;i++){
            fuel += gas[i] - cost[i];
            tc+=cost[i];
            tg+=gas[i];
            if(fuel < 0) {
                ans = i+1;
                fuel = 0;
            }
        }
        return tg>=tc ? ans:-1;
    }
}