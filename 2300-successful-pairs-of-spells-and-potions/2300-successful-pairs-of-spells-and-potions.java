class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n=spells.length,  m = potions.length;
        int[] res = new int[n];
        int i=0;
        Arrays.sort(potions);
        while(i<n){
            int s=0;
            int l=0, r=m-1;
            while(l<=r){
                int mid=l+(r-l)/2;
                long c=(long)spells[i]*potions[mid];
                if(c>=success) {s+=r-mid+1; r=mid-1;}
                else l=mid+1;
            }
            res[i++] = s;
        }
        return res;
    }
}