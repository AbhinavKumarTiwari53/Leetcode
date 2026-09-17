class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,ans=0, n=s.length();
        int fr[]=new int[256];
        while(r<n){
            char c=s.charAt(r);
            fr[c]++;
            r++;
            while(l<r && fr[c]>1){
                fr[s.charAt(l)]--;
                l++;
            }
            ans=Math.max(ans,r-l);
            }
        return ans;
    }
}