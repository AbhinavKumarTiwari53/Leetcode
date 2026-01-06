class Solution {
    public void solve(char[][] b) {
        int n=b.length, m=b[0].length; 
        boolean vis[][]=new boolean[n][m];  
        int dir[][] = { { 1, 0}, { 0, 1 }, { -1, 0 }, { 0, -1 } };   
        for(int i=0;i<m;i++) if(!vis[0][i] && b[0][i]=='O') dfs(b,vis, 0, i, n,m, dir);
        for(int i=0;i<n;i++) if(!vis[i][0] && b[i][0]=='O') dfs(b,vis, i, 0, n,m, dir);
        for(int i=m-1;i>=0;i--) if(!vis[n-1][i] && b[n-1][i]=='O') dfs(b,vis, n-1, i, n,m, dir);
        for(int i=n-1;i>=0;i--) if(!vis[i][m-1] && b[i][m-1]=='O') dfs(b,vis, i, m-1, n,m, dir);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(b[i][j]!='S') b[i][j]='X';
                else b[i][j]='O'; 
            }
        }
    }
    private void dfs(char[][] b, boolean[][] v,int i, int j, int n, int m, int[][] dir){
        if ( i == n || i < 0 || j == m || j < 0 || v[i][j] || b[i][j] == 'X') return ;
        v[i][j] = true;
        b[i][j]='S';
        for ( int d[] : dir ) {
            dfs( b , v, i + d[0], j + d[1] , n ,m ,dir);
        }
    }
} 