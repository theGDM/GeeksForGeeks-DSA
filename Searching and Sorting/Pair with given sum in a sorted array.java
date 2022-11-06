class Solution{
    int Countpair(int arr[], int n, int target){
        int l = 0;
        int r = arr.length - 1;
        int count = 0;
        while(l < r){
            int sum = arr[l] + arr[r];
            
            if(sum == target){
                count++;
                l++; r--;
            }else if(sum > target){
                r--;
            }else{
                l++;
            }
        }
        
        return count == 0 ? -1 : count;
    }   
}
