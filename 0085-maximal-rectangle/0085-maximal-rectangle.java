class Solution {
    public int maximalRectangle(char[][] matrix) {
        int n=matrix.length, m=matrix[0].length, ans=0;
        for(int i=0;i<n ;i++){
            int r[]=new int[m];
            for(int j=i; j<n;j++){
                int h=j-i+1, sum=0;
                for(int k=0; k<m;k++){
                    r[k]+=matrix[j][k]-'0';
                    if(r[k]==h){
                        sum+=h;
                        ans=Math.max(ans,sum);
                    }
                    else sum=0;
                }
            }
        }
        return ans;
    }
}