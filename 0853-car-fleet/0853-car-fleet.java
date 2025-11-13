class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        float a[] = new float[target+1],max=0;
        for(int i=0;i<position.length;i++){
            a[position[i]] = (float)(target-position[i])/speed[i];
        }
        int count=0;
        for(int i=target;i>=0;i--){
            if(a[i]>max){
                count++;
                max=a[i];
            }
        }
        return count;
    }
}