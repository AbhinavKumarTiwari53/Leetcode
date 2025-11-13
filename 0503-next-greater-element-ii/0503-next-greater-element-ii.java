class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int[] res=new int[nums.length];
        Arrays.fill(res,-1);
        int n=nums.length;
        for(int i=0;i<2*n;i++){
            int num=nums[i%n];
            while(!st.isEmpty() && nums[st.peek()]<num){
                res[st.pop()]=num;
            }
            if(i<n) st.push(i);
        }
        return res;
    }
}