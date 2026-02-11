class Solution {
    public int totalMoney(int n) {
        int i=1;
        int j=8;
        int sum=28;
        int tsum=0;
        while(n>7){
            tsum+=sum;
            n=n-7;
            sum-=i;
            sum+=j;
            i++;j++;
        }
        while(n>0){
            tsum+=i;
            i++;
            n--;
        }
        return tsum;
    }
}