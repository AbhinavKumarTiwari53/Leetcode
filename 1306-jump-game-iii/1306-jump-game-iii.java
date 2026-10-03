class Solution {
    Set<Integer> s=new HashSet<>();
    public boolean canReach(int[] arr, int start) {
        if(start<0 || start>=arr.length || s.contains(start)) return false;
        if(arr[start]==0) {s.add(start); return true;}
        int s1=start-arr[start];
        int s2=start+arr[start];
        s.add(start);
        return canReach(arr,s1) || canReach(arr,s2);
    }
}