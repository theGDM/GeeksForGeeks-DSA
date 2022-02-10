class Solution{
    //Function to calculate the span of stockâ€™s price for all n days.
    public static int[] calculateSpan(int price[], int n){
        //we have to use the concept of nge to the left
        int[] stock = new int[price.length];
        Stack<Integer> stk = new Stack<>();
        for(int i = 0;i < price.length; ++i){
            while(stk.size() > 0 && price[i] >= price[stk.peek()]){
                stk.pop();
            }
            if(stk.size() > 0){
                stock[i] = i - stk.peek(); 
            }else{
                stock[i] = i + 1;
            }
            //push ourself to find our nge to the left
            stk.push(i);
        }
        return stock;
    }
}
