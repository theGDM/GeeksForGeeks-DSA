class Solution{
    //Function to sort the array using bubble sort algorithm.
	public static void bubbleSort(int arr[], int n){
        for(int itr = 1; itr < arr.length; ++itr){
            int count = 0;
            for(int j = 0; j < arr.length - itr; ++j){
                if(arr[j] > arr[j + 1]){
                    count++;
                    swap(j, j + 1, arr);
                }
            }
            
            if(count == 0) break;
        }
    }
    
    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
