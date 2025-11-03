class Solution {
    public int minDistance(String text1, String text2) {
        int l1=text1.length();
        int l2=text2.length();
        int map[]=new int[l2+1];
        for(int i=1;i<=l1;i++){
            int prevDiagonal=0;
            for(int j=1;j<=l2;j++){
                int t=map[j];
                if(text1.charAt(i-1)==text2.charAt(j-1)) {
                    map[j]=prevDiagonal+1;
                }
                else map[j]=Math.max(map[j],map[j-1]);
                prevDiagonal=t;
            }
        }
        return l1+l2-2*map[l2];
    }
}