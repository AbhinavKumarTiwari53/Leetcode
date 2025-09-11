class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> sk = new Stack<>();
        int i=0, ans=0;
        while(i<s.length()){
            if(s.charAt(i) == '(') {sk.push('('); i++; ans++;}
            else if(s.charAt(i) == ')' && !sk.isEmpty()) {i++; sk.pop(); ans--;}
            else {ans++; i++;}
        }
        return ans;
    }
}