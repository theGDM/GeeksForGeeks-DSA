class Solution{
    //Function to find largest rectangular area possible in a given histogram.
    public static long getMaxArea(long hist[], long n) {
        long[] nser = nextSmallestElementRight(hist);
        long[] nsel = nextSmallestElementLeft(hist);
        
        long maxArea = Integer.MIN_VALUE;
        for(int i = 0;i < hist.length; ++i){
            long currArea = (nser[i] - nsel[i] - 1) * hist[i]; //width * height
            if(currArea > maxArea){
                maxArea = currArea;
            }
        }
        return maxArea;
    }
    
    public static long[] nextSmallestElementRight(long[] arr){
        long[] nser = new long[arr.length];
        Stack<Integer> stk = new Stack<>();
        for(int i = arr.length - 1;i >= 0; --i){
            while(stk.size() > 0 && arr[i] <= arr[stk.peek()]){
                stk.pop();
            }
            
            if(stk.size() > 0){
                nser[i] = stk.peek();
            }else{
                nser[i] = arr.length;
            }
            stk.push(i);
        }
        return nser;
    }
    
    public static long[] nextSmallestElementLeft(long[] arr){
        long[] nsel = new long[arr.length];
        Stack<Integer> stk = new Stack<>();
        for(int i = 0;i < arr.length; ++i){
            while(stk.size() > 0 && arr[i] <= arr[stk.peek()]){
                stk.pop();
            }
            
            if(stk.size() > 0){
                nsel[i] = stk.peek();
            }else{
                nsel[i] = -1;
            }
            stk.push(i);
        }
        return nsel;
    }
}
