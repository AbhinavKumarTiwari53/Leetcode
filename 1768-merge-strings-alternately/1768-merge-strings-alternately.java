class Solution {
    public String mergeAlternately(String word1, String word2) {
        var w1len = word1.length();
        var w2len = word2.length();
        var longest = w1len < w2len ? w2len : w1len;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < longest; i++){
            if(i < w1len){
                stringBuilder.append(word1.charAt(i));
            }
            if(i < w2len){
                stringBuilder.append(word2.charAt(i));
            }
        }
        return stringBuilder.toString();
    }
}