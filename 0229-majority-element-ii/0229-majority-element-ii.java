class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c = 0, max = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        for(int i : nums){
            mp.put(i,mp.getOrDefault(i,0)+1);
            if(mp.get(i) > nums.length/3){
                if(!ans.contains(i)) ans.add(i);
            }
        }
        return ans;
    }
}