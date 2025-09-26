class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[0], b[0]));
        int ans=1, e=points[0][1];
        for(int i=0;i<points.length;i++) {
            if(e>=points[i][0]) e=Math.min(e,points[i][1]);
            else {ans++; e=points[i][1];}
        }
        return ans;
    }
}