class Solution {
    public String longestPrefix(String s) {
        int i=0, j=s.length()-1;
        int l=j-1, f=i+1;
        while(f<=j || i<=l){
            String fi=help(s,i,l), se=help(s,f,j);
            if(fi.equals(se)) return fi;
            else {l--; f++;}
        }
        return "";
    }
    public String help(String s, int start, int end){
        String ans="";
        for(int i = start;i<=end;i++){
            ans+=Character.toString(s.charAt(i));
        }
        return ans;
    }
}