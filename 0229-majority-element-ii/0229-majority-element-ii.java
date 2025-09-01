class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int c1 = 1, c2 = 0, k1 = 0, k2 = 0;
        for(int i : nums){
            if(i == c1) k1++;
            else if(i == c2) k2++;
            else if(k1 == 0) {c1 = i; k1 = 1;}
            else if(k2 == 0) {c2 = i; k2 = 1;}
            else {k1--; k2--;}
        }
        k1 = 0; k2 = 0;
        for(int i : nums){
            if(c1 == i) k1++;
            else if(c2 == i) k2++;
        }
        int l = nums.length/3;
        if(k1 > l) ans.add(c1);
        if(k2 > l) ans.add(c2);
        return ans;
    }
}