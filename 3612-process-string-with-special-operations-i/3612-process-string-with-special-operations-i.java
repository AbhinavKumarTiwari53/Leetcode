class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i++){
            char ch=c[i];
            if(Character.isLetter(ch)) sb.append(ch);
            else if(ch=='*' && sb.length()>0)  sb.deleteCharAt(sb.length()-1);
            else if(ch=='%')  sb.reverse();
            else {
                sb.append(sb);
            }
        }
        return sb.toString();
    }
}