class Solution {
    public int[] findOrder(int n, int[][] pre) {
        List<List<Integer>> li=new ArrayList<>();
        int[] in=new int[n];
        int[] ans=new int[n];
        for(int i=0;i<n;i++) li.add(new ArrayList<>());
        for(int i[]:pre){
            li.get(i[1]).add(i[0]);
            in[i[0]]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++) if(in[i]==0) q.add(i);

        int i=0;
        while(!q.isEmpty()){
            int a=q.poll();
            ans[i++]=a;
            for(int j:li.get(a)){
                in[j]--;
                if(in[j]==0) q.add(j);
            }
        }
        if(i!=n) return new int[0];
        return ans;
    }
}