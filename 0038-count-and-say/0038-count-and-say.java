public class Solution{
    public String countAndSay(int n){
        String s = "1";
        for(int i=1;i<n;i++) s = count(s);
        return s;
    }
    public String count(String s){
        StringBuilder sb = new StringBuilder();
        char c =s.charAt(0);
        int coun = 1;
        for(int i =1;i<s.length();i++){
            if(s.charAt(i) == c) coun++;
            else{
                sb.append(coun);
                sb.append(c);
                c=s.charAt(i);
                coun=1;
            }
        }
        sb.append(coun);
        sb.append(c);
        return sb.toString();
    }
}