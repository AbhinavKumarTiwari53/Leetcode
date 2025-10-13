class Solution {
    public int countArrangement(int n) {
        return help(new boolean[n],n);
    }
    int help(boolean b[], int n){
        if(n==1) return 1;
        int c=0;
        for(int i=b.length;i>=1;i--){
            if(!b[i-1] && ((i%n==0)||(n%i==0))){
                b[i-1]=true;
                c+=help(b,n-1);
                b[i-1]=false;
            }
        }
        return c;
    }
}