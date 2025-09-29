class Solution {
    public boolean exist(char[][] board, String word) {
        int n=board.length, m=board[0].length;
        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
        int visited[][] = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    int k=0;
                    if(check(board, i, j, dir, k, word,visited)) return true;
                }
            }
        }
        return false;
    }
    boolean check(char[][] board, int i, int j, int a[][], int k, String word, int[][] visited){
        if(k>=word.length()) return true;
        if(i<0 || j<0 || i>=board.length || j>=board[0].length || visited[i][j]==1 || board[i][j]!=word.charAt(k)) return false;
        visited[i][j]=1;
        for(int e[]:a){
            if(check(board,i+e[0],j+e[1],a,k+1,word,visited)) {visited[i][j]=0; return true;}
        }
        visited[i][j]=0;
        return false;
    }

}