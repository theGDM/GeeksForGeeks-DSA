class MyQueue{
    QueueNode front, rear;
    
    //Function to push an element into the queue.
	void push(int a){
        // Your code here
        QueueNode temp = new QueueNode(a);
        if(rear == null){//0 element
            rear = temp;
            front = temp;
        }else{
            rear.next = temp;
            rear = temp;
        }
	}
	
    //Function to pop front element from the queue.
	int pop(){
        // Your code here
        if(front == null){//0 element
            return -1;
        }else if(front == rear){//1 element
            int val = front.data;
            front = rear = null;
            return val;
        }else{
            int val = front.data;
            front = front.next;
            return val;
        }
	}
}
