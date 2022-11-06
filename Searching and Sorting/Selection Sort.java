//TC : O(N2)
class Solution{
	int select(int arr[], int i){
        // code here such that selectionSort() sorts arr[]
        int actualMinIdx = i;//we assumed that this index is the index of minimum element 
        for(int j = i + 1; j < arr.length; ++j){
            if(arr[j] < arr[actualMinIdx]){
                actualMinIdx = j;
            }
        }
        
        return actualMinIdx;
	}
	
	void selectionSort(int arr[], int n){
	    for(int i = 0; i < arr.length - 1; ++i){
	        int minIdx = select(arr, i); //finding actual minIdx
	        swap(i, minIdx, arr);
	    }
	}
	
	public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
