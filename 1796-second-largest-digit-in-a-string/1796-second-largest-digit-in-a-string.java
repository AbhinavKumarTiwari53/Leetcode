class Solution {
    public int secondHighest(String s) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        Set<Character> st=new HashSet<>();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c) && !st.contains(c)){
                st.add(c);
                int n=Integer.parseInt(Character.toString(c));
                pq.add(n);
            }
        }
        pq.poll();
        return pq.size()==0?-1:pq.poll();
    }
}