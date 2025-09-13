class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> vow = new HashMap<>();
        HashMap<Character,Integer> cons = new HashMap<>();
        int maxC = 0, maxV=0;
        for(Character i : s.toCharArray()){
            if("aeiouAEIOU".indexOf(i)>=0) {
                vow.put(i,vow.getOrDefault(i,0)+1); 
                maxV=Math.max(maxV,vow.get(i));
            }
            else{
                cons.put(i,cons.getOrDefault(i,0)+1);
                maxC=Math.max(maxC,cons.get(i));
            }   
        }
        return maxC+maxV;
    }
}