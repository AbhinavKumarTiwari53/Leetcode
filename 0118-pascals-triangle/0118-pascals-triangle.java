class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> res = new ArrayList<>(Collections.nCopies(i+1,1));
            for(int j=1;j<i;j++){
                int v = ans.get(i-1).get(j-1) + ans.get(i-1).get(j);
                res.set(j,v);
            }
            ans.add(res);
        }
        return ans;
    }
}