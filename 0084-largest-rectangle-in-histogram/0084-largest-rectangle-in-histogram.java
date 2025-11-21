class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int ans=0;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<=n;i++) {
            while(!st.isEmpty() && (i==n || heights[st.peek()] > heights[i])) {
                int h= heights[st.pop()];
                int r=i;
                if(!st.isEmpty()){
                    int l=st.peek();
                    int a=h*(r-l-1);
                    ans=Math.max(ans,a);
                }else {
                    int a=h*r;
                    ans=Math.max(ans,a);
                }
            } 
            st.push(i);
        }
        return ans;
    }
}