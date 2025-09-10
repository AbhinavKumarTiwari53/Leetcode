class Solution {
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        Set<Integer> u = new HashSet<>();
        for(int[] f:friendships){
            int u1=f[0]-1, u2=f[1]-1;
            boolean can=false;
            for(int lang:languages[u1]){
                for(int lang1: languages[u2]){
                    if(lang==lang1) {can=true; break;}
                }
                if(can) break;
            }
            if(!can) {u.add(u1); u.add(u2);}
        }
        int min=languages.length+1;
        for(int lang=0;lang<=n;lang++){
            int count = 0;
            for(int us:u){
                boolean k=false;
                for(int l:languages[us]){
                    if(l==lang) {k=true; break;}
                }
                if(!k) count++;
            }
            min=Math.min(min,count);
        }
        return min;
    }
}