class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        Map<Integer,Integer> s=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(s.containsKey(nums[i])) {
                a[0]=i;
                a[1]=s.get(nums[i]);
                break;
            }else{
                s.put(target-nums[i],i);
            }
        }
        return a;
    }
}