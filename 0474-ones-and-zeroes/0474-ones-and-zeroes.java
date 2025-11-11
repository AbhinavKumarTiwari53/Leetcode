class Solution {
    public int findMaxForm(String[] S, int M, int N) {
        int dp[][] = new int[M+1][N+1];
        for(String s:S){
            int z=0;
            int o=0;
            for(char c:s.toCharArray()){
                if(c=='0') z++;
                else o++;
            }
            for(int i=M;i>=z;i--){
                for(int j=N;j>=o;j--){
                    dp[i][j]=Math.max(dp[i][j],dp[i-z][j-o]+1);
                }
            }
        }
        return dp[M][N];
    }
}