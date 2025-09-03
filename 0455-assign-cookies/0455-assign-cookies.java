class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count=0;
       dualPivotQuickSort(g,0,g.length-1);
       dualPivotQuickSort(s,0,s.length-1);
        for(int i=0,j=0;i<g.length&&j<s.length;){
            if(s[j]>=g[i]){
                count++;
                i++;
                j++;
            }
            else j++;
        }
        return count;
    }
    private  void dualPivotQuickSort(int[] arr,int low,int high){
        if(high-low+1<=47) {
            insertionSort(arr,low,high);
            return;
        }
        if(arr[low]>arr[high]){
            swap(arr,low,high);
        }
        int pivot1=arr[low];
        int pivot2=arr[high];

        int index=low+1;
        int start=low+1;
        int end=high-1;
        while(index<=end){
            if(arr[index]<pivot1){
                swap(arr,index,start);
                start++;
            }else if(arr[index]>pivot2){
                swap(arr,index,end);
                end--;
                index--;
            }
            index++;
        }
        start--;
        end++;
        swap(arr,low,start);
        swap(arr,high,end);
       dualPivotQuickSort(arr,low,start-1);
       if(arr[start]!=arr[end]){
           dualPivotQuickSort(arr,start,end-1);
       }
        dualPivotQuickSort(arr,end+1,high);
    }

    private void insertionSort(int[] arr,int low,int high){
        for(int i=low;i<high;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else break;
            }
        }
    }

    private  void swap(int[] arr,int i,int j){
        if(i!=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}