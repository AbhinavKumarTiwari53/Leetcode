class Solution {
    public int numEnclaves(int[][] g) {
        int n=g.length, m=g[0].length;
        boolean[][] v=new boolean[n][m];
        int d[][]={{0,1},{1,0},{-1,0},{0,-1}};
        for(int i=0;i<m;i++){   
            if(!v[0][i] && g[0][i]==1){
                dfs(g, v, 0, i, n, m, d);
            }
            if(!v[n-1][m-i-1] && g[n-1][m-i-1]==1){
                dfs(g, v, n-1, m-i-1, n, m, d);
            }
        }
        for(int i=0;i<n;i++){   
            if(!v[i][0] && g[i][0]==1){
                dfs(g, v, i, 0, n, m, d);
            }
            if(!v[n-i-1][m-1] && g[n-i-1][m-1]==1){
                dfs(g, v, n-i-1, m-1, n, m, d);
            }
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(g[i][j]==1 && !v[i][j]){
                    ans++;
                }
            }
        }
        return ans;
    }

    private void dfs(int[][] g, boolean[][] v, int i, int j, int n, int m, int[][] d){
        if(i<0 || i==n || j<0 || j==m || g[i][j]==0 || v[i][j]) return;
        v[i][j]=true;
        g[i][j]=0;
        for(int k[]:d){
            dfs(g, v, i+k[0], j+k[1], n, m, d);
        }
    }

}