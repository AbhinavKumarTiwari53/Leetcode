class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        int end = s.length();
        StringBuilder sb = new StringBuilder("");
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                if(i+1<end){
                    sb.append(s.substring(i+1,end)).append(" ");
                }
                end = i;
            }
        }
        sb.append(s.substring(0,end));
        return sb.toString();
    }
}