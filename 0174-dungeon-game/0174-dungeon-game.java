class Solution {
    public int calculateMinimumHP(int[][] d) {
        int m = d.length, n = d[0].length;
        int[][] dp = new int[m][n];
        dp[m-1][n-1] = Math.max(1, 1 - d[m-1][n-1]);
        for (int i = m - 2; i >= 0; i--) {
            dp[i][n - 1] = Math.max(1, dp[i + 1][n - 1] - d[i][n - 1]);
        }
        for (int j = n - 2; j >= 0; j--) {
            dp[m - 1][j] = Math.max(1, dp[m - 1][j + 1] - d[m - 1][j]);
        }
        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                int need = Math.min(dp[i + 1][j], dp[i][j + 1]);
                dp[i][j] = Math.max(1, need - d[i][j]);
            }
        }
        return dp[0][0];
    }
}
