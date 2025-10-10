class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st=new Stack<>();
        int j=1;
        st.push(s.charAt(0));
        while(j<s.length()){
            if(!st.isEmpty() && s.charAt(j)==st.peek()) {st.pop(); j++;}
            else st.push(s.charAt(j++));
        }
        String ans="";
        while(!st.isEmpty()){
            ans+=Character.toString(st.pop());
        }
        StringBuilder sb=new StringBuilder(ans);
        return sb.reverse().toString();
    }
}