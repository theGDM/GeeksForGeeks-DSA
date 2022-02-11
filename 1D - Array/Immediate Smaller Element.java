class Solution {
    void immediateSmaller(int arr[], int n) {
        for(int i = 0;i < arr.length - 1; ++i){
            if(arr[i + 1] < arr[i]){
                arr[i] = arr[i + 1];
            }else{
                arr[i] = -1;
            }
        }
        arr[arr.length - 1] = -1;
    }
}
