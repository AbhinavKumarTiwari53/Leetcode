class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int dp[]=new int[m+1];
        for(int i=1;i<=n;i++){
            int pre=0;
            for(int j=1;j<=m;j++){
                int a=dp[j];
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[j]=1+pre;
                }else dp[j]=Math.max(dp[j],dp[j-1]);
                pre=a;
            }
        }
        return dp[m];
    }
}