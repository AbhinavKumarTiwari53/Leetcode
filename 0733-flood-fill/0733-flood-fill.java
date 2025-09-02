class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length, m = image[0].length;
        int prev = image[sr][sc];
        if(prev == color) return image;
        help(image, n, m, sr, sc, prev, color);
        return image;
    }
    public void help(int[][] image, int n, int m, int sr, int sc, int prev, int color){
        if(sr < 0 || sc < 0 || sr >= n || sc >= m || prev != image[sr][sc]) return;
        image[sr][sc] = color;
        int[] dr = {0,1,0,-1};
        int[] dc = {1, 0, -1, 0};
        for(int i =0  ; i<4; i++){
            help(image, n, m, sr+dr[i], sc+dc[i], prev, color);
        }
    }
}