class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<int []> ls = new ArrayList<>();
        int[] p=intervals[0];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<=p[1]) p[1]=Math.max(p[1],intervals[i][1]);
            else {ls.add(p);  p=intervals[i];}
        }
        ls.add(p);
        return ls.toArray(new int[ls.size()][]);
    }
}