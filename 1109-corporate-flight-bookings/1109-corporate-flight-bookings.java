class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int a[]=new int[n];
        for(int i[]:bookings){
            int c=i[2];
            int f=i[0];
            int l=i[1];
            while(f<=l){
                a[f-1]+=c;
                f++;
            }
        }
        return a;
    }
}