class Solution {
    public int[][] merge(int[][] hmm) {
        List<int[]> li=new ArrayList<>();
        int n=hmm.length;
        Arrays.sort(hmm,(a,b)->a[0]-b[0]);
        int f=hmm[0][0], d=hmm[0][1];
        for(int i=0;i<n-1;i++){
            if(hmm[i+1][0]<=d) d=Math.max(d,hmm[i+1][1]);
            else{
                li.add(new int[]{f,d});
                d=hmm[i+1][1];
                f=hmm[i+1][0];
            }
        }
        li.add(new int[]{f,d});
        int ans[][]=new int[li.size()][2];
        for(int i=0;i<li.size();i++){
            int a[]=li.get(i);
            ans[i][0]=a[0];
            ans[i][1]=a[1];
        }
        return ans;
    }
}