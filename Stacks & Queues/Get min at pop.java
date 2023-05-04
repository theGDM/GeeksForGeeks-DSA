class GetMin{
    
    static Stack<Integer> minData;
    static int min;
    //Function to push all the elements into the stack.
    public static Stack<Integer> _push(int arr[],int n){
        // your code here
        Stack<Integer> dataStk = new Stack<>();
        minData = new Stack<>();
        min = Integer.MAX_VALUE;
        for(int i = 0;i < arr.length; ++i){
            dataStk.push(arr[i]);
            if(arr[i] < min){
                min = arr[i];
            }
            minData.push(min);
        }
        return dataStk;
    }
    
    //Function to print minimum value in stack each time while popping.
    static void _getMinAtPop(Stack<Integer>s){
        while(s.size() > 0){
            s.pop();
            System.out.print(minData.pop() + " ");
        }
    }
}
