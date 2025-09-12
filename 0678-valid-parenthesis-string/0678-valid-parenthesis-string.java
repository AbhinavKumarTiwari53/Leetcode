class Solution {
    public boolean checkValidString(String s) {
        int b=0,bin=0;
        for(Character c:s.toCharArray()){
            if(c=='(') {b++; bin++;}
            else if(c==')') {b--; bin--;}
            else if(c=='*') {b++;bin--;}
            if(b<0) return false;
            bin=Math.max(bin,0);
        }
        return bin==0;
    }
}