class Solution{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n){ 
        // Your code here
        long[] nge = new long[arr.length];
        Arrays.fill(nge, -1);
        Stack<Integer> stk = new Stack<>();
        for(int i = 0;i < arr.length; ++i){
            while(stk.size() > 0 && arr[stk.peek()] < arr[i]){
                //pop smaller elements to the left
                //the index's value which are stored in stack and whose values are 
                //less than the current index's value will have the nge as current index's value.
                nge[stk.pop()] = arr[i];
            }
            //push yourself to find our own nge to the right
            stk.push(i);
        }
        return nge;
    } 
}
