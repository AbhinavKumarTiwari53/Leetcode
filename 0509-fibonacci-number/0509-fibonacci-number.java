class Solution {
    public int fib(int n) {
        if(n == 0 || n == 1){
            return n;
        }
        int f = 0;
        int s = 1;
        int ans = f + s;
        while(n>1){
            ans = f + s;
            f = s;
            s = ans;
            n--;
        }
        return s;
    }
}