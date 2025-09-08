class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i =1;i<n;i++){
            int k=n-i;
            if(!String.valueOf(i).contains("0") && !String.valueOf(k).contains("0")) return new int[]{i,k};
        }
        return new int[0];
    }
}