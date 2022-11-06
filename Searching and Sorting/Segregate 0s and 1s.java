//TC : O(N)
class Solution {
    void segregate0and1(int[] arr, int n) {
        int l = 0;
        int r = 0;
        
        while(r < arr.length){
            if(arr[r] == 1){
                r++;
            }else{
                swap(l, r, arr);
                l++;
                r++;
            }
        }
    }
    
    public void swap(int l, int r, int[] arr){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }

}
