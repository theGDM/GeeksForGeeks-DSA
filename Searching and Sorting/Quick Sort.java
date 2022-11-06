class Solution{
    //Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high){
        if(low > high) return;
        
        int pivotIdx = partition(arr, low, high);
        //faith calls
        quickSort(arr, low, pivotIdx - 1);
        quickSort(arr, pivotIdx + 1, high);
    }
    
    static int partition(int arr[], int low, int high){
        int l = low;
        int r = low;
        
        while(r <= high){
            if(arr[r] > arr[high]){
                r++;
            }else{
                swap(l, r, arr);
                l++;
                r++;
            }
        }
        
        return l - 1;
    } 
    
    public static void swap(int l, int r, int[] arr){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
}
