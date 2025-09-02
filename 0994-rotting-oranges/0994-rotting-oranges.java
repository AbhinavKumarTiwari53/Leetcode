class Solution {
    public int orangesRotting(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] visited = grid;
        Queue<int[]> q = new LinkedList<>();
        int time = -1, Worange = 0;
        for(int i = 0; i<n;i++){
            for(int j = 0; j<m;j++){
                if(visited[i][j] == 2){
                    q.add(new int[]{i,j});
                }
                else if(grid[i][j] == 1){
                    Worange++;
                }
            }
        }
        if(Worange == 0) return 0;
        if(q.isEmpty()) return -1; 
        int[] dr  = {0, 1, 0, -1};
        int[] dc  = {1, 0, -1, 0};
        while(!q.isEmpty()){
            int s = q.size();
            while(s-- > 0){
                int l[] = q.poll();
                int r = l[0];
                int c = l[1];
                for(int i = 0; i<4 ; i++){
                    int sr = r + dr[i];
                    int sc = c + dc[i];
                    if(sr>=0 && sc>=0 && sr<n && sc<m &&visited[sr][sc] == 1){
                        Worange--;
                        visited[sr][sc] = 2;
                        q.add(new int[]{sr,sc});
                    }
                }
            }
        time++;
        }
        if(Worange == 0){
            return time;
        }
        return -1;
    }
}