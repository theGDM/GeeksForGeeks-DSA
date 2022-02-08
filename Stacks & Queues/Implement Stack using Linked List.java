class MyStack {
    StackNode top;
    
    //Function to push an integer into the stack.
    void push(int a) {
        // Add your code here
        StackNode temp = new StackNode(a);
        if(top == null){
            top = temp;
        }else{
            temp.next = top;
            top = temp;
        }
    }
    
    //Function to remove an item from top of the stack.
    int pop(){
        // Add your code here
        if(top == null){
            return -1;
        }else{
            int val = top.data;
            top = top.next;
            return val;
        }
    }
}
