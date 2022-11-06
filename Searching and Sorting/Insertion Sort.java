class Solution{
  static void insert(int arr[],int i){
       for(int j = i; j > 0; --j){
           if(arr[j - 1] > arr[j]){
               swap(j - 1, j, arr);
           }else{
               break;
           }
       }
  }
  //Function to sort the array using insertion sort algorithm.
  public void insertionSort(int arr[], int n){
      for(int i = 1; i < arr.length; ++i){
          insert(arr, i);
      }
  }
  
  public static void swap(int i, int j, int[] arr){
       int temp = arr[i];
       arr[i] = arr[j];
       arr[j] = temp;
  }
}
