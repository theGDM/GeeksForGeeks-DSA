//TC : O(nlog(n))
class Solution{
    void merge(int arr[], int l, int mid, int r){
         int i = l;
         int j = mid + 1;
         int f = 0;
         int[] temp = new int[r - l + 1];
         
         while(i <= mid && j <= r){
             if(arr[i] <= arr[j]){
                 temp[f++] = arr[i++];
             }else{
                 temp[f++] = arr[j++];
             }
         }
         
         if(i <= mid){
             while(i <= mid){
                 temp[f++] = arr[i++];
             }
         }
         
         if(j <= r){
             while(j <= r){
                 temp[f++] = arr[j++];
             }
         }
         
         f = 0;
         for(int k = l; k <= r; ++k){
             arr[k] = temp[f];
             f++;
         }
    }
    
    void mergeSort(int arr[], int l, int r){
        if(l == r) return;
        
        int mid = (l + r) / 2;
        
        //faith Calls
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);
        
        merge(arr,l, mid,  r);
    }
}
