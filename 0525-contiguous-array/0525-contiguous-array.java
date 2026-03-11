class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int ans=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        mp.put(0,-1);
        int sum=0;
        for(int i=0;i<n;i++) if(nums[i]==0) nums[i]=-1;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(mp.containsKey(sum)){
                ans=Math.max(ans,i-mp.get(sum));
            }else mp.put(sum,i);
        }
        return ans;
    }
}