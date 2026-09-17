class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int ans =0;
        int n=s.length();
        Set<Character> set=new HashSet<>();
        for(int r=0;r<n;r++){
            char c=s.charAt(r);
            if(!set.contains(c)){
                set.add(c);
                ans=Math.max(ans,r-l+1);
            }else{
                while(set.contains(c)){
                    set.remove(s.charAt(l));
                    l++;
                }
                set.add(c);
            }
        }
        return ans;
    }
}