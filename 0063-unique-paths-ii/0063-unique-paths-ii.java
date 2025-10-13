class Solution {
    public int uniquePathsWithObstacles(int[][] a) {
        int m=a.length;
        int n=a[0].length;
        int p[][] = new int[m][n];
        for(int i=0;i<m;i++) {
            if(a[i][0]==1) {
                p[i][0]=0;
                break;
            }
            p[i][0]=1;
        }
        for(int i=0;i<n;i++) {
            if(a[0][i]==1) {
                p[0][i]=0;
                break;
            }
            p[0][i]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                if(a[i][j]==1){
                    p[i][j]=0;
                }
                else {
                    p[i][j]=p[i-1][j]+p[i][j-1];
                }
            }
        }
        return p[m-1][n-1];
    }
}