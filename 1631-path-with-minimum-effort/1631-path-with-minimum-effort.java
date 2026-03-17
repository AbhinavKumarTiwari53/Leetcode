class Solution {
    public int minimumEffortPath(int[][] h) {
        int n=h.length, m=h[0].length;
        if(n==1 && m==1) return 0;
        int[][] effort = new int[n][m];
        for(int i[]:effort){
            Arrays.fill(i,Integer.MAX_VALUE);
        }
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[2]-b[2]);
        pq.offer(new int[]{0,0,0});
        int[][] dir={{0,1},{0,-1},{1,0},{-1,0}};
        while(!pq.isEmpty()){
            int[] cur=pq.poll();
            int r=cur[0],c=cur[1];
            int ce=cur[2];
            for(int d[]:dir){
                int nr=r+d[0];
                int nc=c+d[1];
                if(nr<0 || nr>=n || nc<0 || nc>=m)
                    continue;
                int ne=Math.max(ce,Math.abs(h[nr][nc]-h[r][c]));
                if(ne<effort[nr][nc]){ 
                    effort[nr][nc]=ne;
                    pq.offer(new int[]{nr,nc,ne});
                }
            }
        }
        return effort[n-1][m-1];
    }
}