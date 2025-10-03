class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        if((n*(n+1))/2 < k) return ans;
        help(ans, new ArrayList<>(), n, 1, k);
        return ans;
    }
    void help(List<List<Integer>> ans, List<Integer> res, int n, int s, int k){
        if(n==0 && res.size()==k) ans.add(new ArrayList<Integer>(res));
        for(int i=s; i<=n; i++){
            if(i<10){res.add(i);
            help(ans, res, n-i, i+1, k);
            res.remove(res.size()-1);}
        }
    }
}