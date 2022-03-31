class Solution{
    
    public void construct (int[] nums, int lo, int hi, int[] pre){
        if(lo > hi) 
            return;
        
        int mid = lo + (hi - lo) / 2;
        pre[idx] = nums[mid];
        ++idx;
        construct(nums, lo , mid - 1, pre);
        construct(nums, mid + 1, hi, pre);
    }
    
    int idx = 0;
    public int[] sortedArrayToBST(int[] nums){
        int[] pre = new int[nums.length];
        construct(nums, 0, nums.length - 1, pre);
        return pre;
    }
}
