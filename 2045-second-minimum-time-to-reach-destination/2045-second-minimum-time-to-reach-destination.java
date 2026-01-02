class Solution {
    public int secondMinimum(int n, int[][] edges, int time, int change) {
        Map<Integer,List<Integer>> mp=new HashMap<>();
        for(int i[]:edges){
            int a=i[0], b=i[1];
            mp.computeIfAbsent(a,x->new ArrayList()).add(b);
            mp.computeIfAbsent(b,x->new ArrayList()).add(a);
        } 
        PriorityQueue<int[]> q=new PriorityQueue<>((a,b)->a[1]-b[1]);
        q.offer(new int[]{1,0});
        int u[]=new int[n+1];
        int d[]=new int[n+1];
        Arrays.fill(d,-1);
        while(!q.isEmpty()){
            int s=q.size();
            int c[]=q.poll();
            int a=c[0], b=c[1];
            if(d[a]==b || u[a]>=2) continue;
            u[a]++;
            d[a]=b;
            if(a==n && u[a]==2) return d[a];
            if((b/change)%2!=0) b=(b/change+1)*change;
            for(int i:mp.getOrDefault(a, new ArrayList<>())){
                q.offer(new int[]{i,b+time}); 
            }
        }
        return -1; 
    }
}