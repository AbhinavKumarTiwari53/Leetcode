class Solution {
    public int ladderLength(String f, String l, List<String> wordList) {
        Set<String> set=new HashSet<>();
        for(String s:wordList) set.add(s);
        if(!set.contains(l)) return 0;
        Queue<String> q=new LinkedList<>();
        q.add(f);
        int lvl=1;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                String s=q.poll();
                char c[] = s.toCharArray();
                for(int j=0;j<c.length;j++){
                    char ff=c[j];
                    for(char ch='a';ch<='z'; ch++){
                        c[j]=ch;
                        String temp=new String(c);
                        if(temp.equals(l)) return lvl+1;
                        if(set.contains(temp)){
                            q.add(temp);
                            set.remove(temp);
                        }
                    }
                    c[j]=ff;
                }
            }
            lvl++;
        }
        return 0;
    }
}