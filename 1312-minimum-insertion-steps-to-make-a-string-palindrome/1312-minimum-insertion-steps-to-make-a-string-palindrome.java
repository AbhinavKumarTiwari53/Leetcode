class Solution {
    public int minInsertions(String s) {
        int l=s.length();
        int map[]=new int[l+1];
        for(int i=1;i<=l;i++){
            int prevDiagonal=0;
            for(int j=1;j<=l;j++){
                int t=map[j];
                if(s.charAt(i-1)==s.charAt(l-j)) {
                    map[j]=prevDiagonal+1;
                }
                else map[j]=Math.max(map[j],map[j-1]);
                prevDiagonal=t;
            }
        }
        return l-map[l];
    }
}