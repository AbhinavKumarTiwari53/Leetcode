class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> li=new ArrayList<>();
        for(int i=0;i<n;i++) li.add(new ArrayList<>());
        for(int e[]:edges){
            li.get(e[0]).add(e[1]);
            li.get(e[1]).add(e[0]);
        }
        Stack<Integer> s=new Stack<>();
        boolean visit[]=new boolean[n];
        s.push(source);
        while(!s.isEmpty()){
            int c=s.pop();
            if(c==destination) return true;
            if (visit[c]) continue;
            visit[c]=true;
            for(int i:li.get(c)){
                if(!visit[i]) s.push(i);
            }
        }
        return false;
    }
}