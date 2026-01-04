class Solution {
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int i:nums) {
            int c=0;
            int sum=0;
            for(int j=1;j<=Math.sqrt(i);j++){
                if(i%j==0) {
                    c++;
                    sum+=j;
                    if(j!=i/j) {c++; sum+=i/j;}
                }
                if(c>4) {sum=0; break;}
            }
            ans+=(c==4)?sum:0;
        }
        return ans;
    }
}