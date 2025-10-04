class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int e : nums){
            freq.put(e,freq.getOrDefault(e,0)+1);
        }
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
            int ele = entry.getKey();
            int fre = entry.getValue();
            pq.add(new int[]{ele, fre});
            if(pq.size() > k){
                pq.poll();
            }
        }
        int res[] = new int[k];
        int idx = 0;
        while(!pq.isEmpty()){
            res[idx++] = pq.poll()[0];
        }
        return res;
    }
}