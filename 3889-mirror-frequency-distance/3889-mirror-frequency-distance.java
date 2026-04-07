class Solution {
    public int mirrorFrequency(String s) {
        Map<Character,Integer> fre=new HashMap<>();
        Map<Character,Character> mp=new HashMap<>();
        Character ch[]={'0','1','2','3','4','5','6','7','8','9'};
        for(int i=0;i<27;i++){
            mp.put((char)('a'+i),(char)('z'-i));
        }
        for(int i=0;i<10;i++){
            mp.put(ch[i],ch[9-i]);
        }
        int ans=0;
        for(char c:s.toCharArray()){
            fre.put(c,fre.getOrDefault(c,0)+1);
        }
        Set<Character> set=new HashSet<>();
        for(char c:s.toCharArray()){
            char m=mp.get(c);
            if(set.contains(c) || set.contains(m)) continue;
            int a=fre.get(c);
            int b=fre.getOrDefault(m,0);
            set.add(c); set.add(m);
            ans+=Math.abs(a-b);
        }
        return ans;
    }
}