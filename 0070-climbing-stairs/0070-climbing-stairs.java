class Solution {
    public int climbStairs(int n) {
        int arr[] = new int[n+1];
        Arrays.fill(arr,-1);
        return dp(n, arr);
    }
    public int dp(int n, int[] arr){
        if( n==1 || n==2 ) return n;
        if(arr[n] != -1) return arr[n];
        arr[n] = dp(n-1,arr) + dp(n-2,arr);
        return arr[n] ;
    }
}