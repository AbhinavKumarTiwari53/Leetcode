class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        // help(ans, new ArrayList<Integer>(), nums, 0);
        List<Integer> arr = new ArrayList<>();
        for(int i:nums) arr.add(i);
        fun(arr, ans, new ArrayList<>());
        return ans;
    }
    void fun(List<Integer> arr, List<List<Integer>> ans, List<Integer> p) {
        if(arr.size()==0) {ans.add(new ArrayList<Integer>(p)); return;}
        for(int i=0;i<arr.size();i++) {
            int num=arr.get(i);
            p.add(num);
            arr.remove(i);
            fun(arr, ans, p);
            arr.add(i,num);
            p.remove(p.size()-1);
        }
    }

    // void help(List<List<Integer>> ans, List<Integer> res, int[] nums, int s){
    //     if(s>=nums.length) ans.add(new ArrayList<Integer>(res));
    //     for(int i=s;i<nums.length ;i++){
    //         res.add(nums[i%nums.length]);
    //         help(ans,res,nums,i+1);
    //         res.remove(res.size()-1);
    //     }
    // }

}