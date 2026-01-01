class Solution {
    public int findCenter(int[][] edges) {
        int n=edges.length;
        int c[]=new int[n+2];
        for(int i[]:edges){
            c[i[0]]++;
            c[i[1]]++;
        }
        for(int i=0;i<c.length;i++){
            if(c[i]==n) return i; 
        }
        return -1;
    }
}