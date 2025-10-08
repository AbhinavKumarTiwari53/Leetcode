class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0; i<board.length ;i++){
            for(int j=0; j<board[0].length; j++){
                if(board[i][j]!='.'){
                    char c = board[i][j];
                    board[i][j]='.';
                    if(!can(board, i, j, c)) return false;
                }
            }
        }
        return true;
    }
    boolean can(char[][] board, int row, int col, char c){
        for(int i=0;i<9;i++){
            if(board[i][col]==c) return false;
            if(board[row][i]==c) return false;
            if(board[3*(row/3)+i/3][3*(col/3)+i%3] == c) return false;
        }
        return true;
    }
}