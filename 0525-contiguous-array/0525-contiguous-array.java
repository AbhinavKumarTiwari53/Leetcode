class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        int n=nums.length;
        mp.put(0,-1);
        int ans=0;
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