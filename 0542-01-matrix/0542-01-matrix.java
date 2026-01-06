class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int n=mat.length, m=mat[0].length;
        int[][] ans=new int[n][m];
        Queue<int[]> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==0) {ans[i][j]=0; q.offer(new int[]{i,j});}
                else ans[i][j]=-1;
            }
        }
        int[][] d={{0,1},{1,0},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int a[]=q.poll();
            int r=a[0], c=a[1];
            for(int i[]:d){
                int rr=r+i[0], cc=c+i[1];
                if(rr>=0 && rr<n && cc>=0 && cc<m && ans[rr][cc]==-1){
                    ans[rr][cc]=1+ans[r][c];
                    q.offer(new int[]{rr,cc});
                } 
            }
        }
        return ans;   
    }

    // int help(int[][] mat, int[][] a, int s, int t, int n,int m){
    //     if(s<0 || s>=n || t<0 || t>=m || mat[s][t]==0) return 0;
    //     int ans=Integer.MAX_VALUE; 
    //     for(int i[]:a){
    //         mat[s][t]=Math.min(mat[s][t],help(mat,a,s+i[0],t+i[1],n,m)+1); 
    //     }
    //     return mat[s][t]; 
    // }
}