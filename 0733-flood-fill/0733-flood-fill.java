class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n=image.length, m=image[0].length;
        int prev=image[sr][sc];
        if(prev==color) return image;
        help(image, prev, color, sr, sc, n, m);
        return image;
    }
    void help(int[][] img, int prev, int c, int sr, int sc, int n, int m){
        if(sr==n || sc==m || sr<0 || sc<0 || img[sr][sc]!=prev) return;
        img[sr][sc]=c;
        int[] dr={0,1,-1,0};
        int[] dc={-1,0,0,1};
        for(int i=0;i<4;i++){
            help(img, prev, c, sr+dr[i], sc+dc[i], n, m);
        } 
    }
}