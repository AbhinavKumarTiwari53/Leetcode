class Solution {
    public int timeRequiredToBuy(int[] tt, int k) {
        int t=0, n=tt.length;
        while(tt[k]!=0){
            for(int i=0;i<n;i++){
                if(tt[i]==0) continue;
                tt[i]--;
                t++;
                if(tt[k]==0) return t;
            }
        }
        return t;
    }
}