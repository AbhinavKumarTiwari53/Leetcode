class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set=new HashSet<>();
        for(String s:wordList) set.add(s);
        if(!set.contains(endWord)) return 0;
        int l=1;
        Queue<String> q=new LinkedList<>();
        q.add(beginWord);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                String s=q.poll();
                char cc[]=s.toCharArray();
                for(int j=0;j<cc.length;j++){
                    char f=cc[j];
                    for(char ch='a';ch<='z';ch++){
                        cc[j]=ch;
                        String temp=new String(cc);
                        if(temp.equals(endWord)) return l+1;
                        if(set.contains(temp)){
                            q.add(temp);
                            set.remove(temp);
                        }
                    }
                    cc[j]=f;
                }
            }
            l++;
        }
        return 0;
    }
}