class Solution {
    class Pair{
        int freq;
        String str;
        Pair(String str, int freq){
            this.str = str;
            this.freq = freq;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> mp = new HashMap<>();
        for(String w : words){
            mp.put(w, mp.getOrDefault(w, 0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->(a.freq == b.freq)? b.str.compareTo(a.str): a.freq - b.freq);
        for(Map.Entry<String, Integer> e : mp.entrySet()){
            String s = e.getKey();
            int fre = e.getValue();
            pq.add(new Pair(s, fre));
            if(pq.size() > k){
                pq.poll();
            }
        }
        List<String> res = new ArrayList<>();
        while(!pq.isEmpty()){
            res.add(pq.poll().str);
        }
        Collections.reverse(res);
        return res;
    }
}