class Solution {
    public int tribonacci(int n) {
        Integer[] l=new Integer[n+1];
        int ans=help(n,l);
        return ans;
    }
    private int help(int n, Integer[] l){
        if(n<=0) return 0;
        if(n==1 || n==2) return 1;
        if(l[n]!=null) return l[n];
        l[n]=help(n-1,l)+help(n-2,l)+help(n-3,l);
        return l[n];
    }
}