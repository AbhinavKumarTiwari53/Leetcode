class Solution {
    boolean[] visited;
    int n;
    public int findCircleNum(int[][] isConnected) {
        this.n = isConnected.length;
        visited = new boolean[n];
        int ret = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                ret++;
                dfs(isConnected, i);
            }
        }
        return ret;
    }
    private void dfs(int[][] isConnected, int cur) {
        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;
            if (isConnected[cur][i] == 0) continue;
            visited[i] = true;
            dfs(isConnected, i);
        }
    }
}