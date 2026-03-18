class Solution {
    public int minNumberOfHours(int mana, int exp, int[] energy, int[] experience) {
        int ans=0;
        int n=energy.length;
        for(int i=0;i<n;i++){
            if(exp<=experience[i]){
                if(exp==experience[i]) {
                    ans+=1;
                    exp+=experience[i]+1;
                }else{
                    ans+=experience[i]-exp+1;
                    exp+=experience[i];
                }
            }
           else{
                exp+=experience[i];
            }
        }
        for(int i=0;i<n;i++){
             if(mana<=energy[i]){
                if(mana==energy[i]) {
                    ans+=1;
                    mana=1;
                }else{
                    ans+=energy[i]-mana+1;
                    mana=1;
                }
            }else mana-=energy[i];
        }
        return ans;
    }
}