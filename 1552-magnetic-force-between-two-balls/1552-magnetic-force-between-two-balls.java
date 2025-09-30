class Solution {
    public int maxDistance(int[] arr, int m) {
        Arrays.sort(arr);
        int n=arr.length;
        int ans=0;
        int f=1, l=arr[n-1]-arr[0];
        while(f<=l){
            int mid=f+(l-f)/2;
            if(can(arr,mid,m)) {ans=mid;f=mid+1;}
            else l=mid-1;
        }
        return ans;
    }
    boolean can(int[] arr,int mid,int m){
        int a=arr[0], c=1;
        for(int j=1;j<arr.length;j++){
            if(arr[j]-a>=mid) {c++;
                a=arr[j];
            }
        }
        return c>=m;
    }
}