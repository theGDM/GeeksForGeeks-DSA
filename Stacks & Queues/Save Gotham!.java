class Complete{
    // Function for finding maximum and value pair
    public static int save_gotham (int arr[], int n) {
        Stack<Integer> stk = new Stack<>();
        int sum = 0;
        for(int i = arr.length - 1; i >= 0; --i){
            //pop smaller or equal elements at right(in the stack)
            while(stk.size() > 0 && arr[i] >= arr[stk.peek()]){
                stk.pop();
            }
            //if stack is not empty that means the value in the stack is 
            //greter than the current index's value, so it is the nge of 
            //the current index's value
            if(stk.size() > 0){
                sum += arr[stk.peek()];
            }
            
            //push yourself to find your nge to the right
            stk.push(i);
        }
        
        return sum;
    }
}
