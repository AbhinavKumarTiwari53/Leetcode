class Solution {
    public int[] plusOne(int[] d) {
        int n=d.length;
        String num=""; 
        int o=0;
        for(int i:d){
            o=o*10+i;
        }
        num+=Integer.toString(o+1);
        int a[]=new int[num.length()];
        int i=0; 
        for(char c:num.toCharArray()){
            a[i++]=Integer.parseInt(Character.toString(c));
        }
        return a;
    }
}