class Solution {
    public List<List<Integer>> combinationSum2(int[] c, int t) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(c);
        help(ans, new ArrayList<Integer>(),c, t, 0);
        return ans;
    }
    void help(List<List<Integer>> ans, ArrayList<Integer> res, int[] c, int t, int s){
        if(t<0) return ;
        else if(t==0) ans.add(new ArrayList<Integer>(res));
        else {
            for(int i=s; i<c.length;i++){
                if(i>s && c[i]==c[i-1]) continue;
                res.add(c[i]);
                help(ans,res,c,t-c[i],i+1);
                res.remove(res.size()-1);
            }
        }
    }
}