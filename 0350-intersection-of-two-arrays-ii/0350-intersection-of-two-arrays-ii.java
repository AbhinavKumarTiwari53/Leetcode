class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        HashMap<Integer,Integer> mp1=new HashMap<>();
        for(int i:nums1) {
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int i:nums2) {
            mp1.put(i,mp1.getOrDefault(i,0)+1);
        }
        List<Integer> li=new ArrayList<>();
        for(Map.Entry<Integer,Integer> v:mp.entrySet()){
            int a=v.getKey(); 
            int b=v.getValue(); 
            int l=Math.min(b,mp1.getOrDefault(a,0));
            if(l!=0) {
                for(int i=0;i<l;i++){
                    li.add(a);
                }
            }
        }
        int ans[] =new int[li.size()];
        for(int i=0;i<li.size();i++) ans[i]=li.get(i);
        return ans;
    }
}