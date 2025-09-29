class Solution {
    public boolean exist(char[][] board, String word) {
        int n = board.length, m = board[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == word.charAt(0)) {
                    int k = 0;
                    if (check(board, i, j, k, word))
                        return true;
                }
            }
        }
        return false;
    }

    boolean check(char[][] board, int i, int j, int k, String word) {
        if (k >= word.length())
            return true;
        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == '*'
                || board[i][j] != word.charAt(k))
            return false;
        char c = board[i][j];
        board[i][j] = '*';
        boolean ans=false;
        ans |= check(board, i + 1, j, k + 1, word);
        ans |= check(board, i - 1, j, k + 1, word);
        ans |= check(board, i , j-1, k + 1, word);
        ans |= check(board, i , j+1, k + 1, word);
        board[i][j] = c;
        return ans;
    }

}