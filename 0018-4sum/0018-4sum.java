class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> li=new ArrayList<>();
        if(nums.length<4) return li;
        int n=nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<n-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int s=j+1, e=n-1;
                while(s<e){
                    int sum=nums[i]+nums[j]+nums[s]+nums[e];
                    if(sum==target){
                        li.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[s],nums[e])));
                        while(s<e && nums[s]==nums[s+1]) s++;
                        while(s<e && nums[e]==nums[e-1]) e--;
                        s++; e--;
                    }
                    else if(sum<target) s++;
                    else e--;
                }
            }
        }
        return li;
    }
}