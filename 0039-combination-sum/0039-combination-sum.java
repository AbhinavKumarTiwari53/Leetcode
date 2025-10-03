class Solution {
    public List<List<Integer>> combinationSum(int[] c, int t) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(c);
        help(ans, new ArrayList<>(), c, 0, t);
        return ans;
    }
    void help( List<List<Integer>> ans,List<Integer> res, int[] c, int s, int t){
        if(t<0) return;
        else if(t==0) ans.add(new ArrayList<Integer>(res));
        for(int i=s; i<c.length && t>=c[i]; i++){
            res.add(c[i]);
            help(ans, res, c, i, t-c[i]);
            res.remove(res.size()-1);
        }
    }
}