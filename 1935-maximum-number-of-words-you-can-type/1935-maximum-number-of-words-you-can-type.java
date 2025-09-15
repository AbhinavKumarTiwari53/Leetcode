class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] arr = text.split(" ");
        int ans = arr.length;
        for(String s : arr){
            for(Character c: brokenLetters.toCharArray()){
                if(s.indexOf(c) != -1) {ans--; break;}
            }
            if(ans == 0) break;
        }
        return ans;
    }
}