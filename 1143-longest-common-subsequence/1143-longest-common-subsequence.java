class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int l1=text1.length();
        int l2=text2.length();
        int map[][]=new int[l1+1][l2+1];
        for(int i=1;i<=l1;i++){
            for(int j=1;j<=l2;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)) {
                    map[i][j]=map[i-1][j-1]+1;
                }
                else map[i][j]=Math.max(map[i-1][j],map[i][j-1]);
            }
        }
        return map[l1][l2];
    }
}