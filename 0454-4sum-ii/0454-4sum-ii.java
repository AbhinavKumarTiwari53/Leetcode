class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int ans=0;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i:nums1){
            for(int j:nums2){
                mp.put(i+j,mp.getOrDefault(i+j,0)+1);
            }
        }
        for(int i:nums3){
            for(int j:nums4){
               int c=-(i+j);
               if(mp.containsKey(c)){
                ans+=mp.get(c);
               }
            }
        }
        return ans;
    }
}