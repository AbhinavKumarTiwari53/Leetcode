class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        pq.add(1L);
        Set<Long> visited = new HashSet<>();
        visited.add(1L);
        long ugly = 1L;
        int factors[] = {2, 3, 5};
         for(int i = 0 ; i<n ; i++){
            ugly = pq.poll();
            for(int factor : factors){
                if(!visited.contains((long)factor*ugly)){
                    visited.add((long)factor*ugly);
                    pq.add((long)factor*ugly);
                }
            }
        }
        return (int)ugly;
    }
}