class Solution {
    public String simplifyPath(String path) {
        Deque<String> st=new LinkedList<>();
        for(String s:path.split("/")){
            if(s.equals("..")) st.poll();
            else if(!s.equals("") && !s.equals(".")) st.push(s);
        }
        StringBuilder sb = new StringBuilder();
        if(st.size()==0) return "/";
        while(st.size()!=0) sb.append("/").append(st.pollLast());
        return sb.toString();
    }
}