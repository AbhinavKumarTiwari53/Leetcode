class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int n=nums.length;
        List<Integer> ans=new ArrayList<>();
        List<Integer> li=new ArrayList<>();

        for(int i=n-1;i>=0;i--){
            int l=0, r=li.size();
            while(l<r){
                int mid=l+(r-l)/2;
                if(li.get(mid)>=nums[i]) r=mid;
                else l=mid+1;
            }
            li.add(l,nums[i]);
            ans.add(l);
        }
        Collections.reverse(ans);
        return ans;
    }
}