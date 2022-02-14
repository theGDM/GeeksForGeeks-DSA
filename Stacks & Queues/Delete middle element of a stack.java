class Solution{
    //Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer>s,int sizeOfStack){
        Stack<Integer> temp = new Stack<>();
        int n = s.size();
        if(n % 2 == 1){
            while(s.size() > n / 2){
                temp.push(s.pop());
            }
        }else{
            while(s.size() > n / 2 - 1){
               temp.push(s.pop()); 
            }
        }
        temp.pop();
        while(temp.size() > 0){
            s.push(temp.pop());
        }
    } 
}
