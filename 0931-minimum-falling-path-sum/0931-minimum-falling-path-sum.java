class Solution {
    public int minFallingPathSum(int[][] a) {
        int m=a.length;
        int n=a[0].length;
        for(int i=1;i<m;i++){
            for(int j=0;j<n;j++){
                int min=Integer.MAX_VALUE;
                for(int k=j-1;k<j+2;k++){
                    if(k>=0 && k<n){
                        min=Math.min(min,a[i-1][k]);
                    }
                }
                a[i][j]+=min;
            }
        }
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min=Math.min(min,a[m-1][i]);
        }
        return min;
    }
}