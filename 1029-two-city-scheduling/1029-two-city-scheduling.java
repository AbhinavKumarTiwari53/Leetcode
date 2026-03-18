class Solution {
    public int twoCitySchedCost(int[][] costs) {
      Arrays.sort(costs,(a,b)->(a[0]-a[1])-(b[0]-b[1]));
        int n=costs.length;
        int sum=0;
        for(int i=0;i<n/2;i++) sum+=costs[i][0]; 
        for(int i=n/2;i<n;i++) sum+=costs[i][1];
        return sum;
    }
}