class Solution {
    public int leastInterval(char[] tasks, int n) {
        int l=tasks.length;
        int[] fre=new int[26];
        for(char ch:tasks) fre[ch-'A']++;
        Arrays.sort(fre);
        int max=fre[25];
        int c=0;
        for(int i:fre) if(i==max) c++;
        return Math.max(l,(max-1)*(n+1)+c);
    }
}