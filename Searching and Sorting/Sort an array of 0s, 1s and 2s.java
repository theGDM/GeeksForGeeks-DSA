//TC : O(N)
class Solution{
    public static void sort012(int arr[], int n){
        // code here 
        int i = 0, j = 0, k = n - 1;
        while(j <= k){
            if(arr[j] == 0){
                swap(i, j, arr);
                i++;
                j++;
            }else if(arr[j] == 1){
                j++;
            }else{
                swap(j, k, arr);
                k--;
            }
        }
    }
    
    public static void swap(int x, int y, int[] arr){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
