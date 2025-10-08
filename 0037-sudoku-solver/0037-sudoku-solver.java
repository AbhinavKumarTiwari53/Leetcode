class Solution {
    public void solveSudoku(char[][] board) {
        if(board==null || board.length==0){
            return;
        }
        solve(board);
    }
    boolean solve(char[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='.'){
                    for(char z='1'; z<='9'; z++){
                        if(can(board, i, j, z)){
                            board[i][j] = z;
                            if(solve(board)) return true;
                            else board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    boolean can(char[][] board, int row, int col, char c){
        for(int i=0;i<9;i++){
            if(board[i][col]!='.' && board[i][col]==c) return false;
            if(board[row][i]!='.' && board[row][i]==c) return false;
            if(board[3*(row/3)+i/3][3*(col/3)+i%3] != '.' && board[3*(row/3)+i/3][3*(col/3)+i%3] == c) return false;
        }
        return true;
    }
}